package Lection.Lection_5_OOP_Ot_prostogo_k_practik.Calc;


import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    // print(f'{title} = {data}')
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}

