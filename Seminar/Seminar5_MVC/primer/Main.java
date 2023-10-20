package Seminar.Seminar5_MVC.primer;

import Seminar.Seminar5_MVC.primer.view.CatView;

public class Main {
    public static void main(String[] args) {
        CatView catView = new CatView();
        catView.saveACat("murzik", "persian", 4, 6); // добавить пациента
        catView.getACat("murzik"); // ищем пациента
    }
}
