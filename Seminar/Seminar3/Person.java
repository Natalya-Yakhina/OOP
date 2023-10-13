package Seminar.Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Person implements Comparable<Person>, Iterable<Person> { // может быть как одним человеком так и списком людей
    // Comparable - сравнивает людей между собой
    // Iterable - итерирует по людям

    private String name; // имя
    private List<Person> people = new ArrayList<>(); // список людей
    private int index = 0; // нужен для реализации интерфейса

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person otherPerson) { // Comparable (задаем Олега и сравниваем с Сашей)
        return this.name.compareTo(otherPerson.getName()); // возвращаем имя, которое сравниваем с другим именем
        // compareTo - сравнивать в алфавитном порядке
    }

    @Override
    public String toString() {
        return name;
    }

    public void addPerson(Person person) { // добавить человека
        people.add(person);
    }

    @Override
    public Iterator<Person> iterator() { // вызывает итератор, который мы написали
        return new PersonIterator(); // передаем тот итератор, для класса персон
    }

    private class PersonIterator implements Iterator<Person> { // итератор
        @Override
        public boolean hasNext() {
            return index < people.size(); // проверяет не выходим ли мы за индекс
        }

        @Override
        public Person next() {
            if (hasNext()) {
                return people.get(index++);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");
        Person person3 = new Person("Charlie");
        Person person4 = new Person("David");

        person1.addPerson(person1);
        person1.addPerson(person2);
        person1.addPerson(person3);
        person1.addPerson(person4);

//        System.out.println("Исходный список: " + person1);

        Collections.sort(person1.people);
        System.out.println("Сортировка по имени: " + person1.people);

        Collections.sort(person1.people, new NameLengthComparator()); // лист и передаем компаратор
        System.out.println("Сортировка по длинне имени: " + person1.people);

//        System.out.println("Итерация по списку:");
//        for (Person person : person1) {
//            System.out.println("Имя: " + person.getName());

        System.out.println("Итерация по списку:");
        Iterator<Person> iterator = person1.iterator(); // объявляем итератор
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("Имя: " + person.getName());
        }
    }
}

class NameLengthComparator implements Comparator<Person> { // любой вид сравнения задаем
    @Override
    public int compare(Person person1, Person person2) { // Comparator
        return person1.getName().length() - person2.getName().length(); // сравнение по длинне имени
    }


}
