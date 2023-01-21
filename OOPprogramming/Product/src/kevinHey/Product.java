package kevinHey;

public class Product {
    String name;
    double price;
    int quantity;


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

    public Product(String productName, double productPrice, int productQuantity){
            name =productName;
            price = productPrice;
            quantity = productQuantity;
//        this.name = productName;
//        this.price = productPrice;
//        this.quantity = productQuantity;


    }

    public void printInformation(){

        System.out.println(""+this.name + " Cost: " + this.price + " We have this many: "+this.quantity);
    }
    //doesn't have to be there the intention is for the humans
  @Override
    public String toString(){
        return name + ": "+ price+" the quantity: " + quantity;
    }

//    public double totalPrice(){
//        double total = 0;
//        total = quantity * price;
//        return total;
//    }
    public double totalItemPrice(){
        double totalPrice;
        totalPrice = quantity*price;
        System.out.println("The total for " + this.quantity + " will be " + this.price * this.quantity + ".");
        return totalPrice;
    }

}
