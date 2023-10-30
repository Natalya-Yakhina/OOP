package HW.HW7_FINAL.Calc;

import HW.HW7_FINAL.Model.Num;

public interface ICalculator<T extends Num> {

    // --------------- сложение --------------- //
    T sum(T t1, T t2);

    // --------------- вычитание ---------------
    T difference(T t1, T t2);

    // --------------- умножение ---------------
    T multiplication(T t1, T t2);

    // --------------- деление ---------------
    T divide(T t1, T t2);
}
