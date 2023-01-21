public class Grade {


        public static void main(String[] args) {
            // Do NOT modify the main method.
            Student[] students = {new Student("Alice"), new Student("Bob"), new Student("Carol")};
            Subject[] subjects = {new Subject("Maths"), new Subject("English"), new Subject("German")};
            Result[] gradebook = {
                    new Result(students[0], subjects[0], 80),
                    new Result(students[0], subjects[1], 65),
                    new Result(students[0], subjects[2], 55),
                    new Result(students[1], subjects[0], 50),
                    new Result(students[1], subjects[1], 40),
                    new Result(students[1], subjects[2], 90),
                    new Result(students[2], subjects[0], 30),
                    new Result(students[2], subjects[2], 70),
            };

            System.out.println("Alice's average score is "+mean(gradebook, students[0]));
            System.out.println("The average score in German is "+mean(gradebook, subjects[2]));
            System.out.println("Carol passed "+passingGrades(gradebook, students[2]) + " subjects.");
            System.out.println("Alice is taking advanced classes, and passes at 60%. She passed "+passingGrades(gradebook, students[0], 60)+" subjects.");

            Result highest = highestResult(gradebook);
            System.out.println("The best performing result was a score of"+highest.score()+
                    ", achieved by "+highest.student().name()+" in "+highest.subject().name());

        }

        public static double mean(Result[] grades, Student student) {
            // COMPLETE THIS METHOD
            // Return the mean score of the results in grade
            // WHERE the student who achieved it is _student_
            double sum= 0;
            int numberOfGrades=0;
            for(Result x:grades){
                if(x.student() == student){
                    sum +=x.score();
                    numberOfGrades++;
                }
            }
            return sum/numberOfGrades;
        }

        public static double mean(Result[] grades, Subject subject) {
            // COMPLETE THIS METHOD
            // Return the mean score of the results in grade
            // WHERE the subject is _subject_
            double sum = 0;
            int numberOfSubjects = 0;
            for(Result x : grades){
                if(x.subject() == subject){
                    sum += x.score();
                    numberOfSubjects++;
                }
            }

            return sum/numberOfSubjects;
        }

        public static Result highestResult(Result[] grades) {
            // COMPLETE THIS METHOD
            // Return the highest scoring Result in grades
            for(int i = 0; i<grades.length;i++){
              
                System.out.println(grades[i]);
            }
            return null;
        }

        public static int passingGrades(Result[] grades, Student student, int threshold) {
            // COMPLETE THIS METHOD
            // Returns the number of passing grades _student_ obtained
            // A passing grade is one that's >= the _threshold_
            return 0;
        }

        public static int passingGrades(Result[] grades, Student student) {
            // The default pass criteria is 70
            // Do NOT edit this method.
            return passingGrades(grades, student, 70);
        }
    }

    // Do NOT edit the records
    record Student(String name) {}
    record Subject(String name) {}
    record Result(Student student, Subject subject, int score) {} // Scores are out of 100


