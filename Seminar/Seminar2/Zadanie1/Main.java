package Seminar.Seminar2.Zadanie1;

public class Main {
    public static void main(String[] args) {
        HomeWork();

        //        --------------2 вариант вызова---------------
//        Human human = new Human();
//        human.name = "Ленок";
//        Market myMarket = new Market();
//
//        myMarket.acceptToMarket(human);
//        myMarket.takeInQueue(human);
//        myMarket.giveOrders();
//        myMarket.takeOrders();
//        myMarket.releaseFromQueue();
//        myMarket.releaseFromMarket(human);
//        myMarket.update();
//        --------------семинар---------------
//        Human human = new Human();
//        human.setMakeOrder(); // делаем заказ
//        human.setTakeOrder(); // забираем заказ
//        System.out.println("-----------");
//        human.isMakeOrder();
//        System.out.println(human.isMakeOrder);
//        human.isTakeOrder();
//        System.out.println(human.isTakeOrder);
    }

    public static void HomeWork() {

        Market myMarket = new Market();
        System.out.println("--------------------");

        myMarket.acceptToMarket(new Human("Николя"));
        myMarket.update();
        System.out.println("--------------------");
        myMarket.acceptToMarket(new Human("Арсений"));
        myMarket.acceptToMarket(new Human("Марина"));
        myMarket.update();
        System.out.println("--------------------");
    }
}