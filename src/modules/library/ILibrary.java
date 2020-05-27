package modules.library;

import java.util.ArrayList;

import modules.book.IBook;
import modules.user.IUser;

public interface ILibrary {
    ArrayList<IBook> searchCatalog(IBook book);
    int totalUsers();
    void addUserToList(String memberID, IUser user);
    void removeUserFromList(String memberID);
}