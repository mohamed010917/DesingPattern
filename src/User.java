public class User {

    private String name;

    private boolean premium;

    public User(String name,
                boolean premium) {

        this.name = name;
        this.premium = premium;

    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return premium;
    }

}