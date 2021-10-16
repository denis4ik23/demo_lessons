package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement

        int max = max(randomNumbers);
        int maxLastIndex = lastIndexOf(randomNumbers, max);

        // TODO implement
        System.out.println(maxLastIndex);
    }

    public static int[] randomNumbers() {
        // TODO implement
        Random random = new Random();
        int[] rn = new int[12];
        for (int i = 0; i < rn.length; i++) {
            rn[i] = random.nextInt(-15, 15);
        }

        return rn;
    }

    public static int max(int[] randomNumbers) {
        // TODO implement
        int max = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }

        return max;
    }

    public static int lastIndexOf(int[] randomNumbers, int max) {
        // TODO implement

        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] == max) {
                max = i;
            }
        }return max;
    }
}
