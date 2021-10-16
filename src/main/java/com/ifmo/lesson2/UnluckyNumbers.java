package com.ifmo.lesson2;

public class UnluckyNumbers {
    /*
    В американской армии считается несчастливым число 13, а в японской — 4. Перед
    международными учениями штаб российской армии решил исключить номера боевой
    техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не
    смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс. единиц боевой
    техники и каждая боевая машина имеет номер от 00001 до 99999, то сколько всего номеров
    придётся исключить?
     */
    public static void main(String[] args) {
        System.out.println(unluckyNumbersCount());
    }

    public static int unluckyNumbersCount() {
        // TODO implement
        int cnt = 0;
        int max = 99999;
        for (int j = 0; j < 5; j++) {

            if(j == 2){
                max = 9999;
            }
            if(j == 3){
                max = 999;
            }
            if(j == 4){
                max = 99;
            }
            for (int i = 1; i < max; i++) {
                if(i % 10 == 4 || i % 100 == 13){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
