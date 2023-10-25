package HW.HW6.Teacher;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        int resultCompare = o1.getFirstName().compareTo(o2.getFirstName());

        if (resultCompare == 0) {
            resultCompare = o1.getLastName().compareTo(o2.getLastName());
            if (resultCompare == 0) {
                resultCompare = o1.getPatronymic().compareTo(o2.getPatronymic());
            }
            if (resultCompare == 0) {
                resultCompare = o1.getTeacherID().compareTo(o2.getTeacherID());
                return o1.getTeacherID().compareTo(o2.getTeacherID());
            } else {
                return resultCompare;
            }
        }
        return resultCompare;
    }
//    @Override
//    public int compare(Teacher o1, Teacher o2) {
//        return o1.getFirstName().length() - o2.getFirstName().length();
//    }
}
