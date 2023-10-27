package Seminar.Seminar_7.zadacha_1;

//Написать класс Кофе с несколькими полями
// и создать декоратор для возможности добавления в кофе сахара/сиропов и.т.д
public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee("Brasil", 40.5,0.3);
        CoffeToCoffeeDecorator coffeDecorator = new CoffeDecorator(coffee1, true, false);
        coffeDecorator.printCoffee(coffee1);

    }

}
