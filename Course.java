import java.util.ArrayList;

class Course {

    private String title;
    private int hours;
    private Teacher teacher;
    private ArrayList<Student> students;
    private int maximumCapacity;

    Course(String title, int hours, Teacher teacher, ArrayList<Student> students, int maximumCapacity) {
        this.title = title;
        this.hours = hours;
        this.teacher = teacher;
        this.students = students;
        this.maximumCapacity = maximumCapacity;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public String getTitle(){
        return title;
    }
    public int getHours(){
        return  hours;
    }
    public Teacher getTeacher(){
        return teacher;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
    public int getMaximumCapacity(){
        return maximumCapacity;
    }

}