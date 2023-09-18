package com.example.lab4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;

public class Controller {
    @FXML
    public AnchorPane anchorPane;

    @FXML
    private TextField loginTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private PasswordField passField;

    @FXML
    private TextField patronymicTextField;

    @FXML
    private PasswordField repPassField;

    @FXML
    private TextField surnameTextField;

    @FXML
    void onAgreeClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Я знаю твой пароль!");

        alert.setHeaderText(null);
        if(!passField.getText().isEmpty()) {
            alert.setContentText(passField.getText());
        } else alert.setContentText("Введи пароль по-братски");

        alert.showAndWait();
    }

    @FXML
    void onCancelClick(ActionEvent event) {
        loginTextField.clear();
        nameTextField.clear();
        surnameTextField.clear();
        patronymicTextField.clear();
        passField.clear();
        repPassField.clear();
    }

    @FXML
    void onFocusChanged(MouseEvent event) {
        if(event.getSource() instanceof TextField) {
            changeTextFieldColor((TextField) event.getSource());
        }
    }

    void changeTextFieldColor(TextField textField) {
        if(textField.isFocused()) textField.setBackground(Background.fill(Colors.FOCUSED));
        else textField.setBackground(Background.fill(Colors.UNFOCUSED));
    }

    @FXML
    void onMouseExited(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Верни курсор!");

        alert.setHeaderText(null);
        alert.setContentText("ВЕРНИ КУРСОР!");

        alert.showAndWait();
    }

    public TextField getLoginTextField() {
        return loginTextField;
    }

    public void setLoginTextField(TextField loginTextField) {
        this.loginTextField = loginTextField;
    }

    public TextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(TextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public PasswordField getPassField() {
        return passField;
    }

    public void setPassField(PasswordField passField) {
        this.passField = passField;
    }

    public TextField getPatronymicTextField() {
        return patronymicTextField;
    }

    public void setPatronymicTextField(TextField patronymicTextField) {
        this.patronymicTextField = patronymicTextField;
    }

    public PasswordField getRepPassField() {
        return repPassField;
    }

    public void setRepPassField(PasswordField repPassField) {
        this.repPassField = repPassField;
    }

    public TextField getSurnameTextField() {
        return surnameTextField;
    }

    public void setSurnameTextField(TextField surnameTextField) {
        this.surnameTextField = surnameTextField;
    }
}