package HW.HW5.Servise;

import HW.HW5.Model.Student;
import HW.HW5.Model.StudyGroup;
import HW.HW5.Model.Teacher;

import java.util.List;

public class StudyGroupService extends StudyGroup {
    private StudyGroup studyGroup;
    List<Student> students;
    public StudyGroupService() {
    }
    public int getTeacherId(Teacher teacher) {
        return teacher.getTID();
    }
    /**
     * @return Возврат созданной группы(Учитель+Студенты)
     */
    public StudyGroup createStudyGroupService(Teacher teacher, List<Student> students) {
        studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }
}