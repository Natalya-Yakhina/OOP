package HW.HW4;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private String groupName;
    private List<Teacher> teacherGroupList;

    public TeacherGroup(String groupName, List<Teacher> teacherList) {
        this.groupName = groupName;
        this.teacherGroupList = teacherList;
    }

    public int getSize() {
        return teacherGroupList.size();
    }

    public Teacher getIndex(int index) {
        return teacherGroupList.get(index);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Teacher> getStudentList() {
        return teacherGroupList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherGroupList = teacherList;
    }

    @Override
    public String toString() {
        return "УЧИТЕЛЯ ПО КЛАССАМ: " + '\n' +
                "номер класса: '" + groupName + '\'' + '\n' +
                "список учителей: " + teacherGroupList;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherIterator<>(teacherGroupList);
    }
}
