/*
 * Copyright (c) 2023. OMY TECHNOLOGY <omar@omy.technology>
 */

package dev.zomarrd.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Calculator extends Application {
    public static void main(String[] args) {
        launch();
    }

    @SuppressWarnings("DataFlowIssue")
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Calculator.fxml"));

        Scene scene = new Scene(loader.load());
        scene.setFill(Color.TRANSPARENT);

        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.setTitle("Calculator");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("icon.png")));
        ((Controller) loader.getController()).init(stage);
        stage.show();
    }
}