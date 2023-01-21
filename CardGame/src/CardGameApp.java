import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGameApp {
    public static void main(String[] args) {

        List<Player1> kev = new ArrayList<>(32);

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome players to the world game of cards");
        System.out.println("What is your name");
        String name = scan.nextLine();
        Player1 p = new Player1(name);
        kev.add(p);
        System.out.println(p);






    }
}
