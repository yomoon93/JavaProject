import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordList {

    public static List<String> ListOfWords = new ArrayList<>();
    public static List<String> getWords() {return ListOfWords;}



    public void loadFile() {
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader("C:/Users/user/IdeaProjects/kevin-munar/Countdown/src/main/txtfile/valid-words.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                ListOfWords.add(line);

            }
            br.close();
        }catch (IOException a){
            System.err.println("Couldn't find the file.");
            System.err.println(a);
        }
    }

    public boolean validWord(String word) {
        WordList wordL = new WordList();
        wordL.loadFile();
        if(!wordL.getWords().contains(word)){
            return false;
        } return true;
    }


    public int calculatePoints(String word){
        int points = 0;
        //counting string length
        if(word.length() == 9){
            points = 18; //f word is length is 9 we give 18 points
        }
        else {
            points = word.length();
        }
        return points;
    }
}

