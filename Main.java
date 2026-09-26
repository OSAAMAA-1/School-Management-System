import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher Ali=new Teacher("Ali", 1, 8000);
        Teacher Ahmed=new Teacher("Ahmed", 2, 9000);
        Teacher Ibrahim=new Teacher("Ibrahim", 3, 7000);
        ArrayList<Teacher>teachers=new ArrayList<>();
        teachers.add(Ahmed);
        teachers.add(Ali);
        teachers.add(Ibrahim);
        Student Mohammed=new Student("Mohammed", 07, 3.5);
        Student Yossef=new Student("Yossef", 5, 3.0);
        Student Omar=new Student("Omar", 6, 3.4);
        ArrayList<Student>students=new ArrayList<>();
        students.add(Yossef);
        students.add(Mohammed);
        students.add(Omar);
        School FCI=new School(teachers, students);
        System.out.println(Omar.getName());
        Omar.updateFeesPaid(8000);
        System.out.println(Mohammed.getName());
        Mohammed.updateFeesPaid(9000);
        System.out.println(FCI.getTotalMoneyEarnd());
        System.out.println(Omar.getRemainingFees());
        
    }
}
