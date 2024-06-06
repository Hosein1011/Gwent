package model;

public class LeaderCard extends Card implements Cloneable{
    public LeaderCard(Action ability, Faction faction , String url) {
        super(1 , ability, faction , url);
    }
}
