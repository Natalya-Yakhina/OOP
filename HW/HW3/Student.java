package HW.HW3;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    int age;
    private List<Student> studentsList;
    List<Student> studentGroup = new ArrayList<>();
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // ---------------------------------------------get/set--------------------------------------------------------------
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.firstName.compareTo(otherStudent.getFirstName());
    }
}