package com.ifmo.lesson6;

import java.util.Iterator;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList implements List, Stack, Queue {
    /** Ссылка на первый элемент списка. */
    private Item head;

    /** {@inheritDoc} */
    @Override
    public void add(Object val) {
        // TODO implement.
        Item item = new Item(val);

        if (head == null) {
            head = item;
        } else {
            Item current = head;
            while (true) {
                if (current.next == null) {
                    current.next = item;
                    break;
                }
                current = current.next;
            }
        }

    }

    /** {@inheritDoc} */
    @Override
    public Object take() {
        // TODO implement.

        return remove(0);
    }

    /** {@inheritDoc} */
    @Override
    public Object get(int i) {
        // TODO implement.
        Item current = head;
        for (int cnt = 0; current != null; cnt++) {
            if (cnt == i) {
                return current.value;
            }
            current = current.next;
        }

        return null;

    }

    /** {@inheritDoc} */
    @Override
    public Object remove(int i) {
        // TODO implement.
        if (head == null)
            return null;

        if (i == 0) {
            Object val = head.value;
            head = head.next;
            return val;
        }

        Item previous = head;
        for (int cnt = 0; previous != null; cnt++) {
            if (cnt + 1 == i) {
                if (previous.next == null) {
                    return null;
                }

                Item current = previous.next;
                Object val = current.value;
                previous.next = current.next;
                return val;
            }
            previous = previous.next;
        }

        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Iterator iterator() {
        // TODO implement.

       Iterator it = new Iterator() {

            Item current = head;

            @Override
            public boolean hasNext() {
                if (current != null){
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Object next() {
                if(!this.hasNext()){
                    return null;
                } else {
                    Item current = this.current;
                    this.current = current.next;
                    return current.value;
                }
            }

        };
        return it;
    }

    /** {@inheritDoc} */
    @Override
    public void push(Object value) {
        // TODO implement.
        this.add(value);
    }

    /** {@inheritDoc} */
    @Override
    public Object pop() {
        // TODO implement.
        if (head == null){
            return null;
        } else if (head.next == null){
            Item current = head;
            head = null;
            return current.value;
        } else {
            Item current = head.next;
            Item last = head;
            while (current.next !=null){
                last = current;
                current = current.next;
            }
            last.next = null;
            return current.value;
        }
    }
}
