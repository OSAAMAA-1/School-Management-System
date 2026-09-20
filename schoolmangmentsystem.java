import java.util.ArrayList;

class Student {

    private String name;
    private int id;
    private double gpa;
    private double feespaid;
    private double feestotal;

    Student(String name, int id, double gpa) {
        feespaid = 0;
        feestotal = 30000;
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public void setgpa(double gpa) {
        this.gpa = gpa;
    }

    public void updatefeespaid(double fees) {
        feespaid += fees;
        School.setTotalMoneyEarnd(feespaid);
    }

    public String getname() {
        return name;
    }

    public int getid() {
        return id;
    }

    public double getgpa() {
        return gpa;
    }

    public double getfeestotal() {
        return feestotal;
    }

    public double getfeespaid() {
        return feespaid;
    }

    public String toString() {
        return "Name: " + name + "   id: " + id + "   Gpa: " + gpa;
    }
}

class Teacher {
    private String name;
    private int id;
    private double salary;
    private double salaryEarnd;

    Teacher(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;

    }

    public void receivesalary(double salary) {
        salaryEarnd += salary;
        School.setTotalMoneySpent(salary);
    }

    public String getname() {
        return name;
    }

    public int getid() {
        return id;
    }

    public double getsalary() {
        return salary;

    }

    public String toString() {
        return "Name: " + name + "   id: " + id + "   Salary: " + salary;
    }

}

class School {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static double TotalMoneyEarnd;
    private static double TotalMoneySpent;

    School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        TotalMoneyEarnd = 0;
        TotalMoneySpent = 0;

    }

    public static void setTotalMoneyEarnd(double MoneyEarnd) {
        TotalMoneyEarnd += MoneyEarnd;
    }

    public static void setTotalMoneySpent(double MoneySpent) {
        TotalMoneySpent += MoneySpent;
    }

    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void setStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public double getTotalMoneyEarnd() {
        return TotalMoneyEarnd;
    }

    public double getTotlMoneySpent() {
        return TotalMoneySpent;
    }

    public double getNetProfit() {
        return TotalMoneyEarnd - TotalMoneySpent;
    }
}

public class schoolmangmentsystem {

    public static void main(String[] args) {
        Teacher Ali = new Teacher("Ali", 1, 7000);
        Teacher Ahmed = new Teacher("Ahmed", 2, 8000);
        Teacher Ibrahim = new Teacher("Ibrahim", 3, 6000);
        ArrayList<Teacher> Teachers = new ArrayList<>();
        Teachers.add(Ahmed);
        Teachers.add(Ali);
        Teachers.add(Ibrahim);
        Student Osama = new Student("Osama", 1, 3.5);
        Student Mohammed = new Student("Mohammed", 2, 3.7);
        Student Yousef = new Student("Yousef", 3, 3.6);
        ArrayList<Student> Students = new ArrayList<>();
        Students.add(Yousef);
        Students.add(Osama);
        Students.add(Mohammed);

        School FCI = new School(Teachers, Students);
        System.out.println(Osama);
        

    }
}