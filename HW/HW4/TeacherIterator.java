package HW.HW4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherIterator<T extends Teacher> implements Iterator<T> {

    private List<T> TeacherList;
    private int counter;

    public TeacherIterator(List<T> teacherList) {
        TeacherList = teacherList;
        this.counter = counter;
    }

    @Override
    public boolean hasNext() {
        return counter < TeacherList.size() - 1;
    }

    @Override
    public T next() {
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
