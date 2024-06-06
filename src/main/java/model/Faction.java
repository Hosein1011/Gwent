package model;

import java.util.ArrayList;

public enum Faction {
    all("all"),
    northernRealms("northernRealms"),
    nilfgaardianEmpire("nilfgaardianEmpire"),
    monsters("monsters") ,
    scoiaTael("scoiaTael") ,
    skellige("skellige") ,
    ;
    static {
        for(Faction faction : Faction.values()){
            for(Card card : all.cards) faction.cards.add(card);
            for(CardType cardType : CardType.values()) {
                if (cardType.getCard() instanceof LeaderCard) faction.leaders.add((LeaderCard) cardType.getCard());
                else for(int i = 0 ; i < cardType.getCard().getRemained() ; i++) faction.cards.add(cardType.getCard());
            }
        }
    }
    Faction(String name){
        this.name = name;
        leaders = new ArrayList<LeaderCard>();
        cards = new ArrayList<Card>();
    }
    private String name ;
    private ArrayList<LeaderCard> leaders ;
    private ArrayList<Card> cards;

    public String getName() {
        return name;
    }

    public ArrayList<LeaderCard> getLeaders() {
        return leaders;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}
