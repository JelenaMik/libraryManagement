package user;

import book.Book;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Book> borrowedBooks;
    private String id;

    public User(String name, ArrayList<Book> borrowedBooks, String id) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
        this.id = id;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                ", id='" + id + '\'' +
                "name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                 '}';
    }
}
