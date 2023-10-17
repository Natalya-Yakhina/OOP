package HW.HW4;

public class Teacher {
    String lastName;
    String firstName;
    String patronymic;

    public Teacher(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public Teacher() {
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "Учитель: " +
                "фамилия = " + lastName +
                ", имя = " + firstName +
                ", отчество = " + patronymic;
    }
}
