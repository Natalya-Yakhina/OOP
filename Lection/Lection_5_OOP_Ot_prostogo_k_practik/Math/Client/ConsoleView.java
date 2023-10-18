package Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Client;

import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Core.Views.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
