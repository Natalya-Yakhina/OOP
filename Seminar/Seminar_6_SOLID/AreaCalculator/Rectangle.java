package Seminar.Seminar_6_SOLID.AreaCalculator;

//OCP - принцип открытости закрытости

// --------------------------- Open-closed principle ---------------------------

// классы должны быть открыты для расширения и одновременно закрыты для модификации.
// Иными словами, должна быть возможность добавлять новые свойства и расширять класс
// без изменения внутренней реализации существующих свойств.
// «закрыт для модификации»
// «Открыт для расширений»

class Rectangle {
    public double width;
    public double height;
}

class AreaCalculator {
    public double calculateArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }
}