/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Shape implements Comparable<Shape> {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Цвет: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Shape shape = (Shape) obj;
        return color.equals(shape.color);
    }

    @Override
    public int compareTo(Shape shape) {
        if (this.getArea() < shape.getArea()) {
            return -1;
        }

        if (this.getArea() > shape.getArea()) {
            return 1;
        }

        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Цвет: " + color + ", Радиус: " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }

        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Цвет: " + color + ", Длина: " + length + ", Ширина: " + width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }

        Rectangle rectangle = (Rectangle) obj;
        return length == rectangle.length && width == rectangle.width;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Цвет: " + color + ", Сторона 1: " + side1 + ", Сторона 2: " + side2 + ", Сторона 3: " + side3;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }

        Triangle triangle = (Triangle) obj;


return side1 == triangle.side1 && side2 == triangle.side2 && side3 == triangle.side3;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, "Красный"));
        shapes.add(new Rectangle(4, 6, "Синий"));
        shapes.add(new Triangle(3, 4, 5, "Зеленый"));

        System.out.println("Фигуры до сортировки:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        
        
        for (Shape shape : shapes) {
            System.out.println("Площадь " + shape.getArea());
        }

        Collections.sort(shapes);

        System.out.println("\nФигуры после сортировки:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        
        for (Shape shape : shapes) {
            System.out.println("Площадь " + shape.getArea());
        }
    }
}



