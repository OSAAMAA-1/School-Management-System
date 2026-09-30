import java.util.ArrayList;

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

        // Initialize the school------------------------------

        School FCI = new School(teachers, students);

        // Run test operations and print outputs
        System.out.println(Teacher.numOfTeacher());

    }
}
