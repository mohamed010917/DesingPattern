public class Main {

    public static void main(String[] args) {

        LibraryService lib =
                LibraryService.getInstance();

        lib.addBook(
                new PhysicalBook("Harry Potter")
        );

        lib.addBook(
                new EBook("Java PDF")
        );

        User u =
                new User("John", true);

        lib.borrow("Harry Potter", u);

        lib.returnBook("Harry Potter");

    }
}