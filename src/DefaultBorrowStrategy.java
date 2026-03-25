public class DefaultBorrowStrategy implements BorrowStrategy {

    @Override
    public void borrow(Book book, User user) {

        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(user.getName() +
                    " borrowed " + book.getTitle());
        } else {
            System.out.println("Not available");
        }

    }
}