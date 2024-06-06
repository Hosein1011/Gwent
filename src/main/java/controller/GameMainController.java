package controller;

import javafx.stage.Stage;
import model.Card;
import model.User;

import java.util.ArrayList;

public class GameMainController {
    private static Card onUsingCard;
    private static Stage stage;
    private static User currentUser;
    public static ArrayList<User> users;
    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        GameMainController.stage = stage;
    }

    public static Card getOnUsingCard() {
        return onUsingCard;
    }

    public static void setOnUsingCard(Card onUsingCard) {
        GameMainController.onUsingCard = onUsingCard;
    }

    public static void setCurrentUser(User currentUser) {
        GameMainController.currentUser = currentUser;
    }
}
