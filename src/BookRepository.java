import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void add(Book book) {

        books.add(book);

    }

    public Book find(String title) {

        for (Book b : books) {

            if (b.getTitle()
                    .equalsIgnoreCase(title)) {

                return b;

            }

        }

        return null;

    }

}