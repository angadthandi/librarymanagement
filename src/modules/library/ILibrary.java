package modules.library;

import java.util.ArrayList;

import modules.book.Book;

public interface ILibrary {
    ArrayList<Book> searchCatalog(Book book);
    boolean checkoutBook(String memberID, Book book);
    boolean renewBook(String memberID, Book book);
    boolean reserveBook(String memberID, Book book);
    boolean returnBook(String memberID, Book book);
}