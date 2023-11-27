package com.example.conversor_divisas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ConversorDivisas extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(ConversorDivisas.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 445, 267);
        stage.setTitle("Conversor de Monedas");
        stage.setScene(scene);
        stage.show();

        ConversorController controller = fxmlLoader.getController();
        controller.initialize();

    }

    public static void main(String[] args) {

        launch();
    }
}
