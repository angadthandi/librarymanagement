package modules.library;

import java.util.ArrayList;
import java.util.HashMap;

import modules.book.Book;
import modules.catalogue.ICatalogue;
import modules.user.IUser;

public class Library implements ILibrary, IUser {
    private Library instance;
    private ICatalogue catalogue;
    private IUser user;
    private HashMap<String, IUser> usersList; // <memberID, User>

    private Library(
        ICatalogue c,
        IUser u
    ) {
        catalogue = c;
        user = u;
    }

    public Library getInstance(
        ICatalogue catalogue,
        IUser user
    ) {
        if (instance == null) {
            instance = new Library(catalogue, user);
        }

        return instance;
    }

    public ArrayList<Book> searchCatalog(Book book) {
        return catalogue.searchCatalog(book);
    }

    public boolean checkoutBook(String memberID, Book book) {
        boolean ret = false;

        return ret;
    }

    public boolean renewBook(String memberID, Book book) {
        boolean ret = false;

        return ret;
    }

    public boolean reserveBook(String memberID, Book book) {
        boolean ret = false;

        return ret;
    }

    public boolean returnBook(String memberID, Book book) {
        boolean ret = false;

        return ret;
    }

    // memberID
    public int registerMember(String name) {
        return user.registerMember(name);
    }

    public void unRegisterMember(String memberID) {
        user.unRegisterMember(memberID);
    }

}