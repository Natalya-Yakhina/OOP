package Lection.Lection_5_OOP_Ot_prostogo_k_practik.Calculator;

public class SumModel extends CalcModel {

    public SumModel() {

    }
    // do_it
    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

}