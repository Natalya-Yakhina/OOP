package Lection.Lection_5_OOP_Ot_prostogo_k_practik.Phonebook.UI;

import java.util.Scanner;

import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Phonebook.Config;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Phonebook.Core.MVP.Presenter;
import Lection.Lection_5_OOP_Ot_prostogo_k_practik.Phonebook.Core.MVP.View;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
