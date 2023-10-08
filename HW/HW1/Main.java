package HW.HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // создаем горячие напитки
        Products coffee = new ProductsHotDrinks("coffee", 100, 100, 40);
        Products cacao = new ProductsHotDrinks("cacao", 200, 150, 45);
        Products tea = new ProductsHotDrinks("tea", 50, 200, 35);

        // помещаем горячие напитки в коллекцию
        List<Products> drinks = new ArrayList<>();
        drinks.add(coffee);
        drinks.add(cacao);
        drinks.add(tea);

        // создаем автомат и наполняем его напитками
        HotDrinksVendingMachine HDM = new HotDrinksVendingMachine(drinks);

        // выводим список напитков из коллекции drinks
        System.out.println("\nГорячие напитки в автомате:");

        for (Products drink : drinks)
            System.out.println(drink.toString());

//         System.out.println(HDM);
//        HDM.getProduct("coffee", 100, 40);
//        HDM.getProduct("cacao", 150, 45);
//        HDM.getProduct("tea", 200, 35);

    }
}