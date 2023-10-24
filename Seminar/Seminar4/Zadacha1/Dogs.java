package Seminar.Seminar4.Zadacha1;


public class Dogs extends User{
    int age;

    public Dogs(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Собака: {" +
                "кличка ='" + firstName + '\'' +
                ", возраст =" + age +
                '}';
    }
}
