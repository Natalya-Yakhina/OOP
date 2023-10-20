package HW.HW5.Model;

public class Student extends User {
    private int studentId;

    public Student(String name, String group, int age, int studentId) {
        super(name, group, age);
        this.studentId = studentId;
    }
    public Student(String studentId, int studentId1) { // кажется лишним?
        super(studentId);
        this.studentId = studentId1;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                '}';
    }
    public void getInfoStudent(String name, String group, int age, int studentId) { // получить информацию по студенту
        System.out.println("Student:" + name + group + age + studentId);
    }
}
