public interface BookInterface {

    String getTitle();

    boolean isAvailable();

    void borrow(User user);

    void returnBook();

}