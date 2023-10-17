package HW.HW4;

import Seminar.Seminar4.Zadacha1.Dogs;
import Seminar.Seminar4.Zadacha1.User;
import Seminar.Seminar4.Zadacha1.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private int category;

    public void main(String[] args) {

        List<Teacher> teachers = new ArrayList<>();

        Teacher teacher1 = new Teacher("Жук", "Вера", "Ивановна");
        Teacher teacher2 = new Teacher("Петров", "Александр", "Александрович");
        Teacher teacher3 = new Teacher("Сидорова", "Екатерина", "Вениаминовна");
        Teacher teacher4 = new Teacher("Як", "Анатолий", "Сергеевич");

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        System.out.println("----------- СПИСОК УЧИТЕЛЕЙ -----------");
        System.out.println(teachers);

        System.out.println("----------- Comparator -----------");
        teachers.sort(new TeacherComparator<>());
        System.out.println(teachers);

        System.out.println("----------- Iterator -----------");
        for (Teacher TeacherList : teachers) { // итерация по фамилии
            System.out.println(TeacherList.getLastName());
        }

        System.out.println("----------------------------------");
        List<TeacherGroup> teachersGroup = new ArrayList<>();
        TeacherGroup teachers1 = new TeacherGroup("1А", teachers);
        System.out.println(teachers1);
//-------------------------------------------------------------------------------------------------------------------------

        Management management1 = new Management("Алексеев", "Николай", "Николаевич", 1);
        Management management2 = new Management("Лобованова", "Людмила", "Егоровна", 2);
        Management management3 = new Management("Казьмин", "Александр", "Викторович", 3);

        List<Management> managements = new ArrayList<>(List.of(management1, management2, management3));

        managements.sort(new TeacherComparator<Management>());
        System.out.println("----------- СПИСОК РУКОВОДИТЕЛЕЙ -----------");
        System.out.println(managements);

        System.out.println(managements);

    }
}
