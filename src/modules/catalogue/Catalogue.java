package modules.catalogue;

import java.util.ArrayList;
import java.util.HashMap;

import modules.book.BookData;
import modules.book.IBook;

public class Catalogue implements ICatalogue {
    private HashMap<String, IBook> booksList; // <BookID, Book>

    public ArrayList<IBook> searchCatalog(IBook book) {
        ArrayList<IBook> books = new ArrayList<IBook>();
        
        BookData searchData = book.getBookData();

        for (HashMap.Entry mapElement : booksList.entrySet()) { 
            // int key = (int)mapElement.getKey();
            IBook b = (IBook)mapElement.getValue();

            if (b != null) {
                BookData bookData = b.getBookData();
                if (
                    bookData.title == searchData.title ||
                    bookData.publisher == searchData.publisher ||
                    bookData.publishDate == searchData.publishDate
                ) {
                    books.add(b);
                }
            }
        }

        return books;
    }

    // ADMIN ONLY
    public Boolean addBook(String memberID, IBook book) {
        boolean added = false;

        // check if memberID is ADMIN

        // add to booksList
        BookData bookData = book.getBookData();
        booksList.put(bookData.bookID, book);
        added = true;

        return added;
    }

    // ADMIN ONLY
    public Boolean removeBook(String memberID, IBook book) {
        boolean removed = false;

        // check if memberID is ADMIN

        // remove from booksList
        BookData bookData = book.getBookData();
        booksList.remove(bookData.bookID);
        removed = true;

        return removed;
    }

}