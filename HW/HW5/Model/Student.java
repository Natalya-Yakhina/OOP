package HW.HW5.Model;

public class Student extends User {
    protected int studentID;

    public Student(String firstName, String lastName, String surName, int age, int studentID) {
        super(firstName, lastName, surName, age);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    } // возвращение ID студента

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "СТУДЕНТЫ: " +
                "ID: " + studentID +
                ", ФИО: " + firstName + ' ' + lastName + ' ' + surName +
                ", Возраст = " + age;
    }
}