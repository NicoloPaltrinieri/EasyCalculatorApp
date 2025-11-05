package org.example.mycalculator;

public enum OperationList {
    ADDITION(1),
    SUBTRACTION(2),
    MULTIPLICATION(3),
    DIVISION(4),
    SQUARE(5);

    private final int value;

    OperationList(int value) {
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
