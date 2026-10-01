import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create teacher instances -------------------

        Teacher Ali = new Teacher("Ali", 1, 8000);
        Teacher Ahmed = new Teacher("Ahmed", 2, 9000);
        Teacher Ibrahim = new Teacher("Ibrahim", 3, 7000);
        ArrayList<Teacher> teachers = new ArrayList<>();

        // Create student instances ---------------------

        Student Samy = new Student("Samy", 11, 2.7);
        Student Yossef = new Student("Yossef", 5, 3.0);
        Student Omar = new Student("Omar", 6, 3.4);
        ArrayList<Student> students = new ArrayList<>();

        // Create set of student course ---------------------

        Set<Student> studentsCourse = new HashSet<>();

        // Create courses instances----------------------------

        Course c1 = new Course("OOP", 20, Ibrahim, studentsCourse, 10);
        Course c2 = new Course("Java", 15, Ali, studentsCourse, 9);
        ArrayList<Course> courses = new ArrayList<>();

        // Initialize the school------------------------------

        School FCI = new School(teachers, students);
        FCI.addStudent(Omar);
        FCI.addStudent(Samy);
        FCI.addStudent(Yossef);
        FCI.addTeacher(Ibrahim);
        FCI.addTeacher(Ahmed);
        FCI.addTeacher(Ali);
        FCI.addCourses(c1);
        FCI.addCourses(c2);
        
        // Run test operations and print outputs
        System.out.println(FCI.getCourses());


    }
}
