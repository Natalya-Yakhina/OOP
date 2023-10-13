//package HW.HW1.HW3;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//public class StudentComparable implements Comparable<Student> {
//
//    private List<Student> people = new ArrayList<>();
//    private String firstName;
//    private String lastName;
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    @Override
//    public int compareTo(Student otherStudent) {
//        return this.firstName.compareTo(otherStudent.getFirstName());
//    }
//
//    @Override
//    public String toString() {
//        return "StudentComparable" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
//}
//class NameLengthComparator implements Comparator<Student> { // любой вид сравнения задаем
//    @Override
//    public int compare(Student student1, Student student2) { // Comparator
//        return student1.getFirstName().length() - student2.getFirstName().length(); // сравнение по длинне имени
//    }
//}
//
