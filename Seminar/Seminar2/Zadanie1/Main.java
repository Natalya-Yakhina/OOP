package Seminar.Seminar2.Zadanie1;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setMakeOrder(); // делаем заказ
        human.setTakeOrder(); // забираем заказ
        System.out.println("-----------");
        human.isMakeOrder();
        System.out.println(human.isMakeOrder);
        human.isTakeOrder();
        System.out.println(human.isTakeOrder);
    }
}
