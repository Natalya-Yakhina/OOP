package HW.HW7_FINAL.Model;

public class ComplexNumber {
    protected double materialNumber; // material part - материальная часть
    protected double imaginaryNumber; // Imaginary part - мнимая часть

    public ComplexNumber(double materialNumber, double imaginaryNumber) {
        this.materialNumber = materialNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public double getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(double materialNumber) {
        this.materialNumber = materialNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public void setImaginaryNumber(double imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

//    @Override
//    public String toString() {
//        String result = "";
//        if (imaginaryNumber > 0) {
//            result = materialNumber + "+" + imaginaryNumber + "i";
//        } else {
//            result = materialNumber + "" + imaginaryNumber + "i";
//        }
//        return result;
//    }
    /**
     * сложение
     *
     * @return Результат сложения
     */
    public ComplexNumber add(ComplexNumber other) {
        double sumMaterial = this.materialNumber + other.materialNumber;
        double sumImaginary = this.imaginaryNumber + other.imaginaryNumber;
        return new ComplexNumber(sumMaterial, sumImaginary);
    }

    /**
     * умножение
     *
     * @return Результат умножения
     */
    public ComplexNumber multiplication(ComplexNumber other) {
        double productMaterial = this.materialNumber * other.materialNumber - this.imaginaryNumber * other.imaginaryNumber;
        double productImaginary = this.materialNumber * other.imaginaryNumber + this.imaginaryNumber * other.materialNumber;
        return new ComplexNumber(productMaterial, productImaginary);
    }

    /**
     * деление
     *
     * @return Результат деления
     */
    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.materialNumber * other.materialNumber + other.imaginaryNumber * other.imaginaryNumber;
        double qMaterial = (this.materialNumber * other.materialNumber + this.imaginaryNumber * other.imaginaryNumber) / divisor;
        double qImaginary = (this.imaginaryNumber * other.materialNumber - this.materialNumber * other.imaginaryNumber) / divisor;
        return new ComplexNumber(qMaterial, qImaginary);
    }

    @Override
    public String toString() {
        if (imaginaryNumber >= 0) {
            return materialNumber + " + " + imaginaryNumber + "i";
        } else {
            return materialNumber + " - " + Math.abs(imaginaryNumber) + "i";
        }
    }
}
