package Seminar.Seminar_6_SOLID;

//ISP
interface Worker {
    void work();
    void eat();
}

class Engineer implements Worker {
    public void work() {
        // Реализация работы инженера
    }

    public void eat() {
        // Реализация приема пищи
    }
}