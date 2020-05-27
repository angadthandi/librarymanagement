# OO Design Structure

##### Reference
https://www.educative.io/courses/grokking-the-object-oriented-design-interview/RMlM3NgjAyR

https://github.com/OSSpk/Library-Management-System-JAVA

---

## BookStatus Enum
 #### Attributes:
 - status enum // __AVAILABLE, RESERVED, LOST__

## ReservationStatus Enum
 #### Attributes:
 - status enum // __WAITING, PENDING, COMPLETED, CANCELLED__

## UserType Enum
 #### Attributes:
 - userType enum // __ADMIN, LIBRARIAN, MEMBER__

---

## ILibrary Interface
 #### Methods:
 - searchCatalog(IBook book) ArrayList<IBook>
 - totalUsers() int
 - addUserToList(String memberID, IUser user)
 - removeUserFromList(String memberID)

## Library Class implements ILibrary
 #### Attributes:
 - instance Library
 - catalogue ICatalogue
 - usersList HashMap<String, User> // <memberID, User>
 #### Methods:
 - searchCatalog(IBook book) ArrayList<IBook>
 - totalUsers() int
 - addUserToList(String memberID, IUser user)
 - removeUserFromList(String memberID)
 - Library(ICatalogue) \
// constructor - use __Singleton__ Object

---

## IBook Interface
 #### Methods:
 - checkoutBook(IUser user, Book book) boolean
 - renewBook(IUser user, Book book) boolean
 - reserveBook(IUser user, Book book) boolean
 - returnBook(IUser user, Book book) boolean
 - getBookData() BookData

## Book Class implements IBook
 #### Attributes:
 - bookData BookData
 #### Methods:
 - checkoutBook(IUser user, Book book) boolean
 - renewBook(IUser user, Book book) boolean
 - reserveBook(IUser user, Book book) boolean
 - returnBook(IUser user, Book book) boolean
 - getBookData() BookData

## BookData Class
 #### Attributes:
 - bookID String
 - title String
 - publisher String
 - publishDate String
 - status BookStatus
 - bookReservedByUserID String

---

## IUser Interface
 #### Methods:
 - registerMember(String name) memberID
 - unRegisterMember(String memberID)
 - getUserData() UserData

## User Class implements IUser
 #### Attributes:
 - userData UserData
 - userBooksList ArrayList<UserBook>
 #### Methods:
 - registerMember(String name) memberID
 - unRegisterMember(String memberID)
 - getUserData() UserData

## UserData Class
 #### Attributes:
 - memberID String
 - name String
 - userType UserType

## UserBook Class
 #### Attributes:
 - memberID String
 - bookID String
 - reservationStatus ReservationStatus

---

## ICatalogue Interface
 #### Methods:
 - searchCatalog(IBook book) ArrayList<IBook>
 - addBook(String memberID, IBook book) boolean // ADMIN ONLY
 - removeBook(String memberID, IBook book) boolean // ADMIN ONLY

## Catalogue Class implements ICatalogue
 #### Attributes:
 - booksList HashMap<String, IBook> // <BookID, IBook>
 #### Methods:
 - searchCatalog(IBook book) ArrayList<IBook>
 - addBook(String memberID, IBook book) boolean // ADMIN ONLY
 - removeBook(String memberID, IBook book) boolean // ADMIN ONLY