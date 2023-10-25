package HW.HW6.User;

import HW.HW6.AbstractClass.UserBase;

public class User extends UserBase {

    protected String firstName; // модификатором доступа protected: поля видны в пределах всех классов, находящихся в том же пакете,в пределах всех классов-наследников нашего класса.
    protected String lastName;
    protected String patronymic;

    // Принцип полиморфизма, то есть в зависимости от переданного типа данных можно применять одну и ту же функцию

    public User(String firstName, String lastName, String patronymic) {
        setFirstName(firstName);
        setLastName(lastName);
        setPatronymic(patronymic);
    }
    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    @Override
    public String toString() {
        return "Пользователь: " +
                "Имя: " + firstName + '\'' +
                ", Фамилия: " + lastName + '\'' +
                ", Отчество: " + patronymic + '\'';
    }
}
