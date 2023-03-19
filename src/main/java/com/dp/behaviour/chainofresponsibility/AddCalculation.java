package com.dp.behaviour.chainofresponsibility;

public class AddCalculation implements Calculation {
    private final Calculation nextCalculation;
    private static final String OPERATION = "add";
    public AddCalculation(Calculation nextCalculation) {
        this.nextCalculation = nextCalculation;
    }

    @Override
    public int calculate(int a, int b, String operation) {
        if(OPERATION.equals(operation))
            return a+b;

        return nextCalculation.calculate(a,b, operation);
    }
}
