package HW.HW5.Controller;

import HW.HW5.Model.Student;
import HW.HW5.Model.StudentGroup;
import HW.HW5.Model.Teacher;
import HW.HW5.Servise.StudentGroupService;

import java.util.List;

public class Controller extends StudentGroupService {

    StudentGroupService studyGroupService;
    StudentGroup studyGroup = new StudentGroup();

    public Controller() {
        super();
        this.studyGroupService = new StudentGroupService();
    }

    public StudentGroup showGroup(Teacher teacher, List<Student> listOfStudents) { // формирование учебной группы учитель + студент, путем вызова метода из Servise
        if (teacher != null && listOfStudents != null) {
            studyGroup = studyGroupService.createStudyGroupService(teacher, listOfStudents);
        } else {
            System.out.println("Impossible to create group!");
        }
        return studyGroup;
    }
}