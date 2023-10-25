package HW.HW6.Teacher;

import java.util.Comparator;

public class TeacherComparator<T extends Teacher> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.lastName.length() - o2.lastName.length();
    }
}