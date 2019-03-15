public class Product {
    private static int count = 0;
    private  int id;
    private String name;
    private String description;
    private double price;

    private int giveID(){
        this.count++;
        return this.count;
    }


    public Product(String name, String description, double price){
        this.name = name;
        this.description= description;
        this.id= giveID();
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
