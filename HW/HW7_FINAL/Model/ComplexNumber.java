package HW.HW7_FINAL.Model;

public class ComplexNumber extends Num {
    double imaginaryNum; // imaginary part - мнимая часть

    public ComplexNumber(double materialNum, double imaginaryNum) {
        super(materialNum);
        this.imaginaryNum = imaginaryNum;
    }

    public double getImaginaryNum() {
        return imaginaryNum;
    }

    public void setImaginaryNum(double imaginaryNum) {
        this.imaginaryNum = imaginaryNum;
    }

    @Override
    public String toString() {
        return "(" + super.getMaterialNum() + ") + (" + imaginaryNum + "i)";
    }
}
