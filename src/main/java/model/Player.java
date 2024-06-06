package model;

import java.util.ArrayList;

public class Player {
    private User user;
    private ArrayList<Card> hand;
    private ArrayList<Card> deck;
    private int duration ;
    private ArrayList<Card> discardCards;
    private final LeaderCard leader ;
    private final Faction faction;
    private int health ;
    private int score ;
    private ArrayList<Card> closeCombat ;
    private ArrayList<Card> ranged ;
    private ArrayList<Card> siege;
    private Card closeCombatHorn ;
    private Card rangedHorn ;
    private Card siegeHorn;
    public Player(User user , ArrayList<Card> hand , ArrayList<Card> deck , LeaderCard leader){
        this.user = user ;
        this.hand = new ArrayList<Card>() ;
        this.deck = deck ;
        this.discardCards = new ArrayList<Card>();
        duration = 0 ;
        health = 2 ;
        score = 0;
        this.leader = leader;
        faction = leader.getFaction();
        closeCombat = new ArrayList<Card>();
        ranged = new ArrayList<Card>();
        siege = new ArrayList<Card>();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public ArrayList<Card> getDiscardCards() {
        return discardCards;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public LeaderCard getLeader() {
        return leader;
    }

    public ArrayList<Card> getCloseCombat() {
        return closeCombat;
    }

    public ArrayList<Card> getRanged() {
        return ranged;
    }

    public ArrayList<Card> getSiege() {
        return siege;
    }

    public Card getCloseCombatHorn() {
        return closeCombatHorn;
    }

    public void setCloseCombatHorn(Card closeCombatHorn) {
        this.closeCombatHorn = closeCombatHorn;
    }

    public Card getRangedHorn() {
        return rangedHorn;
    }

    public void setRangedHorn(Card rangedHorn) {
        this.rangedHorn = rangedHorn;
    }

    public Card getSiegeHorn() {
        return siegeHorn;
    }

    public void setSiegeHorn(Card siegeHorn) {
        this.siegeHorn = siegeHorn;
    }
}
