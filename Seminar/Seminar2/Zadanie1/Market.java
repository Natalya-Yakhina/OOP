package Seminar.Seminar2.Zadanie1;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    private final List<Human> queue;

    public Market() {
        queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Human human) { // пришел в магазин
        System.out.println(human.getName() + " зашел в магазин.");
        takeInQueue(human); // покупатель добавлен
    }

    @Override
    public void releaseFromMarket(List<Human> humans) { // вышел из магазина
        for (Human human : humans) {
            queue.remove(human);
            System.out.println(human.getName() + " покинул магазин.");
        }
    }

    @Override
    public void update() { // обновление состояния магазина
        takeOrders(); // заказ принят
        giveOrders(); // заказ отдан
        releaseFromQueue(); // освобожден  из очереди
    }

    @Override
    public void takeInQueue(Human human) { // занял очередь
        System.out.println(human.getName() + " занял очередь.");
        queue.add(human);
    }

    @Override
    public void takeOrders() { // заказ принят
        for (Human human : queue) {
            if (!human.isMakeOrder()) {
                human.setTakeOrder();
                System.out.println(human.getName() + " сделал заказ.");
            }
        }
    }

    @Override
    public void giveOrders() { // заказ выдан
        for (Human human : queue) {
            if (human.isMakeOrder()) {
                human.setTakeOrder();
                System.out.println(human.getName() + " получил заказ.");
            }
        }
    }

    @Override
    public void releaseFromQueue() { // вышел из очереди
        List<Human> releaseFromQueue = new ArrayList<>();
        for (Human human : queue) {
            if (human.isTakeOrder) {
                releaseFromQueue.add(human);
                System.out.println(human.getName() + " покинул очередь.");
            }
        }
        releaseFromMarket(releaseFromQueue);
    }
}
