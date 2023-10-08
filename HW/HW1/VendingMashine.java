package HW.HW1;

import Seminar.Seminar1.zadacha.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendingMashine {
    public void getProduct(ArrayList<HotDrinks> hotDrinks) {
        System.out.println("Сегодня в продаже: ");
        Iterator<HotDrinks> iterator = hotDrinks.iterator();
        while(iterator.hasNext())
        {
            HotDrinks item = iterator.next();
            System.out.println(item.getName());
        }
    }

public void getProduct(String name, int volume, int temperature) {
        System.out.printf("Будьте оторожны, самый горячий напиток: " + name + ", его температура составляет " + temperature + ", объем напитка: " + volume);
        }
}