package Lection.Lection_5_OOP_Ot_prostogo_k_practik.Calculator;

import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Calculator.CalcModel;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Calculator.Model;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Calculator.View;

public class PresenterOfT <T extends CalcModel> {
    View view;
    Model model;

    public PresenterOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
