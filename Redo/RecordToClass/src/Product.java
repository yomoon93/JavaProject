public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String pName, double pPrice, int pQuantity){
        this.name = pName;
        this.price = pPrice;
        this.quantity = pQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public double total(){
        double total = 0;
        total = this.quantity * this.price;
        System.out.println("The total for " + this.quantity + " will be " + this.quantity * this.price);
        return total;
    }

}
// records you cant mutate
record Food(String name, double price, int quantity){}
