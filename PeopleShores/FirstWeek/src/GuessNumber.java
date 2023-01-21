import java.util.Scanner;

public class GuessNumber {

    public static int GenerateNumber(int a){
        return (int)Math.floor(Math.random()*a)+1; // double
    }
    public static void main(String[] args){
        int answer = GenerateNumber(50);
        Scanner myScanner = new Scanner(System.in);
        while(true){
            System.out.println("Please make a guess: ");
            int guess = myScanner.nextInt();
            if(answer == guess){
                System.out.println("You are a winner good guess");
                break;
            }else{
                if(guess < answer){
                    System.out.println("Guess higher!");
                }else{
                    System.out.println("Guess lower!");
                }
            }
        }
    }
}
