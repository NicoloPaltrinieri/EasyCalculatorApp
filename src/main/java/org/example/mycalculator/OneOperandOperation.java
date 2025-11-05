package org.example.mycalculator;

public abstract class OneOperandOperation extends Operation {

    public OneOperandOperation(Operand operand1, Operand operand2) {
        super(operand1, operand2);
    }

    @Override
    protected void secondOperandNotValid() {
        super.getOperand2().setValidity(false);
    }
}
