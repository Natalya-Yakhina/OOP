package Seminar.Seminar2;

public class Main {
    public static void main(String[] args){
        Capybara capybara = new Capybara();
        capybara.voice();

        Car bmw = new Car();
        bmw.use(); // заведем
        bmw.move(); // поедем
        bmw.heatUp(); // разогреем
    }
}
