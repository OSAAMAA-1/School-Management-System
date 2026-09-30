import java.util.ArrayList;

class Course {

    private String title;
    private int hours;
    private Teacher teacherCourse;
    private ArrayList<Student> studentsCourse;
    private int maximumCapacity;

    Course(String title, int hours, Teacher teacherCourse, ArrayList<Student> studentsCourse, int maximumCapacity) {
        setTitle(title);
        setHours(hours);
        this.teacherCourse = teacherCourse;
        this.studentsCourse = studentsCourse;
        this.maximumCapacity = maximumCapacity;

    }

    public void setTitle(String title) {
        title.trim();
        if (title.matches("[a-zA-Z0-9 ]+")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title");
        }
    }

    public void setHours(int hours) {
        if (hours > 0) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Hours must be positive number");
        }
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