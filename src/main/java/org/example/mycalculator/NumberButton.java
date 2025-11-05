package org.example.mycalculator;

public class NumberButton {
    public static void setPressedValue(int number, Operand operand1, Operand operand2) {
        if (operand1.isNotValid()) {
            operand1.setValue(number);
            operand2.setValidity(false);
        } else {
            operand2.setValue(number);
        }
    }
}
