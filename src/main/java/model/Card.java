package model;

import controller.GameMainController;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.net.URL;

public abstract class Card extends Rectangle{
    private final int cardNumberInPregame ;
    private int remained ;
    private final Action ability;
    private final Faction faction;
    private final String url;
    public Card(int cardNumberInPregame, Action ability, Faction faction , String url) {
        this.cardNumberInPregame = cardNumberInPregame;
        remained = cardNumberInPregame;
        this.ability = ability;
        this.faction = faction;
        this.url = url;
        setFill(new ImagePattern(new Image(Card.class.getResource(url).toExternalForm())));
    }

    public int getRemained() {
        return remained;
    }

    public void selectCard() {
        remained-- ;
    }
    public int getCardNumberInPregame() {
        return cardNumberInPregame;
    }

    public Action getAbility() {
        return ability;
    }

    public Faction getFaction() {
        return faction;
    }

    public void Ability(){
        GameMainController.setOnUsingCard(this);
        if (ability == null) return;
        ability.run();
    }

    public String getUrl() {
        return url;
    }
}
