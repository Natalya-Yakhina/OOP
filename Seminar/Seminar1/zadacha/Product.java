package Seminar.Seminar1.zadacha;

public class Product {
    String name;
    double cost;

    public Product(String name) {
        this.name=name;
    }
    public Product(double cost) {
        this.cost = cost;

    }

    public double getCost(double cost) {
        return cost;
    }

    public String getName(String name){
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
