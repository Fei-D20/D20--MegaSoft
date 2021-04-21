package com.model;

import javafx.collections.ObservableList;

import java.util.List;

/**
 * @ author Fei Gu
 * @ create 2021-04-21-13.21
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public class Library implements LibraryInterface , BookRentInfoInterface{
    private ObservableList<Book> library;

    public Library() {
    }

    public Library(ObservableList<Book> library) {
        this.library = library;
    }

    public ObservableList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ObservableList<Book> library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }

}
