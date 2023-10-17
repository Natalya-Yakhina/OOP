package HW.HW4;

import Seminar.Seminar3.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Management extends Teacher {
    int category; // категория руководителей

    // 1 - руководители низового звена (down management)
    // 2 - операционные управляющие руководители среднего звена (middle management)
    // 3 - руководители высшего звена (top management)
    
    public Management(String lastName, String firstName, String patronymic, int category) {
        super(lastName, firstName, patronymic);
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "ФИО: " + lastName + ' ' + firstName + ' ' + patronymic + ' ' +
                "категория: " + category;
    }
}
