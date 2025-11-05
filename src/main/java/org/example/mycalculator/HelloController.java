package org.example.mycalculator;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    public Calculator calculator;
    public EqualsButton equalsButton;


    public AnchorPane BaseAnchorPane;

    public Label LabelOperand1;
    public Label LabelOperand2;
    public Label LabelOperandResult;

    public Button EqualsButton;

    public Button ZeroNumberButton;
    public Button OneNumberButton;
    public Button TwoNumberButton;
    public Button ThreeNumberButton;
    public Button FourNumberButton;
    public Button FiveNumberButton;
    public Button SixNumberButton;
    public Button SevenNumberButton;
    public Button EightNumberButton;
    public Button NineNumberButton;

    public Button PlusButton;
    public Button minusButton;
    public Button moltiplicationButton;
    public Button divisionButton;
    public Button squareButton;

    public void initialize() {
        calculator = new Calculator(new Operand(), new Operand(), new Operand());
        equalsButton = new EqualsButton(calculator.getResult());

        LabelOperand1.textProperty().bind(calculator.getOperand1().displayProperty());
        LabelOperand2.textProperty().bind(calculator.getOperand2().displayProperty());
        LabelOperandResult.textProperty().bind(calculator.getResult().displayProperty());    }

    public void EqualsButtonOnAction(ActionEvent actionEvent) {
        try {
            equalsButton.executeOperation();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void zeroButtonOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(0, calculator.getOperand1(), calculator.getOperand2());
    }

    public void OneButtonOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(1, calculator.getOperand1(), calculator.getOperand2());

    }

    public void TwoNumberOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(2, calculator.getOperand1(), calculator.getOperand2());

    }

    public void ThreeButtonOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(3, calculator.getOperand1(), calculator.getOperand2());

    }

    public void FourButtonOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(4, calculator.getOperand1(), calculator.getOperand2());

    }

    public void FiveButtonOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(5, calculator.getOperand1(), calculator.getOperand2());

    }

    public void SixButtonOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(6, calculator.getOperand1(), calculator.getOperand2());

    }

    public void SevenButtonOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(7, calculator.getOperand1(), calculator.getOperand2());

    }

    public void EightButtonOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(8, calculator.getOperand1(), calculator.getOperand2());

    }

    public void NineButtonOnAction(ActionEvent actionEvent) {
        NumberButton.setPressedValue(9, calculator.getOperand1(), calculator.getOperand2());

    }


    public void plusButtonOnAction(ActionEvent actionEvent) {
        equalsButton.setOperationNumber(OperationList.ADDITION.getValue());
    }

    public void minusButtonOnAction(ActionEvent actionEvent) {
        equalsButton.setOperationNumber(OperationList.SUBTRACTION.getValue());
    }

    public void moltiplicationButtonOnAction(ActionEvent actionEvent) {
        equalsButton.setOperationNumber(OperationList.MULTIPLICATION.getValue());
    }

    public void divisionButtonOnAction(ActionEvent actionEvent) {
        equalsButton.setOperationNumber(OperationList.DIVISION.getValue());
    }

    public void squareButtonOnAction(ActionEvent actionEvent) {
        equalsButton.setOperationNumber(OperationList.SQUARE.getValue());
    }
}