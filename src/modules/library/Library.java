package modules.library;

import java.util.ArrayList;
import java.util.HashMap;

import modules.book.IBook;
import modules.catalogue.ICatalogue;
import modules.user.IUser;

public class Library implements ILibrary {
    private Library instance;
    private ICatalogue catalogue;
    private HashMap<String, IUser> usersList; // <memberID, User>

    private Library(ICatalogue c) {
        catalogue = c;
    }

    public Library getInstance(ICatalogue catalogue) {
        if (instance == null) {
            instance = new Library(catalogue);
        }

        return instance;
    }

    public ArrayList<IBook> searchCatalog(IBook book) {
        return catalogue.searchCatalog(book);
    }

    public IUser getUserByID(String memberID) {
        return usersList.get(memberID);
    }

    public int totalUsers() {
        return usersList.size();
    }

    public void addUserToList(String memberID, IUser user) {
        usersList.put(memberID, user);
    }

    public void removeUserFromList(String memberID) {
        usersList.remove(memberID);
    }

}