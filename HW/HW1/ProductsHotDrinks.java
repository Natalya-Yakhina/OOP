package HW.HW1;

public class ProductsHotDrinks extends Products {
    private int temperature;

    public ProductsHotDrinks(String name, int price, int volume, int temperature) {
        super(name, price, volume, temperature);
        this.temperature = temperature;
    }

    @Override
    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getVolume() {
        return super.getVolume();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        String curStr = super.toString();
        return "ГОРЯЧИЕ НАПИТКИ: " + curStr.substring(0, curStr.length() - 1) +
                ", температура = " + temperature;
    }
}
