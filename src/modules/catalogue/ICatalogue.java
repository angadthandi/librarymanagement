package modules.catalogue;

import java.util.ArrayList;

import modules.book.Book;

public interface ICatalogue {
    ArrayList<Book> searchCatalog(Book book);
    Boolean addBook(String memberID, Book book); // ADMIN ONLY
    Boolean removeBook(String memberID, Book book); // ADMIN ONLY
}