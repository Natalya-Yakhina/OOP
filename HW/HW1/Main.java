package HW.HW1;

import Seminar.Seminar1.zadacha.Product;
import Seminar.Seminar1.zadacha.mashineCola;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinks coffee = new HotDrinks("coffee", 150, 40, 150);
        HotDrinks cacao = new HotDrinks("cacao", 300, 45, 200);
        HotDrinks tea = new HotDrinks("tea", 250, 50, 300);

        List<HotDrinks> list = new ArrayList<>();
        list.add(coffee);
        list.add(cacao);
        list.add(tea);

        VendingMashine vendingMachine = new VendingMashine();
        vendingMachine.getProduct(ArrayList<HotDrinks>) list);

        HotDrinksCoffee hotDrinkCoffee = new HotDrinksCoffee("coffee", 150, 40, 150);
        System.out.println(hotDrinkCoffee.getInfo());

        vendingMachine.getProduct("coffee", 150, 40, 150);
    }
}
