package com.model;

import javafx.collections.ObservableList;

import java.util.List;
import java.util.Objects;

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
    ObservableList<Book> rentBook;

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

    public ObservableList<Book> getRentBook() {
        return rentBook;
    }

    public void setRentBook(ObservableList<Book> rentBook) {
        this.rentBook = rentBook;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", rentBook=" + rentBook +
                '}';
    }
}
