package HW.HW1;

import java.util.List;

public class HotDrinksVendingMachine extends VendingMashine {
    private List<Products> drinks;

    public HotDrinksVendingMachine(List<Products> drinks) {
        this.drinks = drinks; // напитки находящиеся в автомате
    }

    @Override
    public void getProduct(String name, int volume, int temperature) {
        super.getProduct(name, volume, temperature);

//        for (Products drink : drinks) {
//            if (drink.getName().equals(name)
//                    && drink.getVolume() == volume && drink.getTemperature() == temperature) {
//                System.out.printf("Напиток: %s объем = %d и t = %d выдан.\n", name, volume, temperature);
//                return;
//            }
//        }
//        System.out.printf("Напиток: %s объем = %d и t = %d отсутствует в автомате!\n", name, volume, temperature);
//    }
    }
}
