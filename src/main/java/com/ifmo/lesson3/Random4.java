package com.ifmo.lesson3;

import java.util.Random;

import static java.lang.System.*;

public class Random4 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
    строку. Определить и вывести на экран сообщение о том, является ли массив строго
    возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println(isIncreasingSequence(randomNumbers));
    }

    public static int[] randomNumbers() {
        // TODO implement
        Random random = new Random();
        int[] ran = new int[4];
        for (int i = 0; i < ran.length; i++) {
            ran[i] = random.nextInt(89 + 10);
        }

        return ran;
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {//не правильно
        // TODO implement
        for (int i = 0; i < randomNumbers.length; i++) {
            if(i > 0 && randomNumbers[i - 1] >= randomNumbers[i]){
        return false;
            }
        }
        return true;
    }
}
