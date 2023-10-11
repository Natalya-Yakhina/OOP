package Seminar.Seminar2;

public interface RemoteControl {
    void use(); // метод заводиться // все методы в интерфейсе по умолчанию публичные, поэтому нет необходимости прописывать public

    // метод, расширить функционал
    default void heatUp() { // метод разогреваться
        System.out.println("this is heating");
    }
}
