package org.example.mycalculator;

import org.example.mycalculator.OperationImplementations.*;

import java.util.Map;

public class Calculator {
    private Operand operand1;
    private Operand operand2;
    private Operand result;

    public static Map<Integer, Operation> operationMap;

    private int operationNumber;

    public Calculator(Operand operand1, Operand operand2, Operand result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;

        this.setOperationNumber(0);
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

    public void setOperand1(Operand operand1) {
        this.operand1 = operand1;
    }

    public Operand getOperand2() {
        return operand2;
    }

    public void setOperand2(Operand operand2) {
        this.operand2 = operand2;
    }

    public Operand getResult() {
        return result;
    }

    public void setResult(Operand result) {
        this.result = result;
    }

    public int getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(int operationNumber) {
        this.operationNumber = operationNumber;
    }
}
