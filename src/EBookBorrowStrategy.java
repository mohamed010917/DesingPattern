public class EBookBorrowStrategy implements BorrowStrategy {

    @Override
    public void borrow(Book book, User user) {

        System.out.println(
                user.getName()
                        + " borrowed eBook: "
                        + book.getTitle()
        );

    }
}