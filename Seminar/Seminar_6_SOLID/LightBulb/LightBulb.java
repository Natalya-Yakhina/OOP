package Seminar.Seminar_6_SOLID.LightBulb;

//DIP - принцип инверсии зависимостей

// ---------------- Dependency inversion principle ----------------

//Принцип инверсии зависимостей
// - модули высокого уровня не должны зависеть от модулей нижнего уровня.
// И те, и другие должны зависеть от абстракций.
// - абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.


class LightBulb extends Equipment {
    public void turnOn() {
        // Включение лампочки
    }

    public void turnOff() {
        // Выключение лампочки
    }
}

class Switch {
    private LightBulb bulb;
    private Equipment equipment;

    public Switch() {
        this.bulb = new LightBulb();
    }

    public void operate() {
        // Работа с выключателем
        equipment.turnOn();
    }
}