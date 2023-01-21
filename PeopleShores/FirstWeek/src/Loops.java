public class Loops {



    public static void main(String[] args){

        int k = sumTo(2);
        int number = 1;
        int sum = 0;


        while(number <= 20){
            sum = sum+number;
            number++;
        }
        System.out.println(sum);
        System.out.println(k);

        // first for loop we look into our range 2-100

        /*
            Create a new file called Loops.java. Sum the numbers between 1 and 20 using a while loop. Verify that the answer your program prints is 210.

            The sum of the integers between 1 and n is equal to
        n*(n+1)/2
.           Verify this formula by testing it for all values of n between 2 and 100, using a loop.

Hint: you'll need to use a nested loop. For each possible n, you need to compare the result of manually summing the numbers up to it to the result of the formula.

  */



    }
    public static int sumTo(int n){

        for(int x = n; n <= 100; n++){
            //   we set sum to 0
            int sum = 0;


            //   second for loop we take the
            for(int j = 1; j <= x; j++)  {
                // we take sum that's 0 and we add j to the sum we start with 1 and we continue going up
                sum = sum + j;
                System.out.println("What is j: " + j);
                System.out.println("What is sum: " + sum);
                System.out.println("What is n: " + x);


            }
            //we use this formula with n
            int formula = n*(n+1)/2;
            System.out.println("n = " + x);
            System.out.println("sum = " + sum);
            System.out.println("sum = " + formula);


            // if sum and formula are equal we spit out two messages
            if(sum == formula){
                System.out.println("Sum and Formula are equal");
            }else{
                System.out.println("Sum and Formula are not equal");
            }
        }

        return  n;

    }


}
