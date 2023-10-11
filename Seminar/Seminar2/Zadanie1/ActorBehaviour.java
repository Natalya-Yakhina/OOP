package Seminar.Seminar2.Zadanie1;

public interface ActorBehaviour {
    void setMakeOrder(); // создание заказа

    void setTakeOrder(); // принятие заказа

    boolean isMakeOrder(); // сделан ли заказ

    boolean isTakeOrder(); // принят/забрали ли заказ
}
