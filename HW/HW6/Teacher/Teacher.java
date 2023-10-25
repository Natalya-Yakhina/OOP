package HW.HW6.Teacher;

import HW.HW6.User.User;
import HW.HW6.UserInterface.UserInterface;

public class Teacher extends User implements Comparable<Teacher>, UserInterface {

// Класс Teacher, с применением принципов: инкапсуляции(обращение к полям класса через get/set), наследования (от класса User).
// В классе Teacher применен принцип единственной ответственности (SRP), он наследует все поля от класса User и имеет одно поле (teacherId)

// LSP - Принцип подстановки лисков проверяется путем заменф объектов наследниками,
// если класс User заменить Teacher или Student, программа продолжит работать.

// OSP - Принцип открытости/закрытости реализован путем создания getter & setter. При обращении к полям класса
// через эти методы соблюдается принцип закрытости для модификации, а создание классов-наследников позволяет
// соблюсти принцип открытости - то есть сущности открыты для дальнейших расширений.
    private int teacherID;

    public Teacher(String firstName, String lastName, String patronymic, int teacherID) {
        super();
        setFirstName(firstName);
        setLastName(lastName);
        setPatronymic(patronymic);
        setTeacherID(teacherID);
    }

    public Teacher() {
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public int compareTo(Teacher o) {
        return getTeacherID().compareTo(o.teacherID);
    }

    @Override
    public String toString() {
        return "Учитель: " +
                "фамилия = " + firstName +
                ", имя = " + lastName +
                ", отчество = " + patronymic;
    }
}
