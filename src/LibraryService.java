public class LibraryService {

    private static LibraryService instance;

    private BookRepository repo;

    private LibraryService() {

        repo = new BookRepository();

    }

    public static LibraryService getInstance() {

        if (instance == null) {

            instance = new LibraryService();

        }

        return instance;

    }

    public void addBook(Book book) {

        repo.add(book);

    }

    public void borrow(String title,
                       User user) {

        Book b = repo.find(title);

        if (b != null) {

            b.borrow(user);

        }

    }

    public void returnBook(String title) {

        Book b = repo.find(title);

        if (b != null) {

            b.returnBook();

        }

    }

}