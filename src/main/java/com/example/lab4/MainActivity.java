package com.example.lab4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

import java.io.IOException;

public class MainActivity extends Application {

    private static final Controller CONTROLLER = new Controller();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainActivity.class.getResource("main-activity.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Lab4");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    public static void main(String[] args) {
        launch();
    }

    public static void changeTextFieldColor() {
        TextField textField = CONTROLLER.getSurnameTextField();
        textField.focusedProperty().addListener((observableValue, aBoolean, t1) -> {
            if(t1) {
                textField.setBackground(Background.fill(Colors.FOCUSED));
                System.out.println("Works");
            }
        });
        CONTROLLER.getNameTextField().setOnMouseEntered(CONTROLLER::onFocusChanged);
        CONTROLLER.getSurnameTextField().setOnMouseEntered(CONTROLLER::onFocusChanged);
        CONTROLLER.getLoginTextField().setOnMouseEntered(CONTROLLER::onFocusChanged);
        CONTROLLER.getPatronymicTextField().setOnMouseEntered(CONTROLLER::onFocusChanged);
        CONTROLLER.getRepPassField().setOnMouseEntered(CONTROLLER::onFocusChanged);
        CONTROLLER.getPassField().setOnMouseEntered(CONTROLLER::onFocusChanged);
    }

    public static void showAlertOnMouseExited() {
        CONTROLLER.anchorPane.setOnMouseExited(CONTROLLER::onMouseExited);
    }
}