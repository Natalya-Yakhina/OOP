package HW.HW6.Teacher;

import HW.HW6.User.UserGroup;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup extends UserGroup implements Iterable<Teacher> {

// SRP - Принцип единственной ответственности реализован в классу TeacherGroup, который наследуется от UserGroup.

// Класс TeacherGroup, с применением принципов: инкапсуляции (обращение к полям класса через get/set), наследования (от класса UserGroup).
// В классе TeacherGroup применен принцип SRP - единственной ответственности, он наследует все поля от класса UserGroup и имеет одно поле (groupName)
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
        return new TeacherIterator(teacherGroupList);
    }
}
