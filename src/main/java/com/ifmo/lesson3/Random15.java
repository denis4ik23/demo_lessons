package com.ifmo.lesson3;

import java.util.Random;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();

        // TODO implement
        for (int i = 0; i < randomNumbers().length; i++) {
            System.out.print(randomNumbers[i]);
        }
        System.out.println();

        int evens = evens(randomNumbers);

        // TODO implement
        System.out.println(evens);
    }

    public static int[] randomNumbers() {
        // TODO implement
        Random random = new Random();
        int[] rn = new int[15];
        for (int i = 0; i < rn.length; i++) {
            rn[i] = random.nextInt(9);
        }

        return rn;
    }

    private static int evens(int[] arr) {//(int[] arr)
        // TODO implement
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                cnt++;
            }
        }
        return cnt;
    }
}
