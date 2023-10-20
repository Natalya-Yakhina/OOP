package HW.HW5.Servise;

import HW.HW5.Model.Student;
import HW.HW5.Model.StudentGroup;
import HW.HW5.Model.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService() {
    }

    public StudentGroup createStudentGroup(Teacher t, List<Student> students) {
        this.studentGroup = new StudentGroup(t, students);
        return this.studentGroup;
    }

    public void addStudent(Student student) {
        if (!this.getStudentList().contains(student)) {
            this.getStudentList().add(student);
        }
    }

    public List<Student> getStudentList() {
        return this.studentGroup.getStudentList();
    }

    public Teacher getTeacher() {
        return this.studentGroup.getTeacher();
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    //    private StudentGroup studentGroup;
//    private List<StudentGroup> studentGroups;
//
//    public StudentGroupServise() {
//        this.studentGroups = new ArrayList<>();
//    }
//
//    public Teacher CreateGroup(Teacher teacher, List<Student> students) {
//        studentGroup = new StudentGroup(teacher, students);
//        studentGroups.add(studentGroup);
//        return studentGroup.getTeacher();
//    }
}