package HW.HW1.HW3;

import java.util.Iterator;
import java.util.List;

public class IteratorStudentOfGroup implements Iterator<Student> {
    private int index;
    private List<Student> studentGroup;

    public IteratorStudentOfGroup(StudentOfGroup studentsGroup) {
        this.studentGroup = studentsGroup.getStudentsList();
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.size();
    }

    @Override
    public Student next() {
        if (hasNext()) {
            return studentGroup.get(index++);
        }
        return studentGroup.get(index);
    }
    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
