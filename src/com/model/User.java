package com.model;

import javafx.collections.ObservableList;

/**
 * @ author Fei Gu
 * @ create 2021-04-21-13.15
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public class User implements UserInterface,BookRentInfoInterface{
    private String name;
    private String password;
    ObservableList<Book> rentedBooks;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ObservableList<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(ObservableList<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", rentBook=" + rentedBooks +
                '}';
    }
}
