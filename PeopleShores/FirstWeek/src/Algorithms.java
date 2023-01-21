
import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
//        int [] myArray = {5,4,3,4,4};
//        int[] toSearch = new int[] {1,3,5,7,9};
//        int[] myArray = new int[] {1,3,1,5,3};
//        int[] toMuch = new int[5];
//        boolean ihy =   search(toMuch,0);
//        System.out.println(ihy);
//        search(myArray,3);
//        System.out.println(Arrays.toString(toMuch));
//        search(toSearch,4);
        int [] myArray = {1,5,3};
        int [] toSearch = {1,3,1,5,3};
        int [] toMuch = {1,5,1,3,7,9,1};
        System.out.println(Arrays.toString(bubbleSort(toMuch)));
    }

    public static boolean search(int[] toSearch, int target){
        for( int i : toSearch){
            if(i == target){
                return true;
            }
        }
        return false;
    }

//    public static int[] sort(int[] toSort){
//            for(int i  = 0;)
//    }

    //example 1,5,1,3,7,9,1
    public static int[] bubbleSort(int[] toSort){
        //we start with creating a temp where it stores the current value
        int temp;
        // first loop goes to the first number and after goes through the second loop
        for(int i  = 0; i < toSort.length-1; i++){
            System.out.println("hi to i: "+ toSort[i]);
            // second loop goes and sorts the number depending on the if statement
            for (int j = 0; j < toSort.length-1; j++){
                System.out.println("hi to j: "+ toSort[j]);
                // toSort is greater than the next index : true or false?
                // true
                if(toSort[j] > toSort[j+1]){
                    // temp takes the current value of j
                    temp = toSort[j];
                    //current and equal it to the next index
                    toSort[j] = toSort[j+1];
                    //
                    toSort[j+1] = temp;
                }
                System.out.println();
            }
        }
        return toSort;
    }

}

