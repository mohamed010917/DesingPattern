public class PhysicalBook extends Book {

    public PhysicalBook(String title) {

        super(
                title,
                new DefaultBorrowStrategy()
        );

    }

}