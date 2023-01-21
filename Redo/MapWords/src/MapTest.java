
import java.util.*;
public class MapTest {


    static void characterCount(String inputString)
    {
        // Creating a HashMap containing char
        // as a key and occurrences as  a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> letterCountMap = new HashMap<Character, Integer>();

        for (Character l : letters) {
            if (letterCountMap.containsKey(l)) {
                letterCountMap.put(l, letterCountMap.get(l)+1);
            }
            else {
                letterCountMap.put(l,1);
            }
        }
        for (Map.Entry entr : letterCountMap.entrySet()) {
            System.out.println(entr.getKey() + " " + entr.getValue());
        }
        System.out.println("----------------------------------");
        // Converting given string to char array
        // checking each char of strArray
        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {

                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {

                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }

        // Printing the charCountMap
        for (Map.Entry<Character,Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(letterCountMap.get(entry.getKey()) < entry.getValue()){

            }
        }

    }
    // Driver Code
    static List<Character> letters = new ArrayList<>();
    public static void main(String[] args)
    {
        letters.add('a'); letters.add('t');letters.add('a');letters.add('y');letters.add('a');letters.add('m');
        letters.add('d'); letters.add('a');letters.add('a');letters.add('a');letters.add('o');letters.add('a');
//        for (Character i : letters) {
//            System.out.println(i);
//        }
        String str = "aderawyu";
        characterCount(str);
    }
    }




