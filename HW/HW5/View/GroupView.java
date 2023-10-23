package HW.HW5.View;

import HW.HW5.Controller.Controller;
import HW.HW5.Model.Student;
import HW.HW5.Model.Teacher;

import java.util.List;

public class GroupView {
    Controller controllerGroup = new Controller();

    public GroupView() {
    }

    public void getTeacherID(Controller controllerGroup, Teacher teacher) { // ID учителя
        System.out.println("Teacher ID: " + controllerGroup.getTeacherID(teacher));
    }

    public void getStudentID(Controller controllerView, Student student) { // ID студента
        System.out.println("Student ID: " + controllerGroup.getStudentID(student));
    }

    public void getAllGroup(List<Student> studentList, Teacher teacher, Controller controllerGroup) { // вся группа
        System.out.println(controllerGroup.showGroup(teacher, studentList));
    }
}