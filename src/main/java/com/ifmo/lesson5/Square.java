package com.ifmo.lesson5;

// Площадь квадрата равна квадрату длины его стороны

public class Square extends Shape{ // Квадрат
    double area(double a) {
        double s = a * a;
        return s;
    }

}
