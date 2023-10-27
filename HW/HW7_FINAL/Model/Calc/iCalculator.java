package HW.HW7_FINAL.Model.Calc;

import HW.HW7_FINAL.Model.ComplexNumber;

public interface iCalculator {

    ComplexNumber add(ComplexNumber n1, ComplexNumber n2);

    /**
     * умножение
     *
     * @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumber multiply(ComplexNumber n1, ComplexNumber n2);

    /**
     * деление
     * <p>
     * * @param n1 первое кч
     *
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumber divide(ComplexNumber n1, ComplexNumber n2);
}
