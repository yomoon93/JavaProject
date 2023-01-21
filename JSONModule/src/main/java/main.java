import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Student Kevin = new Student("Kevin", "Munar",29,true, 100);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
//        mapper.writeValue(new File("student.json"), Kevin);
//        String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(Kevin);

        Student s = mapper.readValue(new File("student.json"),Student.class);
        System.out.println(s);

        try{
             mapper.writeValue(new File("student.json"),s);
        }catch (IOException e){
            System.out.println(e);
        }


    }
}
