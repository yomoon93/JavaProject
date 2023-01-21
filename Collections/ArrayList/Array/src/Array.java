import java.util.*;

public class Array   {


    public static void main(String[] args) {
        CreateArray();
        int[] myArray = new int[6];



    }



    public static void Duplicate(int[] arr){
        int i = 0;
        // while it is less than 6
        while(i < 6){
            // we initiate the boolean to false bc its not a duplicate at first
            boolean dup = false;
            // we create a random number
            int random = (int)(Math.random()* 49 + 1);
            // loop through the arr and at every space we are going to add something it
            // but we add a number at every space in the array
            for(int x = 0; x < arr.length; x++)
                // if the array position has a duplicate we change the boolean to true and break the loop
                if(arr[x] == random){
                    dup = true;
                    break;
                }
            // if dup not false
            if(!dup){
                // we add the random number to the array we created
                arr[i] = random;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void CreateArray(){
        List<Integer> kArray = new ArrayList<>();
       for(int i = 0; i < 6; i++){
           int random = (int)(Math.random()* 49 +1);
           if(!kArray.contains(random)){
               kArray.add(random);
           }
       }
       // this sorts its
       Collections.sort(kArray);
        System.out.println(kArray);
        // We now create a set and this allows us to have unique numbers and the linkedHashset allows it to stay in order
        Set<Integer> set = new LinkedHashSet<>(kArray);
        System.out.println(set);
    }


}

//    public static void main(String[] args) {
//        int[] myArray = new int[6];
//        boolean dub = true;
//        int i = 0;
//        while(i < myArray.length){
//            int random = (int)((Math.random()* 49 +1));
//            //without any braces it just does the first if statement
//            for (int x = 0; x < i; x++)
//                if(myArray[x] == random){
//                    dub = false;
//                }
//            // the second if isnt referring to the x so we are ok
//            if(dub) {
//                myArray[i] = random;
//                i++;
//            }
//            // we changed it to false so we must re-make it to true
//            dub = true;
//
//
//        }
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));
//    }












//    public static void main(String[] args) {
//        int[] myArray = new int[6];
//        int i = 0;
//        while(i < myArray.length){
//            boolean dub = false;
//            int random = (int) (Math.random()* 7 +1);
//            for(int i = 0; i < myArray.length; i++){
//                if(myArray[i] == random){
//                    dub = true;
//                    break;
//                }
//                if(!dub)
//            }
//
//        }
//    }



//        int[] anArray;
//        anArray = new int[6];
//
//manually
//
//            for (int x = 0; x < anArray.length; x++){
//                anArray[x] = (int) (Math.random()*49+1);
//            }
//            Arrays.sort(anArray);
//        System.out.println(Arrays.toString(anArray));

//        Duplicate(myArray);

// 2nd question answer
//creating a integer set first that's a hashSet
        /*
        Set<Integer> number = new HashSet<>();
        // we loop to make 6 unique sets
        // this is not needed for the lab just a test
//        for (int i = 1; i <= 6; i++){
        Set<Integer> set = new HashSet<>();
        //so while set size is less than 6
        Integer[] array = set.toArray(new Integer[] {});
        while (set.size() < 6){
            //we create random number in this variable
            int random = (int)(Math.random() * 49 +1);
            // so we take our number and add if it adds a random which it does
            if(number.add(random)){
                // we set the number to random
                set.add(random);
            }
//            }
            // we create an array of type Integer and add it to the new array (Hashset) created
            array = set.toArray(new Integer[] {});
            // we sort it and print
            Arrays.sort(array);
//            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
*/
