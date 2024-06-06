package controller;

import view.MainMenuApplication;
import view.PregameMenuApplication;

public class MainMenuController {
    private static MainMenuApplication mainMenuApplication;

    public static void setMainMenuApplication(MainMenuApplication mainMenuApplication) {
        MainMenuController.mainMenuApplication = mainMenuApplication;
    }

    public static void logout(){

    }

    public static void startGame(){
        //get a second user username
        //set user1 and user2 in pregameController
        PregameController.setIsUser1PregameTurn(true);
    }

    public static void gotoProfileMenu(){
    }

    private static boolean isUserExists() {
        return false;
    }
}
