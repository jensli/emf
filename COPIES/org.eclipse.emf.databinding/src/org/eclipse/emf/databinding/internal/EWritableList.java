/**
 * Copyright (c) 2009 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Tom Schindl<tom.schindl@bestsolution.at> - Initial API and implementation in 262160
 */
package org.eclipse.emf.databinding.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.ObservableTracker;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.AbstractObservableList;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.observable.list.ListDiffEntry;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.NotifyingList;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;


/**
 * Writable list which can be used to observe an {@link NotifyingList}
 * 
 * <p><b>PROVISIONAL:</b> This API is subject to arbitrary change, including renaming or removal.</p>
 * 
 * @param <Type> the type
 * @since 2.5
 */
public class EWritableList<T> extends AbstractObservableList<T> implements IObservableList<T>
{
  private NotifyingList<T> wrappedList;
  private Object elementType;
  private boolean stale = false;

  private class Listener extends AdapterImpl
  {
    private Object feature;

    public Listener(Object feature)
    {
      this.feature = feature;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void notifyChanged(Notification msg)
    {

      if (feature == null && msg.getFeature() == null && msg.getFeatureID(Resource.class) != Resource.RESOURCE__CONTENTS)
      {
        return;
      }

      if (feature == msg.getFeature() && !msg.isTouch())
      {
        final ListDiff<T> diff;
        switch (msg.getEventType())
        {
          case Notification.ADD: {
            diff = Diffs.createListDiff(Diffs.createListDiffEntry(msg.getPosition(), true, (T) msg.getNewValue()));
            // fireListChange(diff);
            break;
          }
          case Notification.ADD_MANY: {
            Collection< T > newValues = (Collection< T >)msg.getNewValue();
            ListDiffEntry<T>[] listDiffEntries = new ListDiffEntry [newValues.size()];
            int position = msg.getPosition();
            int index = 0;
            for (T newValue : newValues)
            {
              listDiffEntries[index++] = Diffs.createListDiffEntry(position++, true, newValue);
            }
            diff = Diffs.createListDiff(listDiffEntries);
            // fireListChange(diff);
            break;
          }
          case Notification.REMOVE: {
            diff = Diffs.createListDiff(Diffs.createListDiffEntry(msg.getPosition(), false, (T) msg.getOldValue()));
            // fireListChange(diff);
            break;
          }
          case Notification.REMOVE_MANY: {
            Collection< T > oldValues = (Collection< T >)msg.getOldValue();
            ListDiffEntry<T>[] listDiffEntries = new ListDiffEntry [oldValues.size()];
            int position = msg.getPosition();
            int index = 0;
            for (T oldValue : oldValues)
            {
              listDiffEntries[index++] = Diffs.createListDiffEntry(position++, false, oldValue);
            }
            diff = Diffs.createListDiff(listDiffEntries);
            // fireListChange(diff);
            break;
          }
          case Notification.MOVE: {
            T movedValue = (T) msg.getNewValue();
            ListDiffEntry<T>[] listDiffEntries = new ListDiffEntry [2];
            listDiffEntries[0] = Diffs.createListDiffEntry((Integer)msg.getOldValue(), false, movedValue);
            listDiffEntries[1] = Diffs.createListDiffEntry(msg.getPosition(), true, movedValue);
            diff = Diffs.createListDiff(listDiffEntries);
            // fireListChange(diff);
            break;
          }
          case Notification.UNSET: {
            // This just represents going back to the unset state, but
            // that doesn't affect the contents of the list.
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

        // System.err.println("CHANGE: " +
        // diff.getDifferences()[0].getElement());

        // fireListChange(diff);
        // listener.handlePropertyChange(new SimplePropertyEvent(msg
        // .getNotifier(), EMFListProperty.this, diff));
      }
    }

  }

  private Adapter listener;

  /**
   * New writable list wrapping the {@link NotifyingList}
   * 
   * @param wrappedList
   *            the wrapped list
   */
  public EWritableList(NotifyingList<T> wrappedList)
  {
    this(Realm.getDefault(), wrappedList);
  }

  /**
   * New writable list wrapping the {@link NotifyingList} and using the
   * {@link Realm}
   * 
   * @param realm
   *            the realm
   * @param wrappedList
   *            the wrapped list
   */
  public EWritableList(Realm realm, NotifyingList<T> wrappedList)
  {
    this(realm, wrappedList, null);
  }

  /**
   * New writable list wrapping the {@link NotifyingList}
   * 
   * @param realm
   *            the realm
   * @param wrappedList
   *            the wrapped list
   * @param elementType
   *            the element type
   */
  public EWritableList(Realm realm, NotifyingList<T> wrappedList, Class<T> elementType)
  {
    super(realm);
    this.wrappedList = wrappedList;
    this.elementType = elementType;
  }

  @Override
  protected void firstListenerAdded()
  {
    if (wrappedList.getNotifier() instanceof Notifier)
    {
      Notifier notifier = (Notifier)wrappedList.getNotifier();
      listener = new Listener(wrappedList.getFeature());
      notifier.eAdapters().add(listener);
    }
    else
    {
      throw new IllegalArgumentException("Wrapped list must have a notifier attached!");
    }
  }

  @Override
  protected void lastListenerRemoved()
  {
    if (wrappedList.getNotifier() instanceof Notifier)
    {
      Notifier notifier = (Notifier)wrappedList.getNotifier();
      listener = new Listener(wrappedList.getFeature());
      notifier.eAdapters().remove(listener);
    }
    else
    {
      throw new IllegalArgumentException("Wrapped list must have a notifier attached!");
    }
  }

  @Override
  public synchronized void dispose()
  {
    super.dispose();
  }

  private void getterCalled()
  {
    ObservableTracker.getterCalled(this);
  }

  @Override
  @SuppressWarnings("unchecked")
  public boolean add(Object o)
  {
    checkRealm();
    return wrappedList.add((T)o);
  }

  @Override
  @SuppressWarnings({"unchecked", "rawtypes"})
  public boolean addAll(Collection c)
  {
    checkRealm();
    return wrappedList.addAll(c);
  }

  @Override
  @SuppressWarnings({"unchecked", "rawtypes"})
  public boolean addAll(int index, Collection c)
  {
    checkRealm();
    return wrappedList.addAll(index, c);
  }

  @Override
  public boolean contains(Object o)
  {
    getterCalled();
    return wrappedList.contains(o);
  }

  @Override
  @SuppressWarnings("rawtypes")
  public boolean containsAll(Collection c)
  {
    getterCalled();
    return wrappedList.containsAll(c);
  }

  @Override
  public T get(int index)
  {
    getterCalled();
    return wrappedList.get(index);
  }

  public Object getElementType()
  {
    checkRealm();
    return elementType;
  }

  @Override
  public int indexOf(Object o)
  {
    getterCalled();
    return wrappedList.indexOf(o);
  }

  @Override
  public boolean isEmpty()
  {
    getterCalled();
    return wrappedList.isEmpty();
  }

  @Override
  public Iterator<T> iterator()
  {
    getterCalled();
    return wrappedList.iterator();
  }

  @Override
  public int lastIndexOf(Object o)
  {
    getterCalled();
    return wrappedList.lastIndexOf(o);
  }

  @Override
  public ListIterator<T> listIterator()
  {
    getterCalled();
    return wrappedList.listIterator();
  }

  @Override
  public ListIterator<T> listIterator(int index)
  {
    getterCalled();
    return wrappedList.listIterator(index);
  }

  @Override
  public T move(int oldIndex, int newIndex)
  {
    checkRealm();
    return wrappedList.move(oldIndex, newIndex);
  }

  @Override
  public boolean remove(Object o)
  {
    checkRealm();
    return wrappedList.remove(o);
  }

  @Override
  public T remove(int index)
  {
    checkRealm();
    return wrappedList.remove(index);
  }

  @Override
  @SuppressWarnings("rawtypes")
  public boolean removeAll(Collection c)
  {
    checkRealm();
    return wrappedList.removeAll(c);
  }

  @Override
  @SuppressWarnings("rawtypes")
  public boolean retainAll(Collection c)
  {
    checkRealm();
    return wrappedList.retainAll(c);
  }

  @Override
  @SuppressWarnings("unchecked")
  public Object set(int index, Object element)
  {
    checkRealm();
    return wrappedList.set(index, (T)element);
  }

  @Override
  public int doGetSize()
  {
    getterCalled();
    return wrappedList.size();
  }

  @Override
  public List<T> subList(int fromIndex, int toIndex)
  {
    getterCalled();
    return wrappedList.subList(fromIndex, toIndex);
  }

  @Override
  public Object[] toArray()
  {
    getterCalled();
    return wrappedList.toArray();
  }

  @Override
  public <R> R[] toArray(R[] a)
  {
    getterCalled();
    return (R[]) wrappedList.toArray(a);
  }

  @Override
  @SuppressWarnings("unchecked")
  public void add(int index, Object element)
  {
    checkRealm();
    wrappedList.add(index, (T)element);
  }

  @Override
  public void clear()
  {
    checkRealm();
    wrappedList.clear();
  }

  @Override
  public boolean isStale()
  {
    getterCalled();
    return stale;
  }

  // public void setStale(boolean stale) {
  // checkRealm();
  //
  // boolean wasStale = this.stale;
  // this.stale = stale;
  // if (!wasStale && stale) {
  // fireStale();
  // }
  // }
}
