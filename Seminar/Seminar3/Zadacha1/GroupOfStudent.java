package Seminar.Seminar3.Zadacha1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class GroupOfStudent implements Iterable<Student>, Comparable<Student> {
    String nameOfGroup;
    List<Student> numberOfStudent = new ArrayList<Student>();
    private int index = 0;


    public GroupOfStudent(String nameOfGroup, List<Student> numberOfStudent) {
        this.nameOfGroup = nameOfGroup;
        this.numberOfStudent = numberOfStudent;
    }

    public GroupOfStudent(List<Student> students) {
        this.students = students;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void addStudent(Student student) {
        if (student != null) {
            numberOfStudent.add(student);
        }
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public List<Student> getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(List<Student> numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    @Override
    public String toString() {
        return "Учебная группа: " + '\n' +
                "Количество студентов: " + '\n' + numberOfStudent; // количество студентов
    }

    @Override
    public Iterator<Student> iterator() { // вызывает итератор
        return new StudentIterator();
    }

    @Override
    public int compareTo(Student o) {
        return this.nameOfGroup.compareTo(o.getName());
    }

    private class StudentIterator implements Iterator<Student> {

        @Override
        public boolean hasNext() {
            return index < numberOfStudent.size();
        }

        @Override
        public Student next() {
            if (hasNext()) {
                return numberOfStudent.get(index++);
            }
            return null;
        }

        @Override
        public void remove() {
            numberOfStudent.remove(index);
        }
    }
}
class NameLengthComparator implements Comparator<Student> { // любой вид сравнения задаем
    @Override
    public int compare(Student student1, Student student2) { // Comparator
        return student1.getName().length() - student2.getName().length(); // сравнение по длинне имени
    }

}
