package HW.HW5.Servise;

import HW.HW5.Model.Student;
import HW.HW5.Model.StudentGroup;
import HW.HW5.Model.Teacher;

import java.util.List;

public class StudentGroupService extends StudentGroup {
    private StudentGroup studentGroup;
    List<Student> students;

    public StudentGroupService() {
    }

    public int getTeacherId(Teacher teacher) {
        return teacher.getIDTeacher();
    }

    public StudentGroup createStudyGroupService(Teacher teacher, List<Student> students) { // создание группы учитель + студенты
        studentGroup = new StudentGroup(teacher, students);
        return studentGroup;
    }
}