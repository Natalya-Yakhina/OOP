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
    protected boolean sugar;
    protected boolean syrup;

    public CoffeToCoffeeDecorator(Coffee coffee, boolean sugar, boolean syrup) {
        this.coffee = coffee;
        this.sugar = sugar;
        this.syrup = syrup;
    }
}

class CoffeDecorator extends CoffeToCoffeeDecorator{

    public CoffeDecorator(Coffee coffee, boolean sugar, boolean syrup) {
        super(coffee, sugar, syrup);
    }

    public void printCoffe(Coffee coffee){
        System.out.println(coffee + "sugar: " + sugar + ", " + "syrup: " + syrup);
    }
}
