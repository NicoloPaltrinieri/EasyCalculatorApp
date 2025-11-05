package org.example.mycalculator;

public abstract class Operation {
    private Operand operand1;
    private Operand operand2;

    public Operation(Operand operand1, Operand operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public final double calculate() {
        firstOperandNotValid();
        secondOperandNotValid();
        double returnValue = executeCalc();

        operand1.setValidity(false);
        operand2.setValidity(false);

        return returnValue;
    }

    protected void firstOperandNotValid() throws IllegalArgumentException {
        if (operand1.isNotValid()) {
            throw new IllegalArgumentException("Il primo operando non è valido");
        }
    }

    protected void secondOperandNotValid() {
    }

    protected abstract double executeCalc();

    protected Operand getOperand1() {
        return operand1;
    }

    protected Operand getOperand2() {
        return operand2;
    }
}
