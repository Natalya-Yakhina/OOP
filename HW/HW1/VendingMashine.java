package HW.HW1;

import java.util.ArrayList;
import java.util.Iterator;

public class VendingMashine {
    public void getProduct(ArrayList<ProductsHotDrinks> productsHotDrinks) {
        System.out.println("Сегодня в продаже: ");
        Iterator<ProductsHotDrinks> iterator = productsHotDrinks.iterator();
        while (iterator.hasNext()) {
            ProductsHotDrinks item = iterator.next();
            System.out.println(item.getName());
        }
    }

    public void getProduct(String name, int volume, int temperature) {
        System.out.printf("Cамый горячий напиток: " + name + ", его температура составляет " + temperature + ", объем напитка: " + volume);
    }
}