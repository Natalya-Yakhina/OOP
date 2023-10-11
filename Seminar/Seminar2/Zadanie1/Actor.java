package Seminar.Seminar2.Zadanie1;

public abstract class Actor {
    protected String name; // имя заказчика
    protected boolean isMakeOrder; // protected - идентификатор доступа
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }

    abstract String getName();
}
