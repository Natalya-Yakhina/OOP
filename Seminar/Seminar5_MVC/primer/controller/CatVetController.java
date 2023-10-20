package Seminar.Seminar5_MVC.primer.controller;

import Seminar.Seminar5_MVC.primer.model.Cat;

import java.util.ArrayList;
import java.util.List;
// controller - бэкенд
public class CatVetController { // называть класс с "Controller"
    private List<Cat> cats; // пациенты

    public CatVetController() {
        this.cats = new ArrayList<>();
    }

    public void addACat(String name, String breed, int age, int weight) { // добавление пациента
        cats.add(new Cat(name, breed, age, weight));
        System.out.println("cat has been aded in controller"); // кот был добавлен в контроллер
    }

    public Cat getByName(String name) { // метод для поиска пациента
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getName().equals(name)) {
                System.out.println("cat was found"); // кот был найден
                return cats.get(i);
            }
        }
        System.out.println("no cat found!"); // ни один кот не найден!
        return null;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "CatVetController{" +
                "cats=" + cats +
                '}';
    }
}
