import java.util.ArrayList;

class Course {

    private String title;
    private int hours;
    private Teacher teacherCourse;
    private ArrayList<Student> studentsCourse;
    private int maximumCapacity;

    Course(String title, int hours, Teacher teacherCourse, ArrayList<Student> studentsCourse, int maximumCapacity) {
        this.title = title;
        this.hours = hours;
        this.teacherCourse = teacherCourse;
        this.studentsCourse = studentsCourse;
        this.maximumCapacity = maximumCapacity;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void addTeacherCourse(Teacher teacherCourse) {
        this.teacherCourse = teacherCourse;
    }

    public void addStudentCourse(Student student) {
        studentsCourse.add(student);
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public String getTitle() {
        return title;
    }

    public int getHours() {
        return hours;
    }

    public Teacher getTeacherCourse() {
        return teacherCourse;
    }

    public ArrayList<Student> getStudentsCourse() {
        return studentsCourse;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

}