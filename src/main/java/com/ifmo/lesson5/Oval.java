package com.ifmo.lesson5;

/* Чтобы найти площадь эллипса, нужно найти произведение длин большой
*  и малой полуосей этого эллипса на число pi
*/

public class Oval extends  Shape{ // Овал
    double area(double a, double b) {
        double o = 3.14 * a * b;
        return o;
    }

}
