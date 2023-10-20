package HW.HW5;

import HW.HW5.Controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createStudent("Aynur", "3", 55, 5);
        controller.createStudent("jo", "2", 18, 1);
        controller.createTeacher("Elisa", "3", 22, 2);
        controller.createTeacher("Ирина Ивановна", "2", 60, 16);

        controller.createStudentGroup();
        controller.printStudentGroup();
    }
}