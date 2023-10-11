package Seminar.Seminar2;

public class Car implements Moving, RemoteControl {
    // implements - реализует

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void use() {
        System.out.println("Car is ingited");
    }

    @Override
    public void heatUp() {
        System.out.println("Car is heating");
    }
}
