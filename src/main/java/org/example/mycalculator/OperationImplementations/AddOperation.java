package org.example.mycalculator.OperationImplementations;

import org.example.mycalculator.Operand;
import org.example.mycalculator.TwoOperandOperation;

public class AddOperation extends TwoOperandOperation {

    public AddOperation(Operand operand1, Operand operand2) {
        super(operand1, operand2);
    }

    protected double executeCalc() {
        return super.getOperand1().getValue() + super.getOperand2().getValue();
    }
}
