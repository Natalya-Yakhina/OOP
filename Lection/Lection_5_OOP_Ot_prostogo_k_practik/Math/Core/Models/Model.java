package Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Core.Models;

import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Mathematics.CalculateArea.Calculate;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Mathematics.Shapes.Canvas;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Math.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}
