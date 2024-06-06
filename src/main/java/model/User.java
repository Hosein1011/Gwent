package model;
import java.util.ArrayList;

public class User {
    private String username;
    private String nickname;
    private String password;
    private String email;
    private int highestScore;
    private int gameCount;
    private int winCount;
    private int loseCount;
    private int drawCount;
    private ArrayList<GameResult> gameResults;
    private ArrayList<Question> questions;
    public User(String username , String nickname , String password , String email){
        this.email = email;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        highestScore = 0 ;
        gameCount = 0 ;
        winCount = 0;
        loseCount = 0 ;
        drawCount = 0 ;
        gameResults = new ArrayList<GameResult>();
        questions = new ArrayList<Question>();
    }
    public int getRank(){
        return 0 ;
    }
    public void win(){

    }
    public void lose(){

    }
    public void draw(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getWinCount() {
        return winCount;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public ArrayList<GameResult> getGameResults() {
        return gameResults;
    }

    public int getGameCount() {
        return gameCount;
    }

    public int getDrawCount() {
        return drawCount;
    }
    public static User getUserByUsername(String username){
        return null;
    }

}
