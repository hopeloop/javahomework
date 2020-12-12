package W3;

public class Q13_13_使得Course类可复制 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course1= new Course("Java");
        course1.addStudent("aa");
        course1.addStudent("bb");
        course1.addStudent("cc");
        System.out.println(course1.getCourseName()+"学生有：");
        for(int i=0;i<course1.getNumberOfStudents();i++){
            System.out.println(course1.getStudents()[i]);
        }

        Course course2=course1.clone();
        System.out.println(course2.getCourseName()+"(cloned)学生有：");
        for(int i=0;i<course1.getNumberOfStudents();i++){
            System.out.println(course2.getStudents()[i]);
        }
        }
    }


class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public Course clone()throws CloneNotSupportedException{
        Course cloned_course = (Course) super.clone();
        cloned_course.students = students.clone();
        return cloned_course;
    }
}