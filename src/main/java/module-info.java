module org.example.mycalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.mycalculator to javafx.fxml;
    exports org.example.mycalculator;
    exports org.example.mycalculator.OperationImplementations;
    opens org.example.mycalculator.OperationImplementations to javafx.fxml;
}