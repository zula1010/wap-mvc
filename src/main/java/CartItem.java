public class CartItem {
    private static int count =0;
    private int quantity;
    private Product product;
    private int id;

    private int giveID(){
        this.count++;
        return  this.count;
    }
    public CartItem(Product product, int q){
        this.id = giveID();
        this.product = product;
        this.quantity = q;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
