package HW.HW6;

import HW.HW6.User.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserIterator<T extends User> implements Iterator<T> {

    private List<T> UserList;
    private int counter;

    public UserIterator(List<T> userList, int counter) { //
        UserList = userList;
        this.counter = counter;
    }
    @Override
    public boolean hasNext() {
        return counter < UserList.size() - 1;
    }

    @Override
    public T next() {
        if (hasNext()){
            return UserList.get(counter++);
        }
        return null;
    }
    public void remove(){
        UserList = new ArrayList<>();
        counter = 0;
    }
}
