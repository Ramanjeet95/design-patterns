package com.dp.behaviour.chainofresponsibility;

public class TestChainOfResponsibility {
    public static void main(String[] args) {
        Calculation calculation = new AddCalculation(new SubtractCalculation(new MultiplyCalculation(new DivideCalculation(new InvalidCalculation()))));
        calculation.calculate(1,2, "i");
    }
}
