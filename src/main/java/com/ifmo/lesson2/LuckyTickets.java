package com.ifmo.lesson2;

public class LuckyTickets {
    /*
    В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую
    неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от
    000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
    номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или
    567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
    и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте
    сколько счастливых билетов в одном рулоне?
     */
    public static void main(String[] args) {
        System.out.println(luckyTickets());
    }

    public static int luckyTickets() {
        // TODO implement
        int lucky = 0;
        for (int i = 1001; i < 1000000; i++) {
            int n1 = i / 100000 % 10;
            int n2 = i / 10000 % 10;
            int n3 = i / 1000 % 10;
            int n4 = i / 100 % 10;
            int n5 = i / 10 % 10;
            int n6 = i % 10;
            if((n1 + n2 +n3) == (n4 + n5 + n6)){
                lucky++;
            }
        }

        return lucky;
    }
}
