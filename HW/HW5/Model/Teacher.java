package HW.HW5.Model;

public class Teacher extends User {
    protected String subject; // предмет
    protected int teacherID;

    public Teacher(String firstName, String lastName, String surName, int age, String subject, int teacherID) {
        super(firstName, lastName, surName, age);
        this.subject = subject;
        this.teacherID = teacherID;
    }

    public int getIDTeacher() { // возвращение ID учителя;
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "УЧИТЕЛЯ: " +
                "ID: " + teacherID + "," +
                " ФИО: " + firstName + ' ' + lastName + ' ' + surName +
                ", Возраст: " + age +
                ", Предмет: " + subject;

    }
}