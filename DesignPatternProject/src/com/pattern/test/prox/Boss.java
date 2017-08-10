package com.pattern.test.prox;

public class Boss implements Prox {
    @Override
    public void buy() {
        System.out.println("Boss买吃的");
    }

    @Override
    public void sell() {
        System.out.println("Boss卖产品");
    }
}
