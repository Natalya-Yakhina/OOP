package Seminar.Seminar_7.zadacha_1;

public class Coffee {
    private String type;
    private double temp;
    private double volume;

    public Coffee(String type, double temp, double volume) {
        this.type = type;
        this.temp = temp;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Кофе: " +
                "тип: " + type +
                ", температура: " + temp +
                ", объем: " + volume + " ";
    }
}

class CoffeToCoffeeDecorator { // создать декоратор для возможности добавления в кофе сахара/сиропов и.т.д
    private Coffee coffee;

    // передаем кофе в метод
    public CoffeToCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class CoffeDecorator extends CoffeToCoffeeDecorator {

    // объявляем добавки и обращаемся к ним
    private boolean sugar;
    private boolean syrup;

    public CoffeDecorator(Coffee coffee, boolean sugar, boolean syrup) {
        super(coffee);
        this.sugar = sugar;
        this.syrup = syrup;
    }

    public void printCoffe(Coffee coffee) {
        System.out.println(coffee + "sugar: " + sugar + ", " + "syrup: " + syrup);
    }
}
