package HW.HW7_FINAL.View;

import HW.HW7_FINAL.Calc.ICalculator;
import HW.HW7_FINAL.Model.ComplexNumber;

import java.util.Scanner;

public class ComplexNumCalcView {

    private ICalculator<ComplexNumber> calculator;

    public ComplexNumCalcView(ICalculator<ComplexNumber> calculator) {
        this.calculator = calculator;
    }

    public void startCalc() {

        while (true) {
            Double materialNum1 = inputDouble("Введите действительную часть комплексного числа: ");
            Double imaginaryNum1 = inputDouble("Введите мнимую часть комплексного числа:");
            ComplexNumber firstNum = new ComplexNumber(materialNum1, imaginaryNum1);

            while (true) {
                String operation = input("ВЫБИРИТЕ ОПЕРАЦИЮ: (+ / - / * / // )");
                if (operation.equals("+")) {
                    Double materialNum2 = inputDouble("Введите действительную часть комплексного числа для сложения: ");
                    Double imaginaryNum2 = inputDouble("Введите мнимую часть комплексного числа для сложения: ");
                    ComplexNumber secondNum = new ComplexNumber(materialNum2, imaginaryNum2);
                    System.out.println(String.format("РЕЗУЛЬТАТ СЛОЖЕНИЯ: (%s) + (%s) = (%s)", firstNum, secondNum, calculator.sum(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("-")) {
                    Double materialNum2 = inputDouble("Введите действительную часть комплексного числа для вычитания: ");
                    Double imaginaryNum2 = inputDouble("Введите мнимую часть комплексного числа для вычитания: ");
                    ComplexNumber secondNum = new ComplexNumber(materialNum2, imaginaryNum2);
                    System.out.println(String.format("РЕЗУЛЬТАТ ВЫЧИТАНИЯ: (%s) + (%s) = (%s)", firstNum, secondNum, calculator.difference(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("*")) {
                    Double materialNum2 = inputDouble("Введите действительную часть комплексного числа для умножения: ");
                    Double imaginaryNum2 = inputDouble("Введите мнимую часть комплексного числа для умножения: ");
                    ComplexNumber secondNum = new ComplexNumber(materialNum2, imaginaryNum2);
                    System.out.println(String.format("РЕЗУЛЬТАТ УМНОЖЕНИЯ: (%s) * (%s) = (%s)", firstNum, secondNum, calculator.multiplication(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("/")) {
                    Double materialNum2 = inputDouble("Введите действительную часть комплексного числа для деления: ");
                    Double imaginaryNum2 = inputDouble("Введите мнимую часть комплексного числа для деления: ");
                    ComplexNumber secondNum = new ComplexNumber(materialNum2, imaginaryNum2);
                    System.out.println(String.format("РЕЗУЛЬТАТ ДЕЛЕНИЯ: (%s) / (%s) = (%s)", firstNum, secondNum, calculator.divide(firstNum, secondNum)));
                    break;
                }
            }
            String cmd = input("ЕЩЕ РАЗ? (ДА/НЕТ)?");
            if (cmd.equalsIgnoreCase("ДА")) {
                continue;
            }
            break;
        }
    }

    private String input(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Double inputDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}