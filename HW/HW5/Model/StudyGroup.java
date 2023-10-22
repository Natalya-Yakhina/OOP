package HW.HW5.Model;

import java.util.List;

public class StudyGroup extends User {
    Teacher teacher;
    List<Student> listOfStudent;
    public StudyGroup() {
    }
    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.listOfStudent = students;
    }
    /**
     * @return ID учителя;
     */
    public int getTeacherID(Teacher teacher) {
        return teacher.teacherID;
    }

    /**
     * @return ID студента;
     */
    public int getStudentID(Student student){
        return student.getStudentID();
    }
    @Override
    public String toString() {
        return "StudyGroup: "
                + teacher +
                "Students:"+ "\n" + listOfStudent;
    }
}