package modules.book;

import modules.user.IUser;

public interface IBook {
    boolean checkoutBook(IUser user, Book book);
    boolean renewBook(IUser user, Book book);
    boolean reserveBook(IUser user, Book book);
    boolean returnBook(IUser user, Book book);
    BookData getBookData();
}