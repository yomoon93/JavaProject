import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
        Player player1;
        Player player2;
        static List<Character> randomLetterArr = new ArrayList<>();
//        static List<>
        LetterRound randomLetter;
        NumberRound randomNumber;
        Example example;
        Words randomWord;


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        for(int i = 1; i <= 3; i++){
            System.out.print(i+": ");
            randomVowel();
        }
        for (int i = 4; i<=7; i++){
            System.out.print(i+": ");
            randomConsonant();
        }
        for(int i = 8; i <= 9; i++){
            System.out.println("Would you like a vowel or consonant?");
            String userInput = myScanner.nextLine();
            if(userInput.equals("vowel")){
                System.out.print(i+": ");
                randomVowel();
            } else if (userInput.equals("consonant")) {
                System.out.print(i+": ");
                randomConsonant();
            }
        }
        System.out.println("The letters are " + randomLetterArr);
    }
    private static void randomConsonant() {
        Example example = new Example();
        char randomConsonant = example.getRandomConsonant();
        System.out.println(randomConsonant);
        randomLetterArr.add(randomConsonant);
    }


    public static void randomVowel() {
        Example example = new Example();
        char randomVowels = example.getRandomVowels();
        System.out.println(randomVowels);
        randomLetterArr.add(randomVowels);
    };
        public static void  startGame() {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Hey what's your name");
            String name = myScanner.nextLine();
            Player player1 = new Player(name);
            String answer;
            do{
            System.out.println("Do you want a vowel or a consonant?");
            answer = myScanner.nextLine();
            if(randomLetterArr.size()<9){
                if(answer.equals("vowel")){
                    randomVowel();
                }else if(answer.equals("consonant")){
                    randomConsonant();
                }

            }
            }while(!answer.equals("exit") || randomLetterArr.size() < 9);



        }


    @Override
    public String toString() {
        return "Game{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                ", randomLetter=" + randomLetter +
                ", randomNumber=" + randomNumber +
                ", example=" + example +
                ", randomWord=" + randomWord +
                '}';
    }
}


