package HW.HW1.HW3;

import java.util.ArrayList;
import java.util.List;

public class StudentOfGroup {
    private List<Student> studentsList;

    public StudentOfGroup() {
        studentsList = new ArrayList<>();
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudent(Student student){
        if (student != null){
            studentsList.add(student);
        }
    }
    @Override
    public String toString() {
        return "СПИСОК СТУДЕНТОВ: " + studentsList;
    }
    public IteratorStudentOfGroup iterator() {
        return new IteratorStudentOfGroup(this);
    }
}
