
import java.util.Set;
import java.util.HashSet;

class Course {

    private String title;
    private int hours;
    private Teacher teacherCourse;
    private Set<Student> studentsCourse;
    private int maximumCapacity;

    Course(String title, int hours, Teacher teacherCourse, Set<Student> studentsCourse, int maximumCapacity) {
        setTitle(title);
        setHours(hours);
        this.teacherCourse = teacherCourse;
        this.studentsCourse = studentsCourse;
        setMaximumCapacity(maximumCapacity);

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
        if (studentsCourse.size() <= maximumCapacity) {

            studentsCourse.add(student);
        } else {
            throw new IllegalArgumentException("Cannot enroll course is full");
        }
    }

    public void setMaximumCapacity(int maximumCapacity) {
        if (maximumCapacity >= 0) {

            this.maximumCapacity = maximumCapacity;
        } else {
            throw new IllegalArgumentException("Maximum capacity must be a positive number");
        }
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

    public Set<Student> getStudentsCourse() {
        return studentsCourse;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

}