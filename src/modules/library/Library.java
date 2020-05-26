package modules.library;

import java.util.ArrayList;
import java.util.HashMap;

import modules.book.Book;
import modules.catalogue.ICatalogue;
import modules.user.IUser;
import modules.user.UserData;
import modules.user.UserType;

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
        return book.checkoutBook(getUserByID(memberID), book);
    }

    public boolean renewBook(String memberID, Book book) {
        return book.renewBook(memberID, book);
    }

    public boolean reserveBook(String memberID, Book book) {
        return book.reserveBook(memberID, book);
    }

    public boolean returnBook(String memberID, Book book) {
        return book.returnBook(memberID, book);
    }

    // memberID
    public int registerMember(String name) {
        return user.registerMember(name);
    }

    public void unRegisterMember(String memberID) {
        user.unRegisterMember(memberID);
    }

    public IUser getUserByID(String memberID) {
        return usersList.get(memberID);
    }

    public UserData getUserData() {
        return user.getUserData();
    }

}