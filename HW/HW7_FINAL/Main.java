package HW.HW7_FINAL;

import HW.HW7_FINAL.Model.Calc.Summ;
import HW.HW7_FINAL.Model.ComplexNumber;

public class Main {

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(5,9);
        System.out.println(complexNumber);
        System.out.println(complexNumber.add(complexNumber));
        System.out.println(complexNumber.multiplication(complexNumber));
        System.out.println(complexNumber.divide(complexNumber));

    }
}
