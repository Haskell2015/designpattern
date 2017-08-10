package com.pattern.tokenpattern;

public class TokenPlayer {
    private int id;
    private long gold;
    private String name;

    TokenPlayer(int id, long gold, String name) {
        this.id = id;
        this.gold = gold;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public long getGold() {
        return gold;
    }

    public String getName() {
        return name;
    }
}
