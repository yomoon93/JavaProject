
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class Student {
    private String name;
    private String lastName;
    private int age;
    private boolean paidYN;
    private int marks;
    @JsonCreator
    public Student(@JsonProperty("theName") String name, @JsonProperty("lastName")String lastName, @JsonProperty("myAge")int age, @JsonProperty("paid")boolean paidYN, @JsonProperty("marks")int marks){
        this.name = name;

        this.lastName = lastName;
        this.age = age;
        this.paidYN = paidYN;
        this.marks = marks;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPaidYN() {
        return paidYN;
    }

    public void setPaidYN(boolean paidYN) {
        this.paidYN = paidYN;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", paidYN=" + paidYN +
                ", marks=" + marks +
                '}';
    }
}
