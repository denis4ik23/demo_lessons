package com.ifmo.lesson5;

// Для определения площади прямоугольника необходимо длину прямоугольника умножить на его ширину

public class Rectangle extends Shape{ // Прямоугольник
    double area(double a, double b) {
        double r = a * b;
        return r;
    }

}
