package HW.HW5.View;

import HW.HW5.Model.Student;

public class StudentView {
//    StudentController controllerStudent = new StudentController();
//
//    public StudentView() {
//        this.controllerStudent = controllerStudent;
//    }
//
//    public void saveStudent(String name, String group, int age, String studentId) {
//        controllerStudent.addStudent(name, group, age, studentId);
//    }
//
//    public void getStudent(String name) {
//        controllerStudent.getStudent(name);
//    }
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }
}