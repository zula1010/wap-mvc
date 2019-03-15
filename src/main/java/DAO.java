import java.util.ArrayList;
import java.util.List;

public class DAO {
    List<User> users = new ArrayList<>();
    List<Product> products= new ArrayList<>();
    User user1 = new User("Julia", "123");
    User user2 = new User("Jack", "123");
    Product product1 = new Product("iphone8", "new iphone8", 300.0);
    Product product2 = new Product("iphone8 plus", "new iphone8 plus", 400.0);
    Product product3 = new Product("iphone X", "new iphone X", 500.0);
    public DAO(){
        users.add(user1);
        users.add(user2);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }
    public void setUser(User user){
        users.add(user);
    }
    public List<User> getUsers(){
        return users;
    }
    public List<Product> getProducts(){
        return products;
    }

}
