package HW.HW1;

public abstract class Products {
    private String name;
    private int price;
    private int volume;
    private int temperature;

    public Products(String name, int price, int volume, int temperature) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public abstract int getTemperature();

    @Override
    public String toString() {
        return "Наименование: = " + name + ", объем = " + volume + ", стоимость = " + price + " ";
    }
}