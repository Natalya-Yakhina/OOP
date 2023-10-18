package Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Client;

import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Core.Models.Model;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Core.Presenters.Presenter;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Core.Views.View;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Mathematics.CalculateArea.CalculateArea;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Mathematics.CalculateArea.UnacceptableValueException;

public class App {
    Presenter p;
    View ui;
    Model model;

    public App() {
        ui = new ConsoleView();
        model = new Model(CalculateArea.getInstance(), "Без имени.jpg");
        p = new Presenter(ui, model);
    }

    public void start() throws UnacceptableValueException {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - append shape\n")
                .append("2 - show shape\n")
                .append("3 - show all area\n")
                .append("0 - exit\n");


        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    p.append();
                    break;
                case "2":
                    p.show();
                    break;
                case "3":
                    p.showArea();
                    break;
                case "0":
                    return;
            }
        }
    }
}
