package kevinHey;


//import java.util.*;
public class App {

    public static void main(String[] args) {
// cleaner way to create this
        Product[] products = {
                new Product("Banana", 2.00, 4),
                new Product("Strawberries", 4.00, 8),
                new Product("Blackberries", 5.00, 20),
        };

        // creates array of size 3
//            Product[] products = new Product[3];
//            Product banana = new Product("Banana", 2.00, 4);
//            Product strawberries = new Product("Strawberries", 4.00, 8);
//            Product blackberries = new Product("Blackberries", 5.00, 20);
        // creates the info for three of the arrays
//            products[0] = new Product("Banana", 2.00, 4);
//            products[1] = new Product("Strawberries", 4.00, 8);
//            products[2] = new Product("Blackberries", 5.00, 20);

//            products[0].printInformation();
        //we initiate the sum variable
        double sum = 0.0;
        // for loop to go through the products
        for (int i = 0; i < products.length;i++){
            //if null at whatever position is null
            if(products[i] == null){
                //print empty
                System.out.println("empty");
            }else{
                // else we print the products
                System.out.println(products[i]);
                // we add products[i].tota
                sum += products[i].totalItemPrice();
                System.out.println("Total price for all items is: " + sum);
            }
        }for (Product p : products){
            sum += p.totalItemPrice();
        }
        System.out.println("The total sum is: "+ sum);
//        System.out.println(products[0].price + products[1].price + products[2].price);

        //instance of product/ but also a object.
        Product product = new Product("Stawberries", 50.52, 50);

        alterPrice(product, 43.50);
        System.out.println("This is the new price: " + product.price);
        System.out.println(product);
    }



public static void alterPrice(Product other, double price){
        other.price = price;
}


}
record Products2(String name,double price, int quantity){}
