package Seminar.Seminar_7.zadacha_3;

// Создать класс oldTrain с полями speed и length
// и адаптер для этого класса newTrain
// с методом move(печать того, что поезд начал движения и значения полей из oldTrain)
public class Main {
    public static void main(String[] args) {

        OldTrain oldTrain1 = new OldTrain(150, 15);
        NewTrainAdapter newTrainAdapter = new NewTrainAdapter(oldTrain1, "125");
        newTrainAdapter.move();

    }
}
