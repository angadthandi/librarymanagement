package modules.catalogue;

import java.util.ArrayList;

import modules.book.IBook;

public interface ICatalogue {
    ArrayList<IBook> searchCatalog(IBook book);
    Boolean addBook(String memberID, IBook book); // ADMIN ONLY
    Boolean removeBook(String memberID, IBook book); // ADMIN ONLY
}