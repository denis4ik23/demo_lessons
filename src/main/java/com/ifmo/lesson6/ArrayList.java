package com.ifmo.lesson6;



import java.util.Iterator;

/**
 * Этот класс должен реализовывать следующие методы: add(), get(), remove() и iterator() из интерфейса List.
 * Если при выполнении add() в массиве нет свободных элементов, то создать новый - вдвое больше,
 * скопировать в него все значения из старого и + 1, который сейчас добавляется.
 * Удаление должно сдвинуть все элементы влево, если это требуется.
 * Например, если список с такими элементами:
 * |0|1|2|3|4|5|
 * Удаляем элемент по индексу 2:
 * |0|1|_|3|4|5|
 * Перемещаем все элементы влево:
 * |0|1|3|4|5|_|
 * Теперь при итерации по ним после 1 будет идти сразу 3, как в связном списке.
 */
public class ArrayList implements List {
    private static final int DEFAULT_SIZE = 10;

    private Object[] values;
    private int size = 0;

    /**
     * Создаёт новый {@link #ArrayList} с размером внутреннего массива по умолчанию.
     */
    public ArrayList() {
        this(DEFAULT_SIZE);
    }

    /**
     * Создаёт новый {@link #ArrayList} с размером внутреннего массива,
     * равного {@code initialSize}.
     *
     * @param initialSize Начальный размер внутреннего массива.
     */
    public ArrayList(int initialSize) {
        values = new Object[initialSize];
    }

    /** {@inheritDoc} */
    @Override
    public void add(Object val) {
        // TODO implement.
        if(size == values.length) {
            resize();
        }
        values[size] = val;
        size++;
    }

    private void resize() { // создаем новый массив и копируем в него старый с новым элементом
        Object[] newValues = new Object[values.length * 2];
        System.arraycopy(values, 0, newValues, 0, size);
        values = newValues;
    }

    /** {@inheritDoc} */
    @Override
    // TODO implement.

    public Object get(int i) {

        if (i >= size) {
            return null;
        } else {
            return values[i];
        }
    }

    /** {@inheritDoc} */
    @Override
    public Object remove(int i) {
        // TODO implement.
        //Object[] tmp = new Object[size];
       // System.arraycopy(values, 0, tmp, 0, i);
        if (i >= size ){
            return null;
        } else {
            Object del = values[i];
//            values[i] = i;
            //size--;
            System.arraycopy(values, i + 1, values, i, size - i - 1);//tmp
            size--;
//            values[size] = null;
            return del;//values[i]
        }
    }

    /** {@inheritDoc} */
    @Override
    public Iterator iterator() {
        // TODO implement.
        Iterator it = new Iterator() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;// && values[currentIndex] != null;
               /* if(currentIndex >= size){
                    return false;
                } else {
                    return true;
                }*/
            }

            @Override
            public Object next() {
                //currentIndex++;
                if (hasNext()) {
                    return values[currentIndex++];//currentIndex - 1
                }

                return null;
            }

        };
        return it;
    }

}
