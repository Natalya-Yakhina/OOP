package Seminar.Seminar_7.zadacha_2;

// Создать класс АвтомобильнаяФабрика
// с возможностью выпуска нескольких автомобилей
// (Каждый тип авто - отдельный класс)
public class CarFactory {
    public ICar createCar(String carType) {
        switch (carType) {
            case ("BMV"):
                System.out.println("Created BMV");
                return new BMW("X5");
            case ("Volvo"):
                System.out.println("Created volvo");
                return new Volvo("Volvo");
            case ("Mersedes"):
                System.out.println("Created Mersedes");
                return new Mersedes("Mersedes");
            default:
                System.out.println("Car not!!!");
                break;
        }
        return null;
    }
}

interface ICar {
}

class Volvo implements ICar {
    private String model;

    public Volvo(String model) {
        this.model = model;
    }
}

class Mersedes implements ICar {
    private String model;

    public Mersedes(String model) {
        this.model = model;
    }
}

class BMW implements ICar {
    public String model;

    public BMW(String model) {
        this.model = model;
    }
}