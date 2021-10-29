package com.ifmo.lesson4;

import java.util.Objects;

public class Shelf {
    private Book book;

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public Shelf(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    private int quantity;

    public void setBook(Book book) {
        this.book = book;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
