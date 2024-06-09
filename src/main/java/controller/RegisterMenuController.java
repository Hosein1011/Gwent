package controller;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Regex;
import model.User;
import model.UserStorage;
import view.LoginMenuApplication;
import view.RegisterMenuApplication;
import javafx.scene.control.Alert;

import java.io.IOException;
import java.util.Objects;

public class RegisterMenuController {

    private static RegisterMenuApplication registerMenuApplication;

    public static void setRegisterMenuApplication(RegisterMenuApplication registerMenuApplication) {
        RegisterMenuController.registerMenuApplication = registerMenuApplication;
    }

    public static void registerUser(String name, String username, String email, String password, String confirmPassword) {
        if (!isUsernameValid(username)) {
            showAlert("Registration Error", "Invalid Username.");
            return;
        }
        if (!UserStorage.isUsernameUnique(username)) {
            showAlert("Registration Error", "Username already exists.");
            return;
        }
        if (!isEmailValid(email)) {
            showAlert("Registration Error", "Invalid Email.");
            return;
        }
        if (!UserStorage.isEmailUnique(email)) {
            showAlert("Registration Error", "Email already exists.");
            return;
        }
        if (!isPasswordValid(password)) {
            showAlert("Registration Error", "Invalid Password.");
            return;
        }
        if (!isPasswordStrong(password)) {
            showAlert("Registration Error", "Weak Password.");
            return;
        }
        if (!password.equals(confirmPassword)) {
            showAlert("Registration Error", "Passwords do not match.");
            return;
        }

        if (UserStorage.isUsernameUnique(username) && UserStorage.isEmailUnique(email)) {
            User newUser = new User(name ,username, password, email);
            UserStorage.addUser(newUser);
            showAlert("Registration Successful", "User registered successfully.");
        } else {
            showAlert("Registration Error", "Username or email already exists.");
        }
        // Registration successful
        goToLoginMenu();
    }

    private static void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static boolean isPasswordValid(String password) {
        return Regex.PASSWORD.getMatcher(password).matches();
    }

    public static boolean isPasswordStrong(String password) {
        return password.length() >= 8;
    }

    public static boolean isUsernameValid(String username) {
        return Regex.USERNAME.getMatcher(username).matches();
    }

    public static boolean isEmailValid(String email) {
        return Regex.EMAIL.getMatcher(email).matches();
    }

    private static void goToLoginMenu() {
        RegisterMenuApplication.getPrimaryStage().close();
        try {
            new LoginMenuApplication().start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
