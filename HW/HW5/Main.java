package HW.HW5;

import HW.HW5.Controller.Controller;
import HW.HW5.Model.Student;
import HW.HW5.Model.Teacher;
import HW.HW5.View.GroupView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Иванова", "Ирина", "Ивановна", 64, "Математика", 1);
        Teacher teacher2 = new Teacher("Сидорова", "Клавдия", "Семеновна", 48, "Русский язык", 13);

        List<Teacher> teacherList = new ArrayList<>();

        Student student1 = new Student("Яхина", "Наталья", "Андреевна", 30, 22);
        Student student2 = new Student("Адамец", "Сергей", "Александрович", 28, 16);
        Student student3 = new Student("Веревкин", "Евгений", "Армянович", 30, 44);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Controller controller = new Controller();

        GroupView groupView = new GroupView();
        groupView.getTeacherID(controller, teacher1);
        groupView.getTeacherID(controller, teacher2);
        groupView.getStudentID(controller, student1);
        groupView.getStudentID(controller, student3);

        groupView.getAllGroup(studentList, teacher2, controller);
// --------------------------------------------------------------------------------------------------------------------
//        StudentGroup studentGroup = new StudentGroup(teacher1, studentList);
//        System.out.println(studentGroup);

    }
}