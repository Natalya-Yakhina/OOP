package Seminar.Seminar3.Zadacha1;

public class Student {
    String Name;
    String Surname;
    int Age;

    public Student(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "Имя = " + Name + ", " +
                "Фамилия = " + Surname + ", " +
                "Возраст = " + Age;
    }
}
