package Seminar.Seminar1.zadacha;

import javax.sound.midi.Soundbank;
import java.util.List;

public class mashineCola extends VendingMashine{


    @Override
    public void initProductName(List<Product> list) {
        super.initProductName(list);
        System.out.println("You added new drink to mashineCola ");

    }
}
