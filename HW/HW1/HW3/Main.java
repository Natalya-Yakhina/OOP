package HW.HW1.HW3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Яша", "Иванов", 35);
        Student student2 = new Student("Петрозаводск", "Петров", 28);
        Student student3 = new Student("Сидор", "Сидоров", 28);
        Student student4 = new Student("Клава", "Сидорова", 15);

        StudentOfGroup studentGroup = new StudentOfGroup();
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);


        System.out.println(studentGroup);
        System.out.println("-------------------------------------------------");

        System.out.println("Итерация по списку:");
        Iterator<Student> iterator = studentGroup.iterator();// объявляем итератор

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Имя: " + student.getLastName());
        }

        Collections.sort(student1.studentGroup);
        System.out.println("Сортировка по имени: " + student1.studentGroup);

        Collections.sort(student1.studentGroup, new NameLengthComparator()); // лист и передаем компаратор
        System.out.println("Сортировка по длинне имени: " + student1.getFirstName());
    }
}
class NameLengthComparator implements Comparator<Student> { // любой вид сравнения задаем
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getFirstName().length() - student2.getFirstName().length();
    }
}

