public abstract class Book implements BookInterface {

    private String title;

    private boolean available = true;

    private BorrowStrategy borrowStrategy;

    public Book(String title,
                BorrowStrategy strategy) {

        this.title = title;
        this.borrowStrategy = strategy;

    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean value) {
        available = value;
    }

    @Override
    public void borrow(User user) {

        borrowStrategy.borrow(this, user);

    }

    @Override
    public void returnBook() {

        available = true;

        System.out.println(
                title + " returned"
        );

    }
}