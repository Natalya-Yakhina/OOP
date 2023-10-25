package HW.HW6.AbstractClass;

public abstract class UserBase {
    String firstName;
    String secondName;
    String patronymic;

    public UserBase() {
    }
    //    DIP
//    Принцип инверсии зависимостей реализован следующим образом:
//    Cозданы абстрактные классы UserBase & UserBaseGroup, которые не зависят от деталей.
//    В абстрактных классах перечислены поля (String firstName, String lastName, String patronymic),
//    которые будут использоваться в проекте, а детали реализованы в классах-наследниках (User,
//    Student, Teacher).
//    Модули верхних уровней не зависят от модулей нижних уровней.
}
