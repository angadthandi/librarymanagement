package modules.book;

import modules.user.IUser;
import modules.user.UserData;
import modules.user.UserType;

public class Book implements IBook {
    private BookData bookData;

    public boolean checkoutBook(IUser user, Book book) {
        Boolean ret = false;

        UserData userData = user.getUserData();
        if (userData.userType == UserType.MEMBER &&
            bookData.status == BookStatus.AVAILABLE) {
            bookData.status = BookStatus.RESERVED;
            bookData.bookReservedByUserID = userData.memberID;
            ret = true;
        }

        return ret;
    }

    public boolean renewBook(IUser user, Book book) {
        Boolean ret = false;

        // TODO
        // Is book reserved by other user - UserBooks
        // return FALSE

        UserData userData = user.getUserData();
        if (bookData.bookReservedByUserID == userData.memberID) {
            ret = true;
        }

        return ret;
    }

    public boolean reserveBook(IUser user, Book book) {
        Boolean ret = false;

        UserData userData = user.getUserData();
        if (userData.userType == UserType.MEMBER &&
            bookData.status == BookStatus.RESERVED) {
            // TODO
            // add book to user reserved books - UserBooks
            ret = true;
        }

        return ret;
    }

    public boolean returnBook(IUser user, Book book) {
        Boolean ret = false;

        UserData userData = user.getUserData();
        if (userData.userType == UserType.MEMBER &&
            bookData.status == BookStatus.RESERVED) {
            bookData.status = BookStatus.AVAILABLE;
            bookData.bookReservedByUserID = "";
            ret = true;
        }

        return ret;
    }

    public BookData getBookData() {
        return bookData;
    }

}