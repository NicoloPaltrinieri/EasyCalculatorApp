package org.example.mycalculator;

public abstract class TwoOperandOperation extends Operation {

    public TwoOperandOperation(Operand operand1, Operand operand2) {
        super(operand1, operand2);
    }

    @Override
    protected void secondOperandNotValid() throws IllegalArgumentException{
        if (super.getOperand2().isNotValid()) {
            throw new IllegalArgumentException("Il secondo operando non è valido");
        }
    }

}
