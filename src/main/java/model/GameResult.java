package model;
import java.util.ArrayList;
import java.util.Date;

public class GameResult {
    private final User owner ;
    private final User rival ;
    private final Date date ;
    private final User winner ;
    private final int roundCount;
    private final int ownerScore ;
    private final int rivalScore ;
    private final ArrayList<RoundResult> roundResults;
    public GameResult(User owner , User rival , Date date , User winner , int roundCount , int ownerScore , int rivalScore , ArrayList<RoundResult> roundResults){
        this.owner = owner;
        this.rival = rival;
        this.date = date;
        this.winner = winner;
        this.roundCount = roundCount;
        this.ownerScore = ownerScore;
        this.rivalScore = rivalScore;
        this.roundResults = roundResults;
    }

    public Date getDate() {
        return date;
    }

    public User getOwner() {
        return owner;
    }

    public int getOwnerScore() {
        return ownerScore;
    }

    public User getWinner() {
        return winner;
    }

    public ArrayList<RoundResult> getRoundResults() {
        return roundResults;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public int getRivalScore() {
        return rivalScore;
    }

    public User getRival() {
        return rival;
    }

}
