import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static int count =0;
    private List<CartItem> list;
    private int id;

    private int giveID(){
        this.count++;
        return  this.count;
    }
    public Cart() {
        this.id = giveID();
        list = new ArrayList<>();
    }

    public List getCart() {
        return list;
    }
}
