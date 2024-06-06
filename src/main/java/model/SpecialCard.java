package model;

public class SpecialCard extends Card{
    public SpecialCard(int cardNumberInPregame, Action ability, String url) {
        super(cardNumberInPregame, ability, Faction.all , url);
    }
}
