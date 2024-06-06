package controller;

import model.InFieldCard;
import model.LeaderCard;
import model.SpecialCard;

public class CardCloning {
    public static InFieldCard inFieldCardCloning(InFieldCard inFieldCard){
        return new InFieldCard(inFieldCard.getRow() , inFieldCard.isHero() , inFieldCard.getHealth() ,
                inFieldCard.getCardNumberInPregame() , inFieldCard.getAbility() , inFieldCard.getFaction() , inFieldCard.getUrl() ) ;

    }
    public static SpecialCard specialCardCloning(SpecialCard specialCard) {
        return new SpecialCard(specialCard.getCardNumberInPregame(), specialCard.getAbility(), specialCard.getUrl());
    }
}
