package HW.HW4;

public class Teacher {
    String firstName;
    String lastName;
    String surName;

    public Teacher(String firstName, String lastName, String surName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
    }

    public Teacher(){
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Учитель: " +
                "фамилия = '" + firstName + '\'' +
                ", имя = '" + lastName + '\'' +
                ", отчество = '" + surName + '\'';
    }
}
