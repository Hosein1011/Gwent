package controller;

import model.User;
import model.UserStorage;
import view.LoginMenuApplication;
import view.RegisterMenuApplication;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import static controller.GameMainController.users;

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
        // Debug: Print login attempt
        System.out.println("Attempting to log in with username: " + username);

        boolean loginSuccessful = authenticateUser(username, password);
        if (loginSuccessful) {
            showAlert("Login Successful", "Welcome, " + username + "!");
            // Redirect to main menu or game screen
            //goToMainMenu();
        } else {
            showAlert("Login Error", "Invalid Username or Password.");
        }
    }

    private static boolean authenticateUser(String username, String password) {
        User user = UserStorage.getUserByUsername(username);
        // Debug: Print retrieved user
        System.out.println("Retrieved user: " + (user != null ? user.getUsername() : "null"));

        if (user != null && user.getPassword().equals(password)) {
            // Debug: Print password match success
            System.out.println("Password match for user: " + username);
            return true;
        }
        // Debug: Print password match failure
        System.out.println("Password match failed for user: " + username);
        return false;
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
