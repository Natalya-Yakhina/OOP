package HW.HW1;

public class HotDrinks {
    private String name;
    private int cost;
    private int volume;
    private int temperature;


    public HotDrinks(String name, int cost, int temperature, int volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public String getInfo() {
        return String.format("Name: %s, cost: %d, volume: %d, temperature: %d", name, cost, volume, temperature);
    }
}
