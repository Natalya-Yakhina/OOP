package HW.HW6.User;

import HW.HW6.AbstractClass.UserBase;

public class User extends UserBase {
    String firstName;
    String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    ;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Пользователь:' " +
                "Фамилия = '" + firstName + '\'' +
                ", Имя = '" + lastName + '\'';
    }
}
