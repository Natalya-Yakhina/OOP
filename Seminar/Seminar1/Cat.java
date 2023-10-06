package Seminar.Seminar1;

public class Cat extends Animal {
    // наследник класса анимал

    private String color;
    @Override
    public void voice() {
        System.out.println("meow im a cat " + getName() + color);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
// полиморфизм, т.к. класс от объекта
