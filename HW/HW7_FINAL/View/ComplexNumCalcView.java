package HW.HW7_FINAL.View;

import HW.HW7_FINAL.Calc.ICalculator;
import HW.HW7_FINAL.Model.ComplexNumber;

import java.util.Scanner;

public class ComplexNumCalcView {

    private ICalculator<ComplexNumber> calculator;

    public ComplexNumCalcView(ICalculator<ComplexNumber> calculator) {
        this.calculator = calculator;
    }

    public void StartCalc() {

        while (true) {
            Double materialNum1 = inputDouble("Введите действительную часть комплексного числа: ");
            Double imaginaryNum1 = inputDouble("Введите мнимую часть комплексного числа:");
            ComplexNumber firstNum = new ComplexNumber(materialNum1, imaginaryNum1);

            while (true) {
                String operation = input("ВЫБИРИТЕ ОПЕРАЦИЮ: (+ / - / * / // )");
                if (operation.equals("+")) {
                    Double materialNum2 = inputDouble("Введите действительную часть числа для сложения: ");
                    Double imaginaryNum2 = inputDouble("Введите мнимую часть числа для сложения: ");
                    ComplexNumber secondNum = new ComplexNumber(materialNum2, imaginaryNum2);
                    System.out.println(String.format("Результат: (%s) + (%s) = (%s)", firstNum, secondNum, calculator.sum(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("-")) {
                    Double materialNum2 = inputDouble("Введите действительную часть числа для вычитания: ");
                    Double imaginaryNum2 = inputDouble("Введите мнимую часть числа для вычитания: ");
                    ComplexNumber secondNum = new ComplexNumber(materialNum2, imaginaryNum2);
                    System.out.println(String.format("Результат: (%s) + (%s) = (%s)", firstNum, secondNum, calculator.difference(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("*")) {
                    Double materialNum2 = inputDouble("Введите действительную часть числа для умножения: ");
                    Double imaginaryNum2 = inputDouble("Введите мнимую часть числа для умножения: ");
                    ComplexNumber secondNum = new ComplexNumber(materialNum2, imaginaryNum2);
                    System.out.println(String.format("Результат: (%s) * (%s) = (%s)", firstNum, secondNum, calculator.multiplication(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("/")) {
                    Double materialNum2 = inputDouble("Введите действительную часть комплексного числа делителя:");
                    Double imaginaryNum2 = inputDouble("Введите мнимую часть комплексного числа делителя:");
                    ComplexNumber secondNum = new ComplexNumber(materialNum2, imaginaryNum2);
                    System.out.println(String.format("Результат: (%s) / (%s) = (%s)", firstNum, secondNum, calculator.divide(firstNum, secondNum)));
                    break;
                }
            }
            String cmd = input("Еще одна операция? (Yes/No)?");
            if (cmd.equalsIgnoreCase("Yes")) {
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