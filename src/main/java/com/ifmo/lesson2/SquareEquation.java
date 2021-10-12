package com.ifmo.lesson2;

import java.util.Arrays;

public class SquareEquation {
    /*
     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
     будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
     либо сообщать, что корней нет.
     */
    public static void main(String[] args) {
        double a = 3;//2
        double b = -18;//-9
        double c = 27;//9

        double[] roots = squareEquationRoots(a, b, c);

        System.out.println(Arrays.toString(roots));
    }

    /*
    Возвращает массив из двух корней или null, если таковых нет.
     */
    public static double[] squareEquationRoots(double a, double b, double c) {
        // TODO implement
        double d = b * b - (4 * a * c);
        if(d > 0){
            double[] x12 = new double[2];
            double x1 = ( - b - Math.sqrt(d)) / (2 * a);
            double x2 = ( - b + Math.sqrt(d)) / (2 * a);
            x12[0] = x1;
            x12[1] = x2;
            return x12;
        }
        else if(d == 0){
            double[] x12 = new double[2];
            double x1 = ( - (b / (2 * a)));
            double x2 = x1;
            x12[0] = x1;
            x12[1] = x2;
            return x12;
        }
        else if (d < 0) {

        }return null;
    }
}
