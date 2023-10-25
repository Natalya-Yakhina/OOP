package HW.HW6.Teacher;

import HW.HW6.User.UserGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherIterator extends UserGroup implements Iterator<Teacher> {

    private List<Teacher> TeacherList;
    private int counter;

    public TeacherIterator(List<Teacher> teacherList) {
        TeacherList = teacherList;
        this.counter = counter;
    }

    @Override
    public boolean hasNext() {
        return counter < TeacherList.size() - 1;
    }

    @Override
    public Teacher next() {
        if (hasNext()) {
            return TeacherList.get(counter++);
        }
        return null;
    }
    public void remove() {
        TeacherList = new ArrayList<>();
        counter = 0;
    }
}
