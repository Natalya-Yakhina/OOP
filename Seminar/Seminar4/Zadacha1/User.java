package Seminar.Seminar4.Zadacha1;

public class User {
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
