/**
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.test.databinding;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.observable.map.IMapChangeListener;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.map.MapChangeEvent;
import org.eclipse.core.databinding.observable.map.MapDiff;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;
import org.eclipse.core.databinding.observable.set.SetDiff;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFListProperty.ListElementAccess;
import org.eclipse.emf.databinding.IEMFMapProperty;
import org.eclipse.emf.databinding.IEMFSetProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.test.common.TestUtil;
import org.eclipse.emf.test.databinding.emfdb.A;
import org.eclipse.emf.test.databinding.emfdb.B;
import org.eclipse.emf.test.databinding.emfdb.D;
import org.eclipse.emf.test.databinding.emfdb.E;
import org.eclipse.emf.test.databinding.emfdb.EmfdbFactory;
import org.eclipse.emf.test.databinding.emfdb.EmfdbPackage;
import org.junit.Before;
import org.junit.Test;


public class EMFPropertiesTest
{
  private Resource resource;
  private Realm testRealm;
  private SetDiff<? extends B> setDiff;
  private ListDiff<? extends EObject> listDiff;
  private MapDiff<? extends String, ? extends String> mapDiff;

  public static class Box<T> {
    T value;

    public Box(T value)
    {
      this.value = value;
    }
    
    public Box() {
      this(null);
    }
  }
  
  @Before
  public void setUp() throws Exception
  {
    ResourceSet resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
      Resource.Factory.Registry.DEFAULT_EXTENSION,
      new XMIResourceFactoryImpl());

    URI uri = URI.createFileURI(TestUtil.getPluginDirectory("org.eclipse.emf.test.databinding") + "/model/A.xmi");
    resource = resourceSet.getResource(uri, true);
    testRealm = new Realm()
      {

        @Override
        public boolean isCurrent()
        {
          return true;
        }
      };
  }

  @Test
  public void testFeaturePath()
  {
    assertNotNull(FeaturePath.fromList(EmfdbPackage.Literals.A__BLIST));
    try
    {
      FeaturePath.fromList(EmfdbPackage.Literals.A__BLIST, EmfdbPackage.Literals.B__STRING);
      fail("Traversing list feature");
    }
    catch (IllegalArgumentException e)
    {
      // Ignore
    }
  }

  @Test
  public void testResourceProperty()
  {
    Realm.runWithDefault(testRealm, new Runnable()
      {

        public void run()
        {
          _testResourceProperty();
        }
      });
  }

  private void _testResourceProperty()
  {
    IListProperty<Resource, EObject> prop = EMFProperties.resource();
    IObservableList<EObject> list = prop.observe(resource);
    list.addListChangeListener(new IListChangeListener<EObject>()
      {

        public void handleListChange(ListChangeEvent<? extends EObject> event)
        {
          listDiff = event.diff;
        }
      });
    assertNull(listDiff);

    // Adding
    A a = EmfdbFactory.eINSTANCE.createA();
    A a1 = EmfdbFactory.eINSTANCE.createA();

    resource.getContents().add(a);
    assertNotNull(listDiff);
    assertEquals(1, listDiff.getDifferences().length);
    assertSame(a, listDiff.getDifferences()[0].getElement());
    assertEquals(1, listDiff.getDifferences()[0].getPosition());
    assertTrue(listDiff.getDifferences()[0].isAddition());

    // Moving
    resource.getContents().move(0, a);
    assertEquals(2, listDiff.getDifferences().length);
    assertFalse(listDiff.getDifferences()[0].isAddition()); // Removal
    assertEquals(1, listDiff.getDifferences()[0].getPosition());
    assertTrue(listDiff.getDifferences()[1].isAddition()); // Addition
    assertEquals(0, listDiff.getDifferences()[1].getPosition());

    // Removing
    resource.getContents().remove(a);
    assertEquals(1, listDiff.getDifferences().length);
    assertFalse(listDiff.getDifferences()[0].isAddition()); // Removal
    assertEquals(0, listDiff.getDifferences()[0].getPosition());

    // Adding many
    resource.getContents().addAll(Arrays.asList(a, a1));
    assertEquals(2, listDiff.getDifferences().length);

    // Remove many
    resource.getContents().removeAll(Arrays.asList(a, a1));
    assertEquals(2, listDiff.getDifferences().length);

    // =============================================================

    // Changed through IObservableList
    // Add
    list.add(a);
    assertNotNull(listDiff);
    assertEquals(1, listDiff.getDifferences().length);
    assertSame(a, listDiff.getDifferences()[0].getElement());
    assertEquals(1, listDiff.getDifferences()[0].getPosition());
    assertTrue(listDiff.getDifferences()[0].isAddition());

    // Moving
    list.move(1, 0);
    assertEquals(2, listDiff.getDifferences().length);
    assertFalse(listDiff.getDifferences()[0].isAddition()); // Removal
    assertEquals(1, listDiff.getDifferences()[0].getPosition());
    assertTrue(listDiff.getDifferences()[1].isAddition()); // Addition
    assertEquals(0, listDiff.getDifferences()[1].getPosition());

    // Removing
    list.remove(a);
    assertEquals(1, listDiff.getDifferences().length);
    assertFalse(listDiff.getDifferences()[0].isAddition()); // Removal
    assertEquals(0, listDiff.getDifferences()[0].getPosition());

    // Adding many
    list.addAll(Arrays.asList(a, a1));
    assertEquals(2, listDiff.getDifferences().length);

    // Remove many
    list.removeAll(Arrays.asList(a, a1));
    assertEquals(2, listDiff.getDifferences().length);
  }

  @Test
  public void testSetProperty()
  {
    Realm.runWithDefault(testRealm, new Runnable()
      {

        public void run()
        {
          _testSetProperty();
        }
      });
  }

  public void _testSetProperty()
  {
    A a = (A)resource.getContents().get(0);
    IEMFSetProperty<A, B>  prop = EMFProperties.set(EmfdbPackage.Literals.A__BLIST);
    IObservableSet<B> set = prop.observe(a);
    assertNotNull(set);
    set.addSetChangeListener(new ISetChangeListener<B>()
      {

        public void handleSetChange(SetChangeEvent<? extends B> event)
        {
          setDiff = event.diff;
        }
      });
    assertNull(setDiff);
    B b = EmfdbFactory.eINSTANCE.createB();
    a.getBlist().add(b);
    assertNotNull(setDiff);
    assertEquals(1, setDiff.getAdditions().size());
    assertSame(b, setDiff.getAdditions().iterator().next());
  }

  @Test
  public void testListPropertyOnSingleFeature()
  {
    Realm.runWithDefault(testRealm, new Runnable()
      {

        public void run()
        {
          _testListPropertyOnSingleFeature();
        }
      });
  }

  public void _testListPropertyOnSingleFeature()
  {
    A a = (A)resource.getContents().get(0);
    IEMFListProperty<A, String> prop = EMFProperties.singletonList(EmfdbPackage.Literals.A__STRING);
    IObservableList<String> l = prop.observe(a);
    assertEquals(1, l.size());
    assertEquals("Instance 1", l.get(0));
    a.setString("Bla");
    assertEquals("Bla", l.get(0));
    l.addListChangeListener(new IListChangeListener<String>()
      {
        @Override
        public void handleListChange(ListChangeEvent<? extends String> event)
        {
          assertEquals(2, event.diff.getDifferences().length);

          assertEquals(0, event.diff.getDifferences()[0].getPosition());
          assertFalse(event.diff.getDifferences()[0].isAddition());
          assertEquals("Bla", event.diff.getDifferences()[0].getElement());

          assertEquals(0, event.diff.getDifferences()[1].getPosition());
          assertTrue(event.diff.getDifferences()[1].isAddition());
          assertEquals("Instance 1", event.diff.getDifferences()[1].getElement());
        }
      });
    a.setString("Instance 1");
  }

  @Test
  public void testListElementProperty()
  {
    Realm.runWithDefault(testRealm, new Runnable()
      {

        public void run()
        {
          _testListElementProperty();
        }
      });
  }

  public void _testListElementProperty()
  {
    IEMFListProperty<A, B> prop = EMFProperties.list(EmfdbPackage.Literals.A__BLIST);
    IEMFValueProperty<A, B> valueProp = prop.value(new ListElementAccess<B>()
      {

        @Override
        public int getReadValueIndex(List<B> list)
        {
          return 0;
        }

        @Override
        public int getWriteValueIndex(List<B> list)
        {
          return 0;
        }
      });

    IEMFValueProperty<A, String> detailValue = valueProp.value(EmfdbPackage.Literals.B__STRING);

    IObservableValue<String> value = detailValue.observe((A) resource.getContents().get(0));
    assertEquals("Instance 1", value.getValue());
    A a = (A)resource.getContents().get(0);
    a.getBlist().get(0).setString("Bla Bla");
    assertEquals("Bla Bla", value.getValue());

    B b = EmfdbFactory.eINSTANCE.createB();
    b.setString("New Element");

    a.getBlist().add(0, b);
    assertEquals("New Element", value.getValue());

    b = EmfdbFactory.eINSTANCE.createB();
    b.setString("New Element 2");
    IObservableValue<B> aObservable = valueProp.observe(a);
    try
    {
      aObservable.setValue(b);
    }
    finally
    {
      aObservable.dispose();
    }

    assertEquals("New Element 2", value.getValue());
  }

  @Test
  public void testMapProperty()
  {
    Realm.runWithDefault(testRealm, new Runnable()
      {

        public void run()
        {
          _testMapProperty();
        }
      });
  }

  @SuppressWarnings("unchecked")
  public void _testMapProperty()
  {
    A a = (A)resource.getContents().get(0);
    IEMFMapProperty<A, String, String> prop = EMFProperties.map(EmfdbPackage.Literals.A__CMAP);
    IObservableMap<String, String> map = prop.observe(a);
    map.addMapChangeListener(new IMapChangeListener<String, String>()
      {

        public void handleMapChange(MapChangeEvent<? extends String, ? extends String> event)
        {
          mapDiff = event.diff;
        }
      });
    assertNull(mapDiff);

    // Changing existing key
    a.getCmap().put("key 1", "value 1 modified");
    assertEquals(0, mapDiff.getAddedKeys().size());
    assertEquals(1, mapDiff.getChangedKeys().size());
    assertEquals("key 1", mapDiff.getChangedKeys().iterator().next());
    assertEquals("value 1", mapDiff.getOldValue("key 1"));
    assertEquals("value 1 modified", mapDiff.getNewValue("key 1"));
    assertEquals(0, mapDiff.getRemovedKeys().size());

    // Adding new key
    a.getCmap().put("key 3", "value 3");
    assertEquals(1, mapDiff.getAddedKeys().size());
    assertEquals("key 3", mapDiff.getAddedKeys().iterator().next());
    assertNull(mapDiff.getOldValue("key 3"));
    assertEquals("value 3", mapDiff.getNewValue("key 3"));
    assertEquals(0, mapDiff.getChangedKeys().size());
    assertEquals(0, mapDiff.getRemovedKeys().size());

    // Removing key
    a.getCmap().removeKey("key 2");
    assertEquals(0, mapDiff.getAddedKeys().size());
    assertEquals(0, mapDiff.getChangedKeys().size());
    assertEquals(1, mapDiff.getRemovedKeys().size());
    assertEquals("key 2", mapDiff.getRemovedKeys().iterator().next());
    assertEquals("value 2", mapDiff.getOldValue("key 2"));
    assertNull(mapDiff.getNewValue("key 2"));

    // putAll is implemented as a series of put calls,
    // which are already tested above, see BasicEMap.putAll()

    // Removing many keys
    a.getCmap().clear();
    assertEquals(0, mapDiff.getAddedKeys().size());
    assertEquals(0, mapDiff.getChangedKeys().size());
    assertEquals(2, mapDiff.getRemovedKeys().size());
    assertTrue(mapDiff.getRemovedKeys().contains("key 1"));
    assertTrue(mapDiff.getRemovedKeys().contains("key 3"));
    assertEquals("value 1 modified", mapDiff.getOldValue("key 1"));
    assertEquals("value 3", mapDiff.getOldValue("key 3"));
    assertNull(mapDiff.getNewValue("key 1"));
    assertNull(mapDiff.getNewValue("key 3"));

    // =============================================================

    // Changed through IObservableMap
    // Adding new key
    map.put("key 1", "value 1");
    assertEquals(1, mapDiff.getAddedKeys().size());
    assertEquals("key 1", mapDiff.getAddedKeys().iterator().next());
    assertNull(mapDiff.getOldValue("key 1"));
    assertEquals("value 1", mapDiff.getNewValue("key 1"));
    assertEquals(0, mapDiff.getChangedKeys().size());
    assertEquals(0, mapDiff.getRemovedKeys().size());

    // Adding many (including existing) keys
    Map<String, String> newValues = new HashMap<String, String>();
    newValues.put("key 1", "value 1 modified");
    newValues.put("key 2", "value 2");
    newValues.put("key 3", "value 3");
    map.putAll(newValues);
    assertEquals(2, mapDiff.getAddedKeys().size());
    assertTrue(mapDiff.getAddedKeys().contains("key 2"));
    assertTrue(mapDiff.getAddedKeys().contains("key 3"));
    assertNull(mapDiff.getOldValue("key 2"));
    assertNull(mapDiff.getOldValue("key 3"));
    assertEquals("value 2", mapDiff.getNewValue("key 2"));
    assertEquals("value 3", mapDiff.getNewValue("key 3"));
    assertEquals(1, mapDiff.getChangedKeys().size());
    assertEquals("key 1", mapDiff.getChangedKeys().iterator().next());
    assertEquals("value 1", mapDiff.getOldValue("key 1"));
    assertEquals("value 1 modified", mapDiff.getNewValue("key 1"));
    assertEquals(0, mapDiff.getRemovedKeys().size());

    // Removing
    map.remove("key 1");
    assertEquals(0, mapDiff.getAddedKeys().size());
    assertEquals(0, mapDiff.getChangedKeys().size());
    assertEquals(1, mapDiff.getRemovedKeys().size());
    assertEquals("key 1", mapDiff.getRemovedKeys().iterator().next());
    assertEquals("value 1 modified", mapDiff.getOldValue("key 1"));
    assertNull(mapDiff.getNewValue("key 1"));

    // Removing many
    // The only way to remove many entries from IObservableMap is
    // to call clear(), but clear removes entries one by one, which
    // has already been tested above
    map.clear();
  }

  @Test
  public void test_sublistElement()
  {
    Realm.runWithDefault(testRealm, new Runnable()
    {

      public void run()
      {
        _test_sublistElement();
      }
    });
  }

  public void _test_sublistElement()
  {
    A a = (A)resource.getContents().get(0);
    IEMFListProperty<A, B> lProp1 = EMFProperties.list(EmfdbPackage.Literals.A__BLIST);
    IEMFValueProperty<A, B> vProp1 = lProp1.value(new ListElementAccess<B>()
      {
        @Override
        public int getReadValueIndex(List<B> list)
        {
          return 0;
        }

        @Override
        public int getWriteValueIndex(List<B> list)
        {
          return WriteData.NO_INDEX;
        }
      });

    IEMFValueProperty<A, D> vProp2 = vProp1.value(EmfdbPackage.Literals.B__D);
    IEMFListProperty<A, E> lProp2 = vProp2.list(EmfdbPackage.Literals.D__ELIST);

    IEMFValueProperty<A, E>  vProp3 = lProp2.value(new ListElementAccess<E>()
      {
        @Override
        public int getReadValueIndex(List<E> list)
        {
          return list.size() - 1;
        }

        @Override
        public int getWriteValueIndex(List<E> list)
        {
          return WriteData.NO_INDEX;
        }
      });


    IEMFValueProperty<A, String> detailValue = vProp3.value(EmfdbPackage.Literals.E__NAME);
    IObservableValue<String> v = detailValue.observe(a);
    assertEquals(v.getValue(), "Last Element");
  }
}
