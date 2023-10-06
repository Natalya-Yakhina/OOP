package Seminar.Seminar1.zadacha;

import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VendingMashine VM = new VendingMashine();
        Product Snickers = new Product("Snickers");
        Product lEMONADE = new Product("COCA-COLA");
        //System.out.println(Snickers.name);
        VendingMashine VM1 = new VendingMashine();
        VM1.initProductName(List.of(new Product("Marmelade"),(new Product("Water")),(new Product("Chips"))));
        System.out.println(VM1.getProductName());
        mashineCola colaMashine = new mashineCola();
        System.out.println("___________________");
        colaMashine.initProductName(List.of(new Product("Fanta")));
        System.out.println(colaMashine.getProductName());


    }
}
