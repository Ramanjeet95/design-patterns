package com.dp.behaviour.chainofresponsibility;

public class DivideCalculation implements Calculation {
    private final Calculation nextCalculation;
    private static final String OPERATION = "divide";
    public DivideCalculation(Calculation nextCalculation) {
        this.nextCalculation = nextCalculation;
    }

    @Override
    public int calculate(int a, int b, String operation) {
        if(OPERATION.equals(operation))
            return a/b;

        return nextCalculation.calculate(a,b, operation);
    }
}
