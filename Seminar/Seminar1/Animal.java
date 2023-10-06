package Seminar.Seminar1;

public abstract class Animal{
    // валировали от постороннего взаимодействия
    private String name;
    private int age;
    // конструктор, если много методов constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //чтобы запись работала constructor без аргументов
    public Animal() {
    }

//    public void voice(){
//        System.out.println("Hello, my name is " + name + " and my age " + age);
//    }

    public abstract void voice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

// generate getter setter теперь можем присвоить имя

}
