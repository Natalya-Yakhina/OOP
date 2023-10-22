package HW.HW5;

import HW.HW5.Controller.Controller;
import HW.HW5.Model.Student;
import HW.HW5.Model.Teacher;
import HW.HW5.View.ModelView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacherAleksandr = new Teacher(" Aleksandr ", " Sidorov ", 34, " Biology ", 14);

        Student studentKolya = new Student("Kolya", "Kolin", 22, 20);
        Student studentVladimir = new Student("Vladimir", "Popov", 23, 21);
        Student studentSergey = new Student("Sergey", "Petrov", 24, 22);
        Student studentMasha = new Student("Masha", "Ivanova", 21, 23);
        Student studentKatya = new Student("Katya", "Petruneva", 26, 24);

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentKolya);
        studentList.add(studentKatya);
        studentList.add(studentSergey);
        studentList.add(studentMasha);
        studentList.add(studentVladimir);
        //ver 1
        Controller controller = new Controller();
//        System.out.println("Teacher ID: " + controller.getTeacherID(teacherAleksandr));
//        System.out.println("Student ID: " + controller.getStudentID(studentKatya));
//        System.out.println(controller.showGroup(teacherAleksandr,studentList));
//        // ver 2
//        StudyGroup studyGroup = controller.createStudyGroupService(teacherAleksandr, studentList);
//        System.out.println(studyGroup);

        ModelView modelView = new ModelView();
        modelView.getTeacherID(controller,teacherAleksandr);
        modelView.getStudentID(controller,studentSergey);

        modelView.getAllGroup(studentList,teacherAleksandr,controller);
    }

}