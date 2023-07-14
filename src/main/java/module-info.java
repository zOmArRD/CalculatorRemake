module dev.zomarrd.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires kotlin.stdlib;

    opens dev.zomarrd.calculator to javafx.fxml;
    exports dev.zomarrd.calculator;
}