package HW.HW5.Model;

public class User {
    protected String firstName;
    protected String lastName;
    protected String surName;

    protected int age;

    public User(String firstName, String lastName, String surName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.age = age;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User " +
                "ФИО: " + firstName + lastName + ' ' + surName +
                ", Возраст: " + age;
    }
}
