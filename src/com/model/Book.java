package com.model;

import java.util.Objects;

/**
 * @ author Fei Gu
 * @ create 2021-04-21-13.17
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public class Book implements BookInterface{
    private int bookId;
    private String bookInfo;

    public Book() {
    }

    public Book(int bookId, String bookInfo) {
        this.bookId = bookId;
        this.bookInfo = bookInfo;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(String bookInfo) {
        this.bookInfo = bookInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && Objects.equals(bookInfo, book.bookInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookInfo);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookInfo='" + bookInfo + '\'' +
                '}';
    }

    @Override
    public void rentBook() {

    }

    @Override
    public void getRentInfo() {

    }
}
