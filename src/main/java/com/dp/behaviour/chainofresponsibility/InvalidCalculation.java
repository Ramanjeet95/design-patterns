package com.dp.behaviour.chainofresponsibility;

public class InvalidCalculation implements Calculation {
    public InvalidCalculation(){}

    @Override
    public int calculate(int a, int b, String operation) {
        throw new RuntimeException("Invalid operation");
    }
}
