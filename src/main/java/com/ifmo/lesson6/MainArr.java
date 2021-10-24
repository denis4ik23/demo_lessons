package com.ifmo.lesson6;

import java.util.Iterator;

public class MainArr {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            list.add(9);
            list.add(10);
            list.add(11);

            System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        list.remove(9);

        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println(list.get(7));
        System.out.println();

        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next + " ");
        }

    }

}
