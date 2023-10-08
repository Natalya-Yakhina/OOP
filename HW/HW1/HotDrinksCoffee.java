package HW.HW1;

public class HotDrinksCoffee extends HotDrinks{
    public int temperature;
    public HotDrinksCoffee(String name, int cost, int volume, int temperature) {
        super(name, cost, volume, temperature);
        this.temperature = temperature;
    }
}
