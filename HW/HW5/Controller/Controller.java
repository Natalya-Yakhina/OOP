package HW.HW5.Controller;

import HW.HW5.Model.Student;
import HW.HW5.Model.StudyGroup;
import HW.HW5.Model.Teacher;
import HW.HW5.Servise.StudyGroupService;

import java.util.List;

public class Controller extends StudyGroupService {

    StudyGroupService studyGroupService;
    StudyGroup studyGroup = new StudyGroup();
    public Controller() {
        super();
        this.studyGroupService = new StudyGroupService();
    }

    /**
     * @return создание группы(Учитель+Студенты)
     */
    public StudyGroup showGroup(Teacher teacher, List<Student> listOfStudents) {
        if (teacher != null && listOfStudents != null) {
            studyGroup = studyGroupService.createStudyGroupService(teacher, listOfStudents);
        } else {
            System.out.println("Impossible to create group!");
        }
        return studyGroup;
    }
//    public int showTeacher(Teacher teacher) {
//        return studyGroupService.getTeacherID(teacher);
//    }
//    public List<Student> showStudents(List<Student> studentList) {
//        return studyGroupService.getListOfStudent();
//    }
}