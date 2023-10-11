package Seminar.Seminar2.Zadanie1;

public interface QueueBehaviour {
    void takeInQueue(Human human); // добавляем покупателя
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
