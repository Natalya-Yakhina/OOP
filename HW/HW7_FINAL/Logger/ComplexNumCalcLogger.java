package HW.HW7_FINAL.Logger;

import HW.HW7_FINAL.Calc.ICalculator;
import HW.HW7_FINAL.Model.ComplexNumber;

public class ComplexNumCalcLogger implements ICalculator<ComplexNumber> {
    private ICalculator calcLog;
    private ILogger log;

    public ComplexNumCalcLogger(ICalculator calcLog, ILogger log) {
        this.calcLog = calcLog;
        this.log = log;
    }
    @Override
    public ComplexNumber sum(ComplexNumber t1, ComplexNumber t2) {
        ComplexNumber result = (ComplexNumber) calcLog.sum(t1, t2);
        log.loggerMessage(String.format("Вызов метода sum(сложение): %s + %s = %s", t1, t2, result));
        return result;
    }

    @Override
    public ComplexNumber difference(ComplexNumber t1, ComplexNumber t2) {
        ComplexNumber result = (ComplexNumber) calcLog.difference(t1, t2);
        log.loggerMessage(String.format("Вызов метода difference(вычитание): %s - %s = %s", t1, t2, result));
        return result;
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber t1, ComplexNumber t2) {
        ComplexNumber result = (ComplexNumber) calcLog.multiplication(t1, t2);
        log.loggerMessage(String.format("Вызов метода multiplication(умножение): %s * %s = %s", t1, t2, result));
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber t1, ComplexNumber t2) {
        ComplexNumber result = (ComplexNumber) calcLog.divide(t1, t2);
        log.loggerMessage(String.format("Вызов метода divide(деление): %s / %s = %s", t1, t2, result));
        return result;
    }
}
