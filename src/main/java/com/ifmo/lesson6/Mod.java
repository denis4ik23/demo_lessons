package com.ifmo.lesson6;

public class Mod implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a % b;
    }
}
