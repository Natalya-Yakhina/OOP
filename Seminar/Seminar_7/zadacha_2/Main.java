package Seminar.Seminar_7.zadacha_2;

// Создать класс АвтомобильнаяФабрика
// с возможностью выпуска нескольких автомобилей
// (Каждый тип авто - отдельный класс)
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.createCar("X5");
        carFactory.createCar("Volvo");
    }
}
