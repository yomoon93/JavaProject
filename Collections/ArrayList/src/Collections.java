import java.lang.reflect.Array;
import java.util.*;


public class Collections {
    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("BMW");
//        cars.add("Nissian");
//        cars.add("Voltswagon");
//        cars.add("Acura");
//        cars.add("Tesla");
//
//        System.out.println(cars);
//
//
//        Set<Integer> firstTenNumbers = new HashSet<>();
//        for(int i = 1; i < 11; i++){
//            firstTenNumbers.add(i);
//        }
//        firstTenNumbers.add(8);
//        System.out.println(firstTenNumbers);
//
//        Map<String, String> nameAddressMap = new HashMap<>();
//
//        nameAddressMap.put("Kevin", "KM24");
//        nameAddressMap.put("Eliza", "EL20");
//        nameAddressMap.put("Shabrina", "SK24");
//
//
//        nameAddressMap.get("Kevin");
//        System.out.println(nameAddressMap.get("Kevin"));
//
//        ArrayList<String> languageList = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "JavaScript", "NodeJS"));
//        System.out.println("------ArrayList------");
//
//        for(String language: languageList){
//            System.out.println(language);
//        }
//
//        System.out.println("-----HashMap------");
//        // convert ArrayListToHashMap() method directly
//        // converts ArrayList to Hashmap
//        HashMap<String, Integer> languageMap = convertArrayListToHashMap(languageList);
//        for(Map.Entry<String, Integer> entry: languageMap.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//
//
// 2nd question answer
        //creating a integer set first that's a hashSet
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
            //if number array adds a random number than add it
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
    }

    private static HashMap<String, Integer> convertArrayListToHashMap(ArrayList<String> arrayList){
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str: arrayList){
            hashMap.put(str, str.length());
        }
        return hashMap;
    }


}
