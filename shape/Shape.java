package hw.OOP.shape;

/*      1.Создайте супер класс Shape и его наследников Circle, Rectangle.
        2.Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
        3.Классы Circle, Rectangle содержат координаты точек.
        4.Создать массив содержащий эти фигуры.
        5.В цикле нарисовать их (вызвать метод draw).
        6.Добавить метод equals() для классов Shape, Circle, Rectangle.*/


import java.util.Objects;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
