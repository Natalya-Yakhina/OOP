//package HW.HW5.Controller;
//
//import HW.HW5.Model.Student;
//import HW.HW5.Model.Teacher;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TeacherController {
//    private List<Teacher> teacher;
//    // List<Teacher> teacher список преподавателей
//    public TeacherController() {
//        this.teacher = new ArrayList<>();
//    }
//    /**
//     * @params addTeacher - добавляет преподавателей в список.
//     */
//    public void addTeacher(String name, String group, int age, String teacherSubject) {
//        teacher.add(new Teacher(name, group, age, teacherSubject));
//    }
//
//    /**
//     * @params getTeacher - выводит результат поиска преподавателей в списке.
//     */
//    public Teacher getTeacher(String name) {
//        for (int i = 0; i < teacher.size(); i++) {
//            if (teacher.get(i).getName().equals(name)) {
//                System.out.println("Преподаватель найден!");
//                System.out.println(teacher.get(i));
//            } else {
//                System.out.println("Такого преподавателя нет!");
//            }
//        }
//        return null;
//    }
//
//    public List<Teacher> getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(List<Teacher> teacher) {
//        this.teacher = teacher;
//    }
//
//    @Override
//    public String toString() {
//        return "TeacherController{" +
//                "преподаватель = " + teacher;
//    }
//}
