package com.ifmo.lesson6;

public class Accumulator {
    private int value;
    private Operation op;
    public int getValue() {
        return value;
    }
    public void accumulate(int a){
        value = op.calculate(value,a);
    }
    public Accumulator(int startValue, Operation op){
        this.value = startValue;
        this.op = op;

    }
}
