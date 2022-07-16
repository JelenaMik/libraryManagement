package library;

import book.Book;

import javax.swing.*;
import java.util.ArrayList;

public class LibraryController {

    public ArrayList<Book> books = new ArrayList<>();
    public Book book;

    public LibraryController(ArrayList<Book> books) {
        this.books = books;
    }

    public LibraryController() {
    }

    public void addBookToLibrary(){

        String name = JOptionPane.showInputDialog(null, "Enter a name of book");
        String author = JOptionPane.showInputDialog(null, "Enter an author of book");
        int yearOfRelease = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a year of release"));
        int numberOfPages = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of pages"));
        String genre = JOptionPane.showInputDialog(null, "Enter a genre of book");

        Book book = new Book(name, author, yearOfRelease, numberOfPages, genre);
        this.books.add(book);
    }

    public void viewAllBooks() {
        for (Book book: books){
            System.out.println(book);
        }
    }
}
