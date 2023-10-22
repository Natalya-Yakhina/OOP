package HW.HW5.Model;

public class Student extends User {
    protected int studentID;

    public Student(String name, String surname, int age, int studentID) {
        super(name, surname, age);
        this.studentID = studentID;
    }
    /**
     *
     * @return ID студента;
     */
    public int getStudentID() {
        return studentID;
    }
    @Override
    public String toString() {
        return " Student ID: " + studentID +
                " Student Name " + name  +
                " Student Surname: " + surname + "\n";
    }
}