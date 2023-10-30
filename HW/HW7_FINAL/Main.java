package HW.HW7_FINAL;

import HW.HW7_FINAL.Calc.CalculatorComplexNum;
import HW.HW7_FINAL.Calc.ICalculator;
import HW.HW7_FINAL.Logger.ComplexNumCalcLogger;
import HW.HW7_FINAL.Logger.Logger;
import HW.HW7_FINAL.Model.ComplexNumber;
import HW.HW7_FINAL.View.ComplexNumCalcView;

public class Main {
    public static void main(String[] args) {
        ICalculator<ComplexNumber> calculator = new ComplexNumCalcLogger(new CalculatorComplexNum(), new Logger());
        ComplexNumCalcView calcView = new ComplexNumCalcView(calculator);
        calcView.startCalc();
    }
}
