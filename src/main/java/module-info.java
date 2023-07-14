module dev.zomarrd.calculator {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens dev.zomarrd.calculator to javafx.fxml;
    exports dev.zomarrd.calculator;
}