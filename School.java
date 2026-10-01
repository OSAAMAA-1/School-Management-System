import java.util.ArrayList;;

class School {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static double totalMoneyEarnd;
    private static double totalMoneySpent;
    private ArrayList<Course> courses;

    School(ArrayList<Teacher> teachers, ArrayList<Student> students, ArrayList<Course> courses) {
        this.teachers = teachers;
        this.students = students;
        this.courses = courses;
        totalMoneyEarnd = 0;
        totalMoneySpent = 0;
    }

    public static void updateTotalMoneyEarnd(double moneyEarnd) {
        if (moneyEarnd > 0) {
            totalMoneyEarnd += moneyEarnd;
        } else {
            throw new IllegalArgumentException("Money earnd must be a positive number");
        }

    }

    public static void updateTotalMoneySpent(double moneySpent) {
        if (moneySpent > 0) {
            totalMoneySpent += moneySpent;
        } else {
            throw new IllegalArgumentException("Money spent must be a positive number");
        }
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourses(Course course) {
        courses.add(course);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    public double getTotalMoneyEarnd() {
        return totalMoneyEarnd;
    }

    public double getTotlMoneySpent() {
        return totalMoneySpent;
    }
    

}
