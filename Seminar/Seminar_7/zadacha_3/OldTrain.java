package Seminar.Seminar_7.zadacha_3;

// Создать класс oldTrain с полями speed и length
// и адаптер для этого класса newTrain
// с методом move(печать того, что поезд начал движения и значения полей из oldTrain)
public class OldTrain {
    private int speed;
    private int length;

    public OldTrain(int speed, int length) {
        this.speed = speed;
        this.length = length;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "OldTrain: " +
                "speed=" + speed +
                ", length=" + length +
                '}';
    }
    public void NewTrainAdapter(OldTrain oldTrain) {
    }
}

class NewTrainAdapter{
    private OldTrain oldTrain;
    private String nameTrain;

    public NewTrainAdapter(OldTrain oldTrain, String nameTrain) {
        this.oldTrain = oldTrain;
        this.nameTrain = nameTrain;
    }

    public void move(){
        System.out.println("Поезд " + nameTrain + " начал движение: длинна состава: " + oldTrain.getLength() + ", скорость: " + oldTrain.getSpeed());
    }
}
