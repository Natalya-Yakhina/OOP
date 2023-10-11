package Seminar.Seminar2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("1");
        array.add("2");
        System.out.println(array.size());
        array.remove("1");
        System.out.println(array);

        Capybara capybara = new Capybara();
        capybara.voice();

        Car bmw = new Car();
        bmw.use(); // заведем
        bmw.move(); // поедем
        bmw.heatUp(); // разогреем
    }
}
