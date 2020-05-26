package modules.book;

import modules.user.IUser;
import modules.user.UserData;
import modules.user.UserType;

public class Book {
    private String bookID;
    private String title;
    private String publisher;
    private String publishDate;
    private BookStatus status;
    private String bookReservedByUserID;

    public boolean checkoutBook(IUser user, Book book) {
        Boolean ret = false;

        UserData userData = user.getUserData();
        if (userData.userType == UserType.MEMBER &&
            book.status == BookStatus.AVAILABLE) {
            book.status = BookStatus.RESERVED;
            book.bookReservedByUserID = userData.memberID;
            ret = true;
        }

        return ret;
    }

    public boolean renewBook(String memberID, Book book) {
        Boolean ret = false;

        if (book.bookReservedByUserID == memberID) {
            ret = true;
        }

        return ret;
    }

    public boolean reserveBook(String memberID, Book book) {
        Boolean ret = false;

        return ret;
    }

    public boolean returnBook(String memberID, Book book) {
        Boolean ret = false;

        return ret;
    }

}