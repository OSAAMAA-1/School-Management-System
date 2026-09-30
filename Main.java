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
        teachers.add(Ahmed);
        teachers.add(Ali);
        teachers.add(Ibrahim);

        // Create student instances ---------------------

        Student Samy = new Student("Samy", 11, 2.7);
        Student Yossef = new Student("Yossef", 5, 3.0);
        Student Omar = new Student("Omar", 6, 3.4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(Yossef);
        students.add(Samy);
        students.add(Omar);

        // Create set of student course ---------------------

        Set<Student> studentsCourse = new HashSet<>();

        // Initialize the school------------------------------

        School FCI = new School(teachers, students);

        // Run test operations and print outputs
        Course c1 = new Course("OOP", 20, Ibrahim, studentsCourse, 10);
        c1.addStudentCourse(Omar);
        c1.addStudentCourse(Samy);
        c1.addStudentCourse(Yossef);

        System.out.println(c1.getHours());
        System.out.println(c1.getStudentsCourse());
    }
}
