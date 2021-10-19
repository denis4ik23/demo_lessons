package com.ifmo.lesson6;

public class Main {

    public static void main(String[] args) {
        Accumulator acc = new Accumulator(0, new Plus()); // new Minus(); new Multiply
        Accumulator acc1 = new Accumulator(0, new Minus());
        Accumulator acc2 = new Accumulator(1, new Multiply());
        Accumulator acc3 = new Accumulator(10, new Divide());
        Accumulator acc4 = new Accumulator(3, new Mod());
        Accumulator acc5 = new Accumulator(3, new Power());
        Accumulator acc6 = new Accumulator(9, new SquareRoot());
        acc.accumulate(2);
        acc.accumulate(5);
        System.out.println(acc.getValue());// 7
        acc1.accumulate(2);
        acc1.accumulate(5);
        System.out.println(acc1.getValue());// -7
        acc2.accumulate(2);
        acc2.accumulate(5);
        System.out.println(acc2.getValue());// 10
        acc3.accumulate(2);
        System.out.println(acc3.getValue());
        acc4.accumulate(2);
        System.out.println(acc4.getValue());
        acc5.accumulate(2);
        System.out.println(acc5.getValue());
        acc6.accumulate(1);
        System.out.println(acc6.getValue());

    }
}
