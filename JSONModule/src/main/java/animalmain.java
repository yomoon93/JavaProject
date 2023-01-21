import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class animalmain {
    public static void main(String[] args) throws JsonProcessingException {
        String input = "{\"type\":\"Cat\",\"name\":\"fluffles\",\"age\":3}";
        ObjectMapper mapper1 = new ObjectMapper();
        Animal kev = mapper1.readValue(input, Animal.class);
        System.out.println(kev);

        try{
            mapper1.readValue(input,Animal.class);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
