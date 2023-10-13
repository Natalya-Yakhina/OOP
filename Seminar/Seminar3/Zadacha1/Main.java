package Seminar.Seminar3.Zadacha1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Иван", "Иванов", 25);
        Student student2 = new Student("Петр", "Петров", 25);
        Student student3 = new Student("Сидор", "Сидоров", 25);

        GroupOfStudent groupOfStudent = new GroupOfStudent("первая", new ArrayList<>());
        groupOfStudent.addStudent(student1);
        groupOfStudent.addStudent(student2);
        groupOfStudent.addStudent(student3);

        System.out.println(groupOfStudent);
        System.out.println("-------------------------------------------------");

        System.out.println("Итерация по списку:");
        Iterator<Student> iterator = groupOfStudent.iterator(); // объявляем итератор

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Имя: " + student.getName());
        }

//        Collections.sort(student1.students);
//        System.out.println("Сортировка по имени: " + student1.students);

        Collections.sort(student1.students, new NameLengthComparator()); // лист и передаем компаратор
        System.out.println("Сортировка по длинне имени: " + student1.students);
    }
}