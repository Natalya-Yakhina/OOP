package HW.HW7_FINAL.Model.Calc;

import HW.HW7_FINAL.Model.ComplexNumber;

public class Summ implements iCalculator{

// https://github.com/Lopushka/DZ_7_OOP/blob/main/cal/src/call/ComCal.java
    //* @return Результат сложения
    @Override
    public ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber result = n1.add(n2);
//        log.log("Cложение: " + n1 + " + " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber result = n1.multiplication(n2);
//        log.log("Умножение: " + n1 + " * " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber result = n1.divide(n2);
//        log.log("Деление: " + n1 + " / " + n2 + " = " + result);
        return result;
    }

//    /**
//     * умножение
//     *
//     * @return Результат умножения
//     */
//    public ComplexNumder multiplication(ComplexNumder other) {
//        double productMaterial = this.materialNumber * other.materialNumber - this.imaginaryNumber * other.imaginaryNumber;
//        double productImaginary = this.materialNumber * other.imaginaryNumber + this.imaginaryNumber * other.materialNumber;
//        return new ComplexNumder(productMaterial, productImaginary);
//    }
//
//    /**
//     * деление
//     *
//     * @return Результат деления
//     */
//    public ComplexNumder divide(ComplexNumder other) {
//        double divisor = other.material * other.material + other.imaginary * other.imaginary;
//        double qMaterial = (this.material * other.material + this.imaginary * other.imaginary) / divisor;
//        double qImaginary = (this.imaginary * other.material - this.material * other.imaginary) / divisor;
//        return new ComplexNumder(qMaterial, qImaginary);
//    }
//
//    @Override
//    public String toString() {
//        if (imaginary >= 0) {
//            return material + " + " + imaginary + "i";
//        } else {
//            return material + " - " + Math.abs(imaginary) + "i";
//        }
//    }
//}

}
