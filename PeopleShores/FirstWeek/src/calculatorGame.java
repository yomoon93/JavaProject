
import java.util.Arrays;
import java.util.Scanner;



public class calculatorGame {
    public static void main(String[] args) {
        //        Player Kevin =  new Player("Kevin", 29);
//        Player Kevin = createPlayer();
//        addQuestion(4, 5);
//        int john = addQuiz(5);
//        System.out.println("You have this amount right "+ john);

//        Player Kevin = createPlayer();
//        System.out.println(Kevin);
        // this is the instance of the Player
        // the key word new + Player creates a new instance
        //Player is the special variable that is an object
//        System.out.println("HelloWorld");
//        System.out.println(score.player().name());
//        System.out.println(score.player().age());
//        System.out.println(score.score());'
//        Player tallGuy ;
//        System.out.println(tallGuy.name());// Kevin
//        System.out.println(tallGuy.age());// 24
//        System.out.println("This guys name is " + tallGuy.name() + " and his age is " + tallGuy.age());
//        System.out.println(tallGuy);// [name:"Kevin, age:24]
//        HighScore score = new HighScore(tallGuy,50);

        HighScore[] hallOfFame = new HighScore[5];
        Player newPlayer;
        String answer = "";
        int score;
        do {
            newPlayer = createPlayer();
            score = 0;
            Scanner myScanner = new Scanner(System.in);
            System.out.printf("What would you like to do\n A. Addition\n B. Modulo\n C. Subtraction \n D. True and False \n or exit \n");
            answer = myScanner.nextLine().toLowerCase();
//            System.out.println(answer);

            if (answer.equals("a")) {
                //we take the variable of score and add it because each method has a score inside of it
                System.out.println("This is the high score: "+ scoreToBeat(hallOfFame));
                score = addQuiz(5);
                HighScore newHighScore = new HighScore(newPlayer, score);
                hallOfFame = addHighScore(newHighScore, hallOfFame);
                System.out.println(newPlayer.name() + " scored: " + score);
                System.out.println(Arrays.toString(hallOfFame));
            }
            if (answer.equals("b")) {
                //we take the variable of score and add it because each method has a score inside of it
                System.out.println("this is the high score: "+scoreToBeat(hallOfFame));
                score = moduloQuiz(5);
                HighScore newHighScore = new HighScore(newPlayer, score);
                hallOfFame = addHighScore(newHighScore, hallOfFame);
                System.out.println(newPlayer.name() + " scored: " + score);
                System.out.println(Arrays.toString(hallOfFame));
            }
            if (answer.equals("c")) {
                //we take the variable of score and add it because each method has a score inside of it
                System.out.println("this is the high score: "+scoreToBeat(hallOfFame));
                score = subtractionQuiz(5);
                HighScore newHighScore = new HighScore(newPlayer, score);
                hallOfFame = addHighScore(newHighScore, hallOfFame);
                System.out.println(newPlayer.name() + " scored: " + score);
                System.out.println(Arrays.toString(hallOfFame));
            }
            if (answer.equals("d")) {
                //we take the variable of score and add it because each method has a score inside of it
                System.out.println("this is the high score: "+scoreToBeat(hallOfFame));
                score = andQuiz(5);
                HighScore newHighScore = new HighScore(newPlayer, score);
                hallOfFame = addHighScore(newHighScore, hallOfFame);
                System.out.println(newPlayer.name() + " scored: " + score);
                System.out.println(Arrays.toString(hallOfFame));
            }
        }while (answer!=null && !answer.equals("exit"));
        HighScore newScore = new HighScore(newPlayer, score);
        hallOfFame = addHighScore(newScore,hallOfFame);
//        System.out.println( "this is the high score: "+scoreToBeat(hallOfFame));
//            highScores = addHighScore(newScore,hallOfFame);
    }

    static int index = 0;


    public static HighScore[] addHighScore(HighScore myHigh,HighScore[] myArray ){
        myArray[index] = myHigh;
        index++;
        return myArray;
    }


    public static Player createPlayer(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name");
        String myName = myScanner.nextLine();
        System.out.println("What is your age");
        int age = myScanner.nextInt();
//        HighScore score = new HighScore(myName, 100);
        Player myTeam = new Player(myName, age);
        return myTeam;
    }


    public static int scoreToBeat(HighScore score[]){
        if(score[0]==null)
        {
            return 0;
        }
        HighScore max = score[0];
        while(score.equals(null)){
            for (int i = 0; i < score.length; i++){

                if (score[i].score() > max.score()){
                    max = score[i];
                }
            }

        }
        return max.score();
    }


    public static int generateRandom(){
        int a = (int)Math.floor(Math.random()* 100) + 1;
        return a;
    }
//

    //Create a method called addQuestion, with the signature:

    public static boolean addQuestion(int a,int b){
        // using the user inputs to see if the sum is correct


        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Add these two numbers %s + %s what is the answer\n " ,a,b);
        int sum1 = myScanner.nextInt();
        int sum = a + b;
        if(sum == sum1){
            return true;
        }else
            return false;

    }

    public static int addQuiz(int length){
        int score = 0;
//        HighScore newHighScore = new HighScore( "Kevin", score);
        // want to add variable with parameters how to do that
        for(int i = 1; i <= length; i++){
            if(addQuestion(generateRandom(),generateRandom()) == true){
                score++;
            }

        }

        return score;
    }
    public static boolean moduloQuestion(int a, int b){
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Divide these two numbers %s + %s what is the answer\n " ,a,b);
        int sum1 = myScanner.nextInt();
        int sum = a % b;
        if(sum == sum1){
            return true;
        }return false;
    }
    public static int moduloQuiz(int length){
        int score = 0;
        HighScore newHighScore = new HighScore( createPlayer(), score);
        // want to add variable with parameters how to do that
        for(int i = 1; i <= length; i++){
            if(moduloQuestion(generateRandom(),generateRandom()) == true){
                score++;
            }
        }
        return score;
    }

    public static boolean andQuestion(boolean a, boolean b){
        // we create a boolean that has both a&&b
        boolean and = a&&b;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is " + a + " AND " + b + "?");
        //we make the answer into lowercase
        String userAnswer = myScanner.nextLine().toLowerCase();
        // while not and the userAnswer is not equal to true OR userAnswer is not equal to false we print out the following
        while(!(userAnswer.equals("true") || userAnswer.equals("false"))){
            System.out.println("Your answer " + userAnswer);
            System.out.println("Answer not recognised. Please try again.");
            // we ask the user to try again and we take in that answer within this variable
            userAnswer = myScanner.nextLine();
        }
        // because our answer is a string we must make it into a boolean
        // so we create a variable that changes the string to a boolean
        boolean ans = Boolean.parseBoolean(userAnswer);
        // we use a ternary to get a response out we check to see if ans equals and if it does Thats correct
        // else we say that's not correct
        String msg = (ans == and)? "That's correct." : "That's incorrect";
        // we print out a message
//        System.out.println(msg);
        // we return if ans equals and
        System.out.println(msg);
        return ans == and;

    }




    public static int andQuiz(int length){
        // we initialize score at 0
        int score = 0;
        // we want to loop through the length and add 1
        for(int x = 1; x <= length; x++){
            // we create two random true or false statements down below
            boolean a = Math.random() < 0.5;
            boolean b = Math.random() < 0.5;
            // we call the addQuestion with a and b which are random true or false
            // if they answer right we add 1
            if(andQuestion(a,b)){
                score++;
            }
        }

        return score;
    }



    public static boolean subtractionQuestion(int a,int b){
        // using the user inputs to see if the sum is correct


        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Subtract these two numbers %s - %s what is the answer\n " ,a,b);
        int sum1 = myScanner.nextInt();
        int sum = a - b;
        if(sum == sum1){
            return true;
        }else
            return false;

    }

    public static int subtractionQuiz(int length){
        int score = 0;
//        HighScore newHighScore = new HighScore( "Kevin", score);
        for(int i = 1; i <= length; i++){
            if(subtractionQuestion(generateRandom(),generateRandom()) == true){
                score++;
            }
        }
        return score;
    }

    // if I put the method in a variable with the parameters
}
record Player(String name, int age ){

}
// it's a special object syntax
//the record for player
record HighScore(Player player, int score){

}