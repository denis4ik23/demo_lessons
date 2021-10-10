package com.ifmo.lesson2;

import java.util.Random;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        // TODO implement
        Random random = new Random();

        return random.nextInt(899) +100;
    }

    public static String largestDigit(int rnd) {
        // TODO implement
        int num1 = rnd / 100;
        int num2 = rnd / 10;
        num2 %= 10;
        int num3 = rnd % 10;

        int max = 0;

        if(num1 >= num2  && num1 >= num3){
            max = num1;
        } else if(num2 >= num1 && num2 >= num3){
            max = num2;
        }
        else max = num3;

        return "В числе " + rnd + " наибольшая цифра " + max + ".";
    }
}
