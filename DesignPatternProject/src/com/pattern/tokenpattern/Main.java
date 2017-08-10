package com.pattern.tokenpattern;

public class Main {
    public static void main(String[] args) {
        Master master = new Master();
        Player player = new Player(0, 100, "A");
        player.defeatBoss();
        master.setTokenPlayer(player.save());

        player.setName("B");
        player.defeatBoss();

        player.restoreState(master.getTokenPlayer());
        player.defeatBoss();
        master.setTokenPlayer(player.save());
    }
}
