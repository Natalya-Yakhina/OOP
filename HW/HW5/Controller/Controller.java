package HW.HW5.Controller;

import HW.HW5.Model.Student;
import HW.HW5.Model.Type;
import HW.HW5.Servise.ServiceData;
import HW.HW5.Servise.StudentGroupService;
import HW.HW5.View.StudentGroupView;
import HW.HW5.View.StudentView;

import java.util.List;

public class Controller {
    ServiceData dataService = new ServiceData();
    StudentView studentView = new StudentView();
    StudentGroupView studentGroupView = new StudentGroupView();
    StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudent(String name, String group, int age, int studentId){
        dataService.create(name,group,age, Type.STUDENT);
    }
    public void createTeacher(String name, String group, int age, int teacherId){
        dataService.create(name,group,age,Type.TEACHER);
    }
    public void getAllStudents(){
        List<Student> students = dataService.getAllStudent();
        for (Student s: students){
            studentView.printOnConsole(s);
        }
    }
    public void printStudentGroup(){
        studentGroupView.printStudentGroup(studentGroupService.getStudentGroup());
    }
    public void createStudentGroup(){
        studentGroupService.createStudentGroup(dataService.getTeacher(),dataService.getAllStudent());
    }
}
