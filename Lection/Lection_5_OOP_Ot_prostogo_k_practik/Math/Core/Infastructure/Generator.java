package Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Core.Infastructure;

import java.util.Random;

public class Generator {
    static Random r = new Random();

    public static int number() {
        return r.nextInt(10, 15);
    }
}
