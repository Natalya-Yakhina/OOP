package HW.HW6.Teacher;

import HW.HW6.User.User;
import HW.HW6.UserInterface.UserInterface;

public class Teacher extends User implements Comparable<Teacher>, UserInterface {

// Класс Teacher, с применением принципов: инкапсуляции(обращение к полям класса через get/set), наследования (от класса User).
// В классе Teacher применен принцип единственной ответственности (SRP), он наследует все поля от класса User и имеет одно поле (teacherId)


// Принцип подстановки лисков можно проверить путем замены объектов наследниками, и если класс User заменить на
// Teacher или Student, то программа продолжит работать без изменения свойств.

// Принцип открытости/зактрытости реализован в классах User, Teacher, Student и др. путем создания getter & setter,
// при обращении к полям класса через эти методы соблюдается принцип закрытости сущностей для модификации,
// а создание классов-наследников (таких как Student & Teacher), позволяет соблюсти принцип открытости -
// то есть наши сущности открыты для дальнейших расширений.

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

    public int getTeacherID() {
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
                "фамилия = " + lastName +
                ", имя = " + firstName +
                ", отчество = " + patronymic;
    }
}
