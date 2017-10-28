/**
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.databinding;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.IObserving;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.observable.list.ListDiffEntry;
import org.eclipse.core.databinding.observable.list.ObservableList;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * <p><b>PROVISIONAL:</b> This API is subject to arbitrary change, including renaming or removal.</p>
 */
public class EObjectObservableList<E> extends ObservableList<E> implements IObserving, InternalRawEList<E>
{
  /**
   * The object owning the feature
   */
  protected EObject eObject;
  /**
   * The structural feature
   */
  protected EStructuralFeature<?, ? extends List<E>> eStructuralFeature;
  /**
   * The listener attached
   */
  protected Adapter listener;

  /**
   * Observe a list feature using a default realm
   * 
   * @param eObject
   *            the object instance
   * @param eStructuralFeature
   *            the feature
   */
  public <S extends EObject> EObjectObservableList(S eObject, EStructuralFeature<? super S, ? extends List<E>> eStructuralFeature)
  {
    this(Realm.getDefault(), eObject, eStructuralFeature);
  }

  /**
   * Observe a list feature using a custom realm
   * 
   * @param realm
   *            the realm
   * 
   * @param eObject
   *            the object instance
   * @param eStructuralFeature
   *            the feature
   */
  public <S extends EObject> EObjectObservableList(Realm realm, S eObject, EStructuralFeature<? super S, ? extends List<E>> eStructuralFeature)
  {
    super(realm, eObject.eGet(eStructuralFeature), eStructuralFeature);
    this.eObject = eObject;
    this.eStructuralFeature = eStructuralFeature;
  }

  @Override
  protected void firstListenerAdded()
  {
    listener = new AdapterImpl()
      {
        @SuppressWarnings("unchecked")
        @Override
        public void notifyChanged(Notification notification)
        {
          if (eStructuralFeature == notification.getFeature() && !notification.isTouch())
          {
            final ListDiff<E> diff;
            switch (notification.getEventType())
            {
              case Notification.ADD: {
                diff = Diffs.createListDiff(Diffs.createListDiffEntry(notification.getPosition(), true, (E) notification.getNewValue()));
                break;
              }
              case Notification.ADD_MANY: {
                Collection< ? > newValues = (Collection< ? >)notification.getNewValue();
                ListDiffEntry< E >[] listDiffEntries = new ListDiffEntry [newValues.size()];
                int position = notification.getPosition();
                int index = 0;
                for (Object newValue : newValues)
                {
                  listDiffEntries[index++] = Diffs.createListDiffEntry(position++, true, (E) newValue);
                }
                diff = Diffs.createListDiff(listDiffEntries);
                break;
              }
              case Notification.REMOVE: {
                diff = Diffs.createListDiff(Diffs.createListDiffEntry(notification.getPosition(), false, (E) notification.getOldValue()));
                break;
              }
              case Notification.REMOVE_MANY: {
                Collection< ? > oldValues = (Collection< ? >)notification.getOldValue();
                ListDiffEntry<E>[] listDiffEntries = new ListDiffEntry [oldValues.size()];
                int position = notification.getPosition();
                int index = 0;
                for (Object oldValue : oldValues)
                {
                  listDiffEntries[index++] = Diffs.createListDiffEntry(position++, false, (E) oldValue);
                }
                diff = Diffs.createListDiff(listDiffEntries);
                break;
              }
              case Notification.SET:
              case Notification.RESOLVE: {
                ListDiffEntry<E>[] listDiffEntries = new ListDiffEntry [2];
                listDiffEntries[0] = Diffs.createListDiffEntry(notification.getPosition(), false, (E) notification.getOldValue());
                listDiffEntries[1] = Diffs.createListDiffEntry(notification.getPosition(), true, (E) notification.getNewValue());
                diff = Diffs.createListDiff(listDiffEntries);
                break;
              }
              case Notification.MOVE: {
                Object movedValue = notification.getNewValue();
                ListDiffEntry<E>[] listDiffEntries = new ListDiffEntry [2];
                listDiffEntries[0] = Diffs.createListDiffEntry((Integer)notification.getOldValue(), false, (E) movedValue);
                listDiffEntries[1] = Diffs.createListDiffEntry(notification.getPosition(), true, (E) movedValue);
                diff = Diffs.createListDiff(listDiffEntries);
                break;
              }
              case Notification.UNSET: {
                // This just represents going back to the unset state,
                // but that doesn't affect the contents of the list.
                //
                return;
              }
              default: {
                throw new RuntimeException("unhandled case");
              }
            }
            getRealm().exec(new Runnable()
              {
                public void run()
                {
                  fireListChange(diff);
                }
              });
          }
        }
      };
    eObject.eAdapters().add(listener);
  }

  @Override
  protected void lastListenerRemoved()
  {
    eObject.eAdapters().remove(listener);
    listener = null;
  }

  @Override
  public synchronized void dispose()
  {
    if (listener != null)
    {
      eObject.eAdapters().remove(listener);
      listener = null;
    }
    eObject = null;
    eStructuralFeature = null;
    super.dispose();
  }

  /**
   * @return the wrapped list
   */
  protected final List<E> wrappedList()
  {
    return wrappedList;
  }

  public Object getObserved()
  {
    return eObject;
  }

  @Override
  public boolean add(E object)
  {
    checkRealm();
    return wrappedList().add(object);
  }

  @Override
  public void add(int index, E object)
  {
    checkRealm();
    wrappedList().add(index, object);
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public boolean addAll(Collection collection)
  {
    checkRealm();
    return wrappedList().addAll(collection);
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public boolean addAll(int index, Collection collection)
  {
    checkRealm();
    return wrappedList().addAll(index, collection);
  }

  @Override
  public E set(int index, E element)
  {
    checkRealm();
    return wrappedList().set(index, element);
  }

  @Override
  public E remove(int index)
  {
    checkRealm();
    return wrappedList.remove(index);
  }

  @Override
  public boolean remove(Object element)
  {
    checkRealm();
    return wrappedList.remove(element);
  }

  @Override
  public boolean removeAll(Collection<?> collection)
  {
    checkRealm();
    return wrappedList().removeAll(collection);
  }

  @SuppressWarnings("rawtypes")
  @Override
  public boolean retainAll(Collection collection)
  {
    checkRealm();
    return wrappedList().retainAll(collection);
  }

  @Override
  public void clear()
  {
    checkRealm();
    wrappedList.clear();
  }

  @Override
  public E move(int newPosition, int oldPosition)
  {
    checkRealm();
    return ((EList <E> )wrappedList).move(newPosition, oldPosition);
  }

  public void move(int newPosition, Object object)
  {
    move(newPosition, indexOf(object));
  }

  @Override
  public String toString()
  {
    StringBuilder result = new StringBuilder(getClass().getName());
    result.append('@');
    result.append(Integer.toHexString(hashCode()));

    result.append(" (eObject:");
    result.append(eObject);
    result.append(")");

    result.append(" (eStructuralFeature: ");
    result.append(eStructuralFeature);
    result.append(")");

    result.append(" (wrappedList: ");
    result.append(wrappedList);
    result.append(")");

    return result.toString();
  }
}

interface InternalRawEList<E> extends EList<E>
{
  // This is only at avoid needing an @SuppressWarnings("rawtypes") on the
  // EMFObservableList
}