import java.util.Random;

public class NumberRound {

    int[] num = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
    int[] num1 = {25,50,75,100};


//    public int generateNumber(){
//       int number = (int)Math.floor(Math.random()*);
//       return number;
//    }
    public int threeDigitNumber(){
        // initialize a Random object somewhere; you should only need one
        Random random = new Random();

// generate a random integer from 0 to 899, then add 100
        int x = random.nextInt(900) + 100;
        return x;
    }

}
