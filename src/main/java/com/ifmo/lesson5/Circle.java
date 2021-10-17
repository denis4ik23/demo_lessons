package com.ifmo.lesson5;

// Площадь круга с радиусом r равна pi * (r * r)

public class Circle extends Shape{ // Круг
    double area(double r) {
        double c = 3.14 * (r * r);
        return c;
    }

}
