package HW.HW5.Model;

public class Teacher extends User {
    private int teacherId;

    public Teacher(String name, String group, int age, int teacherId) {
        super(name, group, age);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                '}';
    }
//
//    public void getInfoTeacher(int teacherId) { // получить информацию по студенту
//        System.out.println("Student:" + teacherId);
//    }
}