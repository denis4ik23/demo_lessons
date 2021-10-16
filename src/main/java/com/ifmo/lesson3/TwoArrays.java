package com.ifmo.lesson3;

import java.util.Random;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();

        // TODO implement
        for (int j : randomNumbers1) {
            System.out.print(j);
        }
        System.out.println();

        for (int j : randomNumbers2) {
            System.out.print(j);
        }
        System.out.println();

        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);

        // TODO implement
        if (average1 > average2){
            System.out.println("Среднее арифметическое элементов массива randomNumbers1 больше чем у массива randomNumbers2");
        } else if (average2 > average1){
            System.out.println("Среднее арифметическое элементов массива randomNumbers2 больше чем у массива randomNumbers1");
        } else {
            System.out.println("Среднее арифметическое элементов массива randomNumbers1 и randomNumbers2 равны");
        }
    }

    public static int[] randomNumbers() {
        // TODO implement
        Random random = new Random();
        int[] rn = new int[5];
        for (int i = 0; i < 5; i++) {
            rn[i] = random.nextInt(5);
        }

        return rn;
    }

    public static int average(int[] randomNumbers) {
        // TODO implement
        int sum = 0;
        for (int randomNumber : randomNumbers) {
            sum = sum + randomNumber;
        }
        return sum / 5;
    }
}
