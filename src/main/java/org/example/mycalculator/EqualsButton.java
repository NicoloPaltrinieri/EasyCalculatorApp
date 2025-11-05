package org.example.mycalculator;

import java.util.Optional;

public class EqualsButton {
    private Operand result;
    private int operationNumber;

    public EqualsButton(Operand result) {
        this.result = result;
        this.operationNumber = 0;
    }

    public void setOperationNumber(int operationNumber) {
        this.operationNumber = operationNumber;
    }

    public void executeOperation() {
        Operation op = Calculator.operationMap.get(operationNumber);
        if (op != null) {
            result.setValue(op.calculate());
        }
    }

}
