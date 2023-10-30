package HW.HW7_FINAL.Calc;

import HW.HW7_FINAL.Model.ComplexNumber;

public class CalculatorComplexNum implements ICalculator<ComplexNumber> {
    private ComplexNumber t1;
    private ComplexNumber t2;

    public CalculatorComplexNum(ComplexNumber t1, ComplexNumber t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public CalculatorComplexNum() {
    }

    // --------------- сложение --------------- //
    @Override
    public ComplexNumber sum(ComplexNumber t1, ComplexNumber t2) {
        double material = t1.getMaterialNum() + t2.getMaterialNum();
        double imaginary = t1.getImaginaryNum() + t2.getImaginaryNum();
        ComplexNumber result = new ComplexNumber(material, imaginary);
        return result;
    }

    // --------------- вычитание ---------------
    @Override
    public ComplexNumber difference(ComplexNumber t1, ComplexNumber t2) {
        double material = t1.getMaterialNum() - t2.getMaterialNum();
        double imaginary = t1.getImaginaryNum() - t2.getImaginaryNum();
        ComplexNumber result = new ComplexNumber(material, imaginary);
        return result;
    }

    // --------------- умножение ---------------
    @Override
    public ComplexNumber multiplication(ComplexNumber t1, ComplexNumber t2) {
        double material = (t1.getMaterialNum() * t2.getMaterialNum()) + (t1.getImaginaryNum() * t2.getImaginaryNum() * (-1));
        double imaginary = (t1.getMaterialNum() * t2.getImaginaryNum()) + (t2.getMaterialNum() * t1.getImaginaryNum());
        ComplexNumber result = new ComplexNumber(material, imaginary);
        return result;
    }

    // --------------- деление ---------------
    @Override
    public ComplexNumber divide(ComplexNumber t1, ComplexNumber t2) {
        double material = (t1.getMaterialNum() * t2.getMaterialNum()) + (t1.getImaginaryNum() * t2.getImaginaryNum() / (Math.sqrt(t2.getMaterialNum()) - (Math.sqrt(t2.getImaginaryNum()) * (-1))));
        double imaginary = (t1.getMaterialNum() * t2.getImaginaryNum() * (-1)) + (t2.getMaterialNum() * t1.getImaginaryNum() / (Math.sqrt(t2.getMaterialNum()) - (Math.sqrt(t2.getImaginaryNum()) * (-1))));
        ComplexNumber result = new ComplexNumber(material, imaginary);
        return result;
    }
}
