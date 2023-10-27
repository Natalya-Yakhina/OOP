package Seminar.Seminar_7.primer;

import java.util.Scanner;

// Decorator Pattern
// когда не можем изменить конкретный класс, но хотим добавить какой-либо функционал
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class ShapeDecorator implements Shape { // соединяет наш класс Shape
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator { // добавляем функционал
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Adding red color.");
    }
}

// Factory Pattern
// Паттерн Фабрика
// возможность гибко создавать
class ShapeFactory {
    public static Shape createShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        return null;
    }
}

// Adapter Pattern
// в тех случаях, если два класса не совместимы
class LegacyRectangle { // старый
    private int width;
    private int height;

    public LegacyRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class RectangleAdapter implements Shape {
    private LegacyRectangle legacyRectangle; // новый, оборачиваем в старый

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw() {
        System.out.println("Drawing an adapted rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Decorator Pattern
        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        rectangle.draw();
        redRectangle.draw();

        // Factory Pattern
        Scanner scanner = new Scanner(System.in);
        Shape circle = ShapeFactory.createShape(scanner.nextLine());
        circle.draw();

        // Adapter Pattern
        LegacyRectangle legacyRectangle = new LegacyRectangle(5, 7);
        Shape adaptedRectangle = new RectangleAdapter(legacyRectangle);
        adaptedRectangle.draw();
    }
}