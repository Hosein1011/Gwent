package model;
public class GameField {
    private final Player player1;
    private final Player player2;
    private Card weatherCard ;
    private Player inTurnPlayer ;
    public GameField(Player player1 , Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getInTurnPlayer() {
        return inTurnPlayer;
    }

    public void nextTurn() {
    }

    public Card getWeatherCard() {
        return weatherCard;
    }

    public void setWeatherCard(Card weatherCard) {
        this.weatherCard = weatherCard;
    }
}
