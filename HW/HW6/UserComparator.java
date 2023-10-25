package HW.HW6;

import HW.HW6.User.User;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> { // задаем параметр Т (только для User) // типизирование T наследующегося от типа Юзер
    @Override
    public int compare(T o1, T o2) { // типизирование реализуемый интерфейс Компаратор T
        return o1.firstName.length() - o2.firstName.length();
    }
}
