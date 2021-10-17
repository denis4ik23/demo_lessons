package com.ifmo.lesson5;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
            System.out.println("Площадь круга: " + circle.area(5)); // Площадь круга

        Oval oval = new Oval();
            System.out.println("Площадь овала: " + oval.area(2, 3)); // Площадь овала

        Rectangle rectangle = new Rectangle();
            System.out.println("Площадь прямоугольника: " + rectangle.area(3,5)); // Площадь прямоугольника

        Square square = new Square();
            System.out.println("Площадь кадрата: " + square.area(4)); // Площадь квадрата

        Triangle triangle = new Triangle();
            System.out.println("Площадь треугольника: " + triangle.area(2, 4));

    }

}
