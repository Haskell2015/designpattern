package com.pattern.tokenpattern;

public class Player {
    private int id;
    private long gold;
    private String name;

    Player(int id, long gold, String name) {
        this.gold = gold;
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGold(long gold) {
        this.gold = gold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void defeatBoss() {
        System.out.printf("%s在打怪%n", name);
    }

    public TokenPlayer save() {
        return new TokenPlayer(this.id, this.gold, this.name);
    }

    public void restoreState(TokenPlayer playe) {
        this.gold = playe.getGold();
        this.id = playe.getId();
        this.name = playe.getName();
    }
}
