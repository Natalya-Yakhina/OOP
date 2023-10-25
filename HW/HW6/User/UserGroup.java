package HW.HW6.User;

import HW.HW6.AbstractClass.UserBaseGroup;

public class UserGroup extends UserBaseGroup {
    int groupNumber;

    public UserGroup() {

    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "ГРУППА: " +
                "номер группы: " + groupNumber;
    }
}
