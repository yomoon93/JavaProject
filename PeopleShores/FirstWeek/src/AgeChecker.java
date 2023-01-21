import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name");
        String myName = myScanner.nextLine();
        System.out.println("Please provide your age!");
        int myAge = myScanner.nextInt();


//        if(myAge >= 18){
//            System.out.printf("You are old Enough %s", myName);
//            //we added a else if where the code sees if the user is 17 if so the years turns into year
//            //we also added a way to make the negative number into a positive
//        }else if(myAge == 17){
//            myAge = Math.abs(myAge - 18);
//            System.out.printf("You must be %s year older %s", myAge, myName);
//        } else{
//            myAge = Math.abs(myAge - 18); // -1 and makes into 1
//            System.out.printf("You must be %s years older %s", myAge, myName);
//        }
        //alternative way to type this code out
        if(myAge >= 18){
            System.out.printf("You are old enough %s", myName);
        }else{
            if(myAge == 17){
                System.out.printf("You must be 1 year older %s", myName);
            }else{
               System.out.printf("You must be %s years older %s" , 18 - myAge, myName);


            }
        }


    }
}
