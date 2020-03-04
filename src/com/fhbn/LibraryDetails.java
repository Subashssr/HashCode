package com.fhbn;

import java.util.ArrayList;
import java.util.List;

class LibraryDetails {
    int noBooks, signUp, ship;
    List<Integer> books = new ArrayList<>();

    public int getNoBooks() {
        return noBooks;
    }

    public void setNoBooks(int noBooks) {
        this.noBooks = noBooks;
    }

    public int getSignUp() {
        return signUp;
    }

    public void setSignUp(int signUp) {
        this.signUp = signUp;
    }

    public int getShip() {
        return ship;
    }

    public void setShip(int ship) {
        this.ship = ship;
    }

    public List<Integer> getBooks() {
        return books;
    }

    public void setBooks(List<Integer> books) {
        this.books = books;
    }
}
