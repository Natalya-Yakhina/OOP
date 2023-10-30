package HW.HW7_FINAL.Model;

public abstract class Num {
    double materialNum; // material part - материальная часть

    public Num(double materialNum) {
        this.materialNum = materialNum;
    }
    public double getMaterialNum() {
        return materialNum;
    }
    public void setMaterialNum(double materialNum) {
        this.materialNum = materialNum;
    }
}
