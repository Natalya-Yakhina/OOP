package HW.HW5.Model;

import java.util.List;

public class StudentGroup extends User {
    Teacher teacher;
    List<Student> listOfStudent;

    public StudentGroup() {
    }

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.listOfStudent = students;
    }

    public int getTeacherID(Teacher teacher) { // ID учителя
        return teacher.teacherID;
    }

    public int getStudentID(Student student) { // ID студента
        return student.getStudentID();
    }

    @Override
    public String toString() {
        return "УЧЕБНАЯ ГРУППА : " +
                "Учитель = " + teacher +
                ", Студент = " + listOfStudent;
    }
}