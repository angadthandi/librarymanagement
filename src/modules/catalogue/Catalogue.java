package modules.catalogue;

import java.util.ArrayList;
import java.util.HashMap;

import modules.book.Book;

public class Catalogue implements ICatalogue {
    private HashMap<String, Book> booksList; // <BookTitle, Book>

    public ArrayList<Book> searchCatalog(Book book) {
        ArrayList<Book> books = new ArrayList<Book>();

        return books;
    }

    // ADMIN ONLY
    public Boolean addBook(String memberID, Book book) {
        boolean added = false;

        // add to booksList

        return added;
    }

    // ADMIN ONLY
    public Boolean removeBook(String memberID, Book book) {
        boolean removed = false;

        // remove from booksList

        return removed;
    }

}