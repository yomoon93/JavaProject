import java.util.Scanner;

public class Redo {


    public static void main(String[] args) {
        newPlayer newMaster = new newPlayer("Jesus", 29);
        newHighScore newScore = new newHighScore(newMaster, 100);
//        System.out.println(newMaster);
//        System.out.println();
//        System.out.println(newScore);
//        System.out.println(masterPlayer());
//        boolean question = addQuestion(4,10);
//        System.out.println(question);
//        System.out.println(addQuiz(5));
        Scanner newScanner = new Scanner(System.in);
        System.out.println("What would you like to do add or modulo?");
        String answer = newScanner.nextLine().toLowerCase();


            if(answer.equals("add")){
                addQuestion(randomNumber(),randomNumber());
            }
            if(answer.equals("modulo")){
                moduloQuestion(randomNumber(),randomNumber());
            }else{
                System.out.println("it's either add or modulo");
            }




    }
public static newPlayer masterPlayer(){
    Scanner masterScanner = new Scanner(System.in);
    System.out.println("What is your name mister");
    String masterName = masterScanner.nextLine();
    System.out.println("What is your age mister");
    int masterAge = masterScanner.nextInt();

    newPlayer newKevin = new newPlayer(masterName, masterAge);
            return newKevin;
    }
    public static boolean addQuestion(int a, int b){
        Scanner redoScanner = new Scanner(System.in);
        System.out.println("What do these numbers add up to:  " + a + " + " + b);
        int newSum = redoScanner.nextInt();
        int sum = a+b;
        if(sum == newSum){
            return true;
        }else return false;
    }


    public static int addQuiz(int length){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("What is you name?");
        String newName = newScanner.nextLine();
        System.out.println("What is your age?");
        int myAge = newScanner.nextInt();

        newPlayer newPlayer = new newPlayer(newName, myAge);
        newHighScore highScore = new newHighScore(newPlayer,100 );

        return highScore.newScore();
    }


    public static int moduloQuiz(int length){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("What is you name?");
        String newName = newScanner.nextLine();
        System.out.println("What is your age?");
        int myAge = newScanner.nextInt();

        newPlayer newPlayer = new newPlayer(newName, myAge);
        newHighScore highScore = new newHighScore(newPlayer,100 );

        return highScore.newScore();
    }
    public static boolean moduloQuestion(int a, int b){
        Scanner redoScanner = new Scanner(System.in);
        System.out.println("What is the remainder:  " + a + " % " + b);
        int newSum = redoScanner.nextInt();
        int sum = a%b;
        if(sum == newSum){
            return true;
        }else return false;
    }
    public static int randomNumber(){
        int number = (int)Math.floor(Math.random()* 100) +1;
        return number;
    }



}
record newPlayer(String name, int age){}
record newHighScore(newPlayer name, int newScore){}