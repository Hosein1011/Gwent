package controller;

import javafx.scene.layout.Pane;
import model.*;
import view.PregameMenuApplication;

import java.util.ArrayList;

public class PregameController {
    private static Pane pregamePane ;
    private static PregameMenuApplication pregameMenuApplication ;

    private static User user1 ;
    private static User user2 ;
    private static boolean isUser1PregameTurn ;

    private static ArrayList<Card> deck1 ;
    private static ArrayList<Card> deck2 ;
    private static Faction faction1 ;
    private static Faction faction2 ;
    private static LeaderCard leader1 ;
    private static LeaderCard leader2 ;
    private static Faction showedFaction ;
    private static LeaderCard currentLeader ;

    private static ArrayList<Card> showedFactionCards ;
    //todo remove it later
    static {
        user1 = new User("mammad" , "mm" , "doij" , " ") ;
        user2 = new User("Ali" , "ali" , "ali" , " ") ;
    }

    public static void setCurrentLeader(LeaderCard currentLeader) {
        PregameController.currentLeader = currentLeader;
    }

    public static void setShowedFaction(Faction showedFaction) {
        PregameController.showedFaction = showedFaction;
    }

    public static void setPregamePane(Pane pregamePane) {
        PregameController.pregamePane = pregamePane;
    }

    public static void setPregameMenuApplication(PregameMenuApplication pregameMenuApplication) {
        PregameController.pregameMenuApplication = pregameMenuApplication;
    }

    public static void setIsUser1PregameTurn(boolean isUser1PregameTurn) {
        PregameController.isUser1PregameTurn = isUser1PregameTurn;
    }

    public static void setUser1(User user1) {
        PregameController.user1 = user1;
    }

    public static void setUser2(User user2) {
        PregameController.user2 = user2;
    }

    public static void showFactionOptions (){

    }

    public static void factionSelecting (Faction faction) {
        showedFactionCards = new ArrayList<Card>();
        showedFaction = faction;
        for (Card card : faction.getCards()) {
            if (card instanceof SpecialCard) showedFactionCards.add(CardCloning.specialCardCloning((SpecialCard) card));
            else if (card instanceof InFieldCard) showedFactionCards.add(CardCloning.inFieldCardCloning((InFieldCard) card));
        }

        //handle if user click was not on leaders
    }

    public static void showLeaderOptions() {

    }

    public static void leaderSelecting(LeaderCard leaderCard) {
        currentLeader = leaderCard ;
        //handle if user click was not on leaders
    }

    public static ArrayList<Card> getRandomHand (ArrayList<Card> deck) {
        return null ;
    }

    public static void selectCard (Card card) {
        //your code
        setShowingCards();
        setDeckInfo();
    }

    public static void changeTurn() {
        if (!isUser1PregameTurn) {
            startGame();
            return;
        }
        isUser1PregameTurn = false ;
        //code
    }

    public static void startGame() {
        Player player1 = new Player(user1 , deck1 , getRandomHand(deck1) , leader1) ;

    }

    private static void setDeckInfo() {

    }

    public static void setShowingCards() {
        //Call pregameMenuApplication.addCard for all card remained
    }
}
