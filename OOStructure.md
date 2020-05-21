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
 - searchCatalog(Book book) ArrayList<Book>
 - checkoutBook(String memberID, Book book) boolean
 - renewBook(String memberID, Book book) boolean
 - reserveBook(String memberID, Book book) boolean
 - returnBook(String memberID, Book book) boolean

## Library Class implements ILibrary, IUser
 #### Attributes:
 - instance Library
 - catalogue ICatalogue
 - user IUser
 - usersList HashMap<String, User> // <memberID, User>
 #### Methods:
 - searchCatalog(Book book) ArrayList<Book>
 - checkoutBook(String memberID, Book book) boolean
 - renewBook(String memberID, Book book) boolean
 - reserveBook(String memberID, Book book) boolean
 - returnBook(String memberID, Book book) boolean
 - registerMember(String name) memberID
 - unRegisterMember(String memberID)
 - Library(ICatalogue, IUser) \
// constructor - use __Singleton__ Object

---

## Book Class
 #### Attributes:
 - bookID String
 - title String
 - publisher String
 - publishDate String
 - status BookStatus
 #### Methods:
 - checkoutBook(String memberID, Book book) boolean
 - renewBook(String memberID, Book book) boolean
 - reserveBook(String memberID, Book book) boolean
 - returnBook(String memberID, Book book) boolean

---

## IUser Interface
 #### Methods:
 - registerMember(String name) memberID
 - unRegisterMember(String memberID)

## User Class implements IUser
 #### Attributes:
 - memberID String
 - name String
 - userType UserType
 #### Methods:
 - registerMember(String name) memberID
 - unRegisterMember(String memberID)

---

## ICatalogue Interface
 #### Methods:
 - searchCatalog(Book book) ArrayList<Book>
 - addBook(String memberID, Book book) boolean // ADMIN ONLY
 - removeBook(String memberID, Book book) boolean // ADMIN ONLY

## Catalogue Class implements ICatalogue
 #### Attributes:
 - booksList HashMap<String, Book> // <BookTitle, Book>
 #### Methods:
 - searchCatalog(Book book) ArrayList<Book>
 - addBook(String memberID, Book book) boolean // ADMIN ONLY
 - removeBook(String memberID, Book book) boolean // ADMIN ONLY