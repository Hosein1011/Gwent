package view;

import controller.LoginMenuController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Objects;

public class LoginMenuApplication extends Application {
    private static Stage primaryStage; // Add this line

    @Override
    public void start(Stage primaryStage) {
        LoginMenuApplication.primaryStage = primaryStage; // Add this line
        primaryStage.setTitle("Gwent Witcher Game - Login");

        // Background video
        String videoPath = Objects.requireNonNull(getClass().getResource("/video/LoginMenu_Background.mp4")).toExternalForm();
        Media media = new Media(videoPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();

        // UI Elements
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField("Enter your username");
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = createButton("Login");
        Button registerButton = createButton("Register");
        Button currentMenu = createButton("Show Current Menu");

        // Style the labels
        usernameLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
        passwordLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        // Style the text fields
        usernameField.setPrefWidth(400);
        usernameField.setStyle("-fx-font-size: 16px;");
        passwordField.setPrefWidth(400);
        passwordField.setStyle("-fx-font-size: 16px;");

        // Forgot Password link
        Hyperlink forgotPasswordLink = new Hyperlink("Forgot Password?");
        forgotPasswordLink.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        forgotPasswordLink.setOnAction(e -> {
            // Handle forgot password action
            LoginMenuController.resetPassword();
        });

        // Add all elements to the VBox
        VBox vbox = new VBox(10, usernameLabel, usernameField, passwordLabel, passwordField, loginButton, registerButton, currentMenu, forgotPasswordLink);
        vbox.setStyle("-fx-background-color: rgba(0,0,0,0.6); -fx-border-color: #FFD700; -fx-border-width: 2px; -fx-border-radius: 5; -fx-background-radius: 5; -fx-padding: 20;");
        vbox.setPadding(new Insets(25));
        vbox.setAlignment(Pos.CENTER);

        // Adjust VBox size to make it square
        double squareSize = 450;
        vbox.setPrefWidth(squareSize);
        vbox.setPrefHeight(squareSize);

        // Add blur effect to the VBox
        BoxBlur blurEffect = new BoxBlur(3, 3, 3);
        vbox.setEffect(blurEffect);

        // Add drop shadow effect to the VBox
        DropShadow dropShadow = new DropShadow(20, Color.BLACK);
        vbox.setEffect(dropShadow);

        // Align the VBox to the bottom-left corner
        HBox hbox = new HBox(vbox);
        hbox.setAlignment(Pos.BOTTOM_LEFT);

        StackPane stackPane = new StackPane(mediaView, hbox);
        StackPane.setAlignment(hbox, Pos.BOTTOM_LEFT);
        StackPane.setMargin(hbox, new Insets(50));

        Scene scene = new Scene(stackPane, 800, 600);
        primaryStage.setScene(scene);

        mediaView.fitWidthProperty().bind(scene.widthProperty());
        mediaView.fitHeightProperty().bind(scene.heightProperty());
        mediaView.setPreserveRatio(false);
        primaryStage.setFullScreen(true);
        primaryStage.show();

        LoginMenuController.setLoginMenuApplication(this);

        loginButton.setOnAction(e -> LoginMenuController.loginToAccount(usernameField.getText(), passwordField.getText()));
        registerButton.setOnAction(e -> {
            try {
                LoginMenuController.gotoRegister();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    private Button createButton(String text) {
        Button button = new Button();
        button.setStyle("-fx-background-color: #0080FF; -fx-text-fill: white; -fx-font-size: 18px; -fx-font-weight: bold; -fx-padding: 10px 20px;");
        button.setPrefWidth(400);

        // Create a rectangle for the button background
        Rectangle rectangle = new Rectangle(400, 40);
        rectangle.setArcWidth(20);
        rectangle.setArcHeight(20);
        rectangle.setFill(Color.web("#0080FF"));

        // Set the button background
        button.setBackground(javafx.scene.layout.Background.EMPTY);
        button.setGraphic(rectangle);

        // Set the button text
        Label label = new Label(text);
        label.setTextFill(Color.WHITE);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        StackPane.setAlignment(label, Pos.CENTER);
        StackPane stackPane = new StackPane(rectangle, label);
        button.setGraphic(stackPane);

        // Add a drop shadow effect to the button
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(5);
        dropShadow.setOffsetX(2);
        dropShadow.setOffsetY(2);
        dropShadow.setColor(Color.color(0, 0, 0, 0.5));
        button.setEffect(dropShadow);

        return button;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
