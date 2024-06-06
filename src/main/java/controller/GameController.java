package controller;
import javafx.scene.layout.Pane;
import model.*;

import java.util.Scanner;
import java.util.regex.Matcher;

public class GameController {
    private static GameField gameField;
    private static Pane GamePane;
    private static Player playerOne;
    private static Player playerTwo;
    private static int roundNumber;

    //todo remove later
    static {
        playerOne = new Player(null , null  , null , new LeaderCard(Action.decoy , Faction.all , "/img/sm/monsters_eredin_copper.jpg"));
        playerTwo = new Player(null , null  , null , new LeaderCard(Action.decoy , Faction.all , "/img/sm/monsters_eredin_copper.jpg"));
    }

    public static void setGameField(GameField gameField) {
        GameController.gameField = gameField;
    }

    public static void setPlayerOne(Player playerOne) {
        GameController.playerOne = playerOne;
    }

    public static void setPlayerTwo(Player playerTwo) {
        GameController.playerTwo = playerTwo;
    }

    public static void setGamePane(Pane gamePane) {
        GamePane = gamePane;
    }

    public static void setRoundNumber(int roundNumber) {
        GameController.roundNumber = roundNumber;
    }

    public static Player getPlayerOne() {
        return playerOne;
    }

    public static Player getPlayerTwo() {
        return playerTwo;
    }

    public static void saveRound() {

    }

    public static void saveGame() {

    }

    public static String showCardsInHand(Matcher matcher) {
        return null;
    }

    public static int getNumberOfRemainingCardsInDeck() {
        return 0;
    }

    public static String showDeadCards() {
        return null;
    }

    public static String showCardsInRow(Matcher matcher) {
        return null;
    }

    public static boolean isRowNumberValid() {
        return false;
    }

    public static String getCurrentWeather() {
        return null;
    }

    public static int playCardControl(Scanner scanner, Matcher matcher) {
        return 0 ;
    }

    public static void playCard(Scanner scanner) {

    }

    public static boolean checkForTightBond() {
        return false;
    }

    public static boolean powerPlay() {
        return false;
    }

    public static void monstersPowerPlay() {

    }

    public static void nilfgaardianPowerPlay() {

    }

    public static void northernRealmsPowerPlay() {
    }

    public static void scoiataellPowerPlay() {

    }

    public static void skelligePowerPlay() {

    }

    public static String showBothPlayersInfo() {
        return null;
    }

    public static String showPlayers() {
        return null;
    }

    public static int numberOfRemainingCardsInHand() {
        return 0;
    }

    public static String showOnePlayerInfo() {
        return null;
    }

    public static String showScores() {
        return null;
    }

    public static int showTotalRowScore(Matcher matcher) {
        return 0;
    }

    public static String showTurn() {
        return null;
    }
    public static void passTurn() {

    }

    public static void endOfRound() {

    }

    public static void endOfGame() {

    }

}
