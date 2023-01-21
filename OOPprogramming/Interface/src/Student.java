import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student implements Comparable<Student> {

    String firstName;
    String surName;
    private int studentId;
    private static int totalStudents = 1;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getStudentId() {
        return studentId;
    }

//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//    }

    public Student(String fName, String sName){
        this.firstName = fName;
        this.surName = sName;
        this.studentId = totalStudents;
        totalStudents++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        //if last name compared to the last name is 0(equal) AND the first name compared to the first name is also 0(equal), then the names are equal)

        if (this.surName.compareTo(s.surName) == 0 && this.firstName.compareTo(s.firstName) == 0) {
            return 0;
            //if the last name compared to the last name is 0(equal), then move to return/compare first names;
        } else if (this.surName.compareTo(s.surName) == 0) {
            return this.firstName.compareTo(s.firstName);
        }//if first AND last names are not the same(step 1) and last names are not the same(step 2) , compare last names;
        return this.surName.compareTo(s.surName);
    }
//    public int compareTo(Student s){
//        return this.studentId - s.studentId;
//    }


    static List<Student> myList = new ArrayList<>();

    public static void main(String[] args) {
        Student s1 = new Student("Kevin", "Munar");
        Student s2 = new Student("Frank", "Ortiz");
        Student s3 = new Student("Carrick", "Zapata");
        Student s4 = new Student("John", "Romero");



        myList.add(s1);
        myList.add(s2);
        myList.add(s3);
        myList.add(s4);
//            for(Student x: myList){
//
//
//            }



        Collections.sort(myList);
        System.out.println(myList);
    }

}
