public class User {
    private String username;
    private String password;
    private Basket basket;

    public User(String username, String password, Basket basket) {
        this.username = username;
        this.password = password;
        this.basket = basket;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "\n" + getUsername() + ":" + basket.toString();
    }

}
