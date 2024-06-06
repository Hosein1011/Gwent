package controller;

import javafx.stage.Stage;
import model.Regex;
import view.LoginMenuApplication;
import view.RegisterMenuApplication;
import javafx.scene.control.Alert;

public class RegisterMenuController {
    private static RegisterMenuApplication registerMenuApplication;

    public static void setRegisterMenuApplication(RegisterMenuApplication registerMenuApplication) {
        RegisterMenuController.registerMenuApplication = registerMenuApplication;
    }

    public static void registerUser(String name, String username, String password, String confirmPassword) {
        if (!isUsernameValid(username)) {
            showAlert("Registration Error", "Invalid Username.");
            return;
        }
        if (!isUsernameUnique(username)) {
            showAlert("Registration Error", "Username already exists.");
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

        // Registration successful
        showAlert("Registration Successful", "You have successfully registered.");
        goToLoginMenu();
    }

    private static void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
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

    public static boolean isUsernameUnique(String username) {
        // Check if the username is unique (implement your own logic)
        // For demonstration, assume all usernames are unique except "user"
        return !username.equals("user");
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