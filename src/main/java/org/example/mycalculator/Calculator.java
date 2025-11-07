package org.example.mycalculator;

import org.example.mycalculator.OperationImplementations.*;

import java.util.Map;

public class Calculator {
    private final Operand operand1;
    private final Operand operand2;
    private final Operand result;

    public static Map<Integer, Operation> operationMap;

    public Calculator(Operand operand1, Operand operand2, Operand result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;

        operationMap = Map.of(
                OperationList.ADDITION.getValue(), new AddOperation(operand1, operand2),
                OperationList.SUBTRACTION.getValue(), new SubtractionOperation(operand1, operand2),
                OperationList.MULTIPLICATION.getValue(), new MultiplicationOperation(operand1, operand2),
                OperationList.DIVISION.getValue(), new DivisionOperation(operand1, operand2),
                OperationList.SQUARE.getValue(), new SquaredPowOperation(operand1, operand2)
        );
    }

    public Operand getOperand1() {
        return operand1;
    }

    public Operand getOperand2() {
        return operand2;
    }

    public Operand getResult() {
        return result;
    }

    public void resetAllOperands() {
        operand1.setValidity(false);
        operand2.setValidity(false);
        result.setValidity(false);
    }
}
