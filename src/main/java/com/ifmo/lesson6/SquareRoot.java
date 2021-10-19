package com.ifmo.lesson6;

public class SquareRoot implements Operation{
    @Override
    public int calculate(int a, int b) {
        return (int)Math.sqrt(a);
    }
}
