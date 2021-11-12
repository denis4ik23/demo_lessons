package com.ifmo.lesson4;

public class MainLib {

    public static void main(String[] args) {

        Library library = new com.ifmo.lesson4.Library(3);

        System.out.println(library.put(new Book("Stephen King", "Shining"), 2));

        System.out.println(library.put(new Book("Stephen King", "Dark Tower"), 3));

        // Эту книгу добавить не можем, т.к. лимит 2
        System.out.println(library.put(new Book("Tolstoy", "War and peace"), 6));
        System.out.println(library.take(new Book("Tolstoy", "War and peace"), 16));
        System.out.println(library.take(new Book("Tolstoy", "War and peace"), 16));
        System.out.println(library.put(new Book("Tolstoy2", "War and peace"), 16));

        // Забираем все книги Тёмной башни, чтобы освободить место.
        library.take(new Book("Stephen King", "Dark Tower"), 3);

        // Теперь мы можем успешно добавить "Войну и мир".
        library.put(new Book("Tolstoy", "War and peace"), 6);
    }
}
