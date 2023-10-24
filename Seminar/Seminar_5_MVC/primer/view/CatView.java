package Seminar.Seminar_5_MVC.primer.view;

import Seminar.Seminar_5_MVC.primer.controller.CatVetController;

// view - фронтенд
public class CatView {
    CatVetController catVetController;

    public CatView() {
        this.catVetController = new CatVetController();
    }
    public void saveACat(String name,String breed,int age, int weight){ // добавление пациента
        catVetController.addACat(name, breed, age, weight);
    }
    public void getACat(String name){ // метод для поиска
        System.out.println(catVetController.getByName(name));
    }
}
