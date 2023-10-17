package Seminar.Seminar4;

import java.util.ArrayList;
import java.util.List;

// ---------------------------- ОБЩИЙ ПРИМЕР ИСПОЛЬЗОВАНИЯ ОБОБЩЕНИЙ ----------------------------
public class GenericExample {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>(List.of("hello", "java", "course"));
        System.out.println(arr);

        // Создание экземпляра обобщенного класса с типом Integer
        MyGenericClass<Integer> integerGeneric = new MyGenericClass<>(10);
        System.out.println("integer Value: " + integerGeneric.getData());

        // Создание экземпляра обобщенного класса с типом String
        MyGenericClass<String> stringGeneric = new MyGenericClass<>("Hello, Generics!");
        System.out.println("String Value: " + stringGeneric.getData());

        // Создание и вызов обобщенного метода с разными типами
        printArrayElement(1);
        printArrayElement("Generic Method Example");

        // Создание обобщенного класса с несколькими параметрами типа
        Pair<Integer, String> pair = new Pair<>(42, "Generics");
//        Pair<String, String> pair = new Pair<>("42", "Generics");
        System.out.println("Pair: " + pair.getFirst() + ", " + pair.getSecond());
    }

    // Обобщенный класс
    static class MyGenericClass<JAVA> { // JAVA - указываем тип
        private JAVA data;

        public MyGenericClass(JAVA data) { // конструктор
            this.data = data;
        }

        public JAVA getData() {
            return data;
        }
    }

    // Обобщенный метод
    static <E> void printArrayElement(E element) { // выводить тип который задали
        System.out.println("Array Element: " + element);
    }

    // Обобщенный класс с несколькими параметрами типа
    static class Pair<A, B> {
        private A first;
        private B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        public A getFirst() {
            return first;
        }

        public B getSecond() {
            return second;
        }
    }
}
