import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {

    public static void vaildWords() throws IOException{
        List <String> vaildWords = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/user/IdeaProjects/kevin-munar/Countdown/src/main/txtfile/valid-words.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            vaildWords.add(line);
        }
        System.out.println(vaildWords);
        br.close();
    }
}






