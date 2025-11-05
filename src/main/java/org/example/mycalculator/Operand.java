package org.example.mycalculator;

import javafx.beans.binding.Bindings;
import javafx.beans.property.*;

public class Operand {
    private final DoubleProperty value;
    private final BooleanProperty validity;
    private final StringProperty display;

    public Operand() {
        value = new SimpleDoubleProperty(0);
        validity = new SimpleBooleanProperty(false);
        display = new SimpleStringProperty("---");

        display.bind(
                Bindings.when(validity)
                        .then(value.asString())
                        .otherwise("---")
        );
    }

    public StringProperty displayProperty() { return display; }

    public double getValue() {
        return value.getValue();
    }

    public void setValue(double value) {
        this.value.setValue(value);
        this.setValidity(true);
    }

    public boolean isValid() {
        return validity.getValue();
    }

    public boolean isNotValid() {
        return !validity.getValue();
    }

    public void setValidity(boolean status) {
        validity.setValue(status);
    }

    @Override
    public String toString() {
        if (this.isNotValid()) {
            return "---";
        }

        return String.valueOf(this.value);
    }
}
