package HW.HW7_FINAL.Model.Calc;

import HW.HW7_FINAL.Model.ComplexNumber;

public interface iCalculator {

// --------------- сложение ---------------

    ComplexNumber add(ComplexNumber n1, ComplexNumber n2);

// --------------- умножение ---------------

    ComplexNumber multiply(ComplexNumber n1, ComplexNumber n2);

// --------------- деление ---------------
    ComplexNumber divide(ComplexNumber n1, ComplexNumber n2);
}


