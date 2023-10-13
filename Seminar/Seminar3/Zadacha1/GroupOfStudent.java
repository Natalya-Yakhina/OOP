package Seminar.Seminar3.Zadacha1;

import Seminar.Seminar3.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupOfStudent implements Iterable<Student> {
    String nameOfGroup;
    private List<Student> numberOfStudent = new ArrayList<Student>();
    private int index = 0;

    public GroupOfStudent(String nameOfGroup, List<Student> numberOfStudent) {
        this.nameOfGroup = nameOfGroup;
        this.numberOfStudent = numberOfStudent;
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
