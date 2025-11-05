package org.example.mycalculator.OperationImplementations;

import org.example.mycalculator.OneOperandOperation;
import org.example.mycalculator.Operand;

public class SquaredPowOperation extends OneOperandOperation {
    public SquaredPowOperation(Operand operand1, Operand operand2) {
        super(operand1, operand2);
    }

    protected double executeCalc() {
        return super.getOperand1().getValue() * super.getOperand1().getValue();
    }
}
