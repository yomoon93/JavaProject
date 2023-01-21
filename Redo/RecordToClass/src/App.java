import java.util.ArrayList;
import java.util.List;

public class App {
   static List<Product> allProducts = new ArrayList<>();

    public static void main(String[] args) {
//        Food stawberries = new Food("Starwberries", 4.50, 20);
//        Food bananas = new Food("Bananas", 8.50, 40);
        Product product1 = new Product("Computer", 1000.50, 5);
        Product product2 = new Product("Gaming Chair", 550.25, 2);
        Product product3 = new Product("Monitor", 250.56, 4);
        double sum = totalPrice();

        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);

//        System.out.println(allProducts);
//        System.out.println(totalPrice());
//        product3.setPrice(150.50);
//        System.out.println(product3);
        alterPrice(product1, 4.00);
        System.out.println(product1);

    }

    public static double totalPrice(){
        double sum = 0;
        for(Product p : allProducts){
           sum += p.total();
        }
        return sum;
    }

    public static void alterPrice(Product other, double price){
        other.setPrice(price);
    }




}
