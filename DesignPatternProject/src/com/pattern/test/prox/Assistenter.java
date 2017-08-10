package com.pattern.test.prox;

public class Assistenter implements Prox {
    private Boss boss = new Boss();

    @Override
    public void buy() {
        boss.buy();
    }

    @Override
    public void sell() {
        boss.sell();
    }
}
