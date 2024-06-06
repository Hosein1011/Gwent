package model;

public class InFieldCard extends Card{
    private int health;
    private final boolean isHero ;
    private final String row ;
    public InFieldCard(String row , boolean isHero , int basicHealth , int cardNumberInPregame, Action ability, Faction faction , String url) {
        super(cardNumberInPregame, ability, faction , url);
        health = basicHealth;
        this.isHero = isHero;
        this.row = row ;//combat range siege ... combat,range
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isHero() {
        return isHero;
    }

    public String getRow() {
        return row;
    }
}
