package HW.HW6.User;

import HW.HW6.AbstractClass.UserBase;

import java.util.Objects;

public class User extends UserBase {

    // OSP - Принцип открытости/закрытости реализован путем создания getter & setter. При обращении к полям класса
    // через эти методы соблюдается принцип закрытости для модификации, а создание классов-наследников позволяет
    // соблюсти принцип открытости - то есть сущности открыты для дальнейших расширений.

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
        return "Пользователь: " + "Имя: " + firstName + '\'' + ", Фамилия: " + lastName + '\'' + ", Отчество: " + patronymic + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(patronymic, user.patronymic);
    }


//    if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
//            user.getFirstName() != null) {
//        return false;
//    }
//        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
//            user.getSecondName() != null) {
//        return false;
//    }
//        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
//            user.getPatronymic() != null) {
//        return false;
//    }
}
