public class User {
    private  static int count=0;
    private int id;
    private String username;
    private String password;
    private Cart cart;
    private int giveID(){
        this.count++;
        return this.count;
    }

    public User(String username, String password){
        this.id = giveID();
        this.username = username;
        this.password=password;
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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
