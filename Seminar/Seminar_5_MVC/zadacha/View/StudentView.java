package Seminar.Seminar_5_MVC.zadacha.View;

import Seminar.Seminar_5_MVC.zadacha.Controller.StudentController;

// � Создать package – view. Работу продолжаем в нем
//� Создать класс StudentView, содержащий в себе метод вывода в консоль
//данных студента поданных на вход
public class StudentView {
    StudentController controllerStudent = new StudentController();

    public StudentView() {
        this.controllerStudent = controllerStudent;
    }

    public void saveStudent(String name, String group, int age, String studentId) {
        controllerStudent.addStudent(name, group, age, studentId);
    }

    public void getStudent(String name) {
        controllerStudent.getStudent(name);
    }
}

