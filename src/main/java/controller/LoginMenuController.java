package controller;

import view.LoginMenuApplication;
import view.RegisterMenuApplication;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginMenuController {
    private static LoginMenuApplication loginMenuApplication;

    public LoginMenuController() {
    }

    public static void setLoginMenuApplication(LoginMenuApplication loginMenuApplication) {
        LoginMenuController.loginMenuApplication = loginMenuApplication;
    }

    public static void loginToAccount(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Login Error", "Username or Password cannot be empty.");
            return;
        }

        // Here you should add the logic to verify the username and password
        boolean loginSuccessful = authenticateUser(username, password);

        if (loginSuccessful) {
            showAlert("Login Successful", "Welcome, " + username + "!");
            // Redirect to main menu or game screen
            goToMainMenu();
        } else {
            showAlert("Login Error", "Invalid Username or Password.");
        }
    }

    private static boolean authenticateUser(String username, String password) {
        // Implement your authentication logic here
        // For now, let's just return true for demonstration purposes
        return "user".equals(username) && "password".equals(password);
    }

    private static void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void gotoRegister() throws Exception {
        // Navigate to RegisterMenuApplication
        Stage stage = LoginMenuApplication.getPrimaryStage();
        new RegisterMenuApplication().start(stage);
    }

    public static void goToMainMenu() {
        showAlert("Main Menu", "Navigating to Main Menu...");
        // Implement navigation to the main menu
    }

    public static void resetPassword() {
        showAlert("Reset Password", "Reset Password functionality will be implemented here.");
        // Implement reset password functionality
    }
}
