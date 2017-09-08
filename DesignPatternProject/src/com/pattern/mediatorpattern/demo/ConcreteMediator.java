package com.pattern.mediatorpattern.demo;

public class ConcreteMediator extends AbsMediator {
    @Override
    public void isNeedBuy() {
        super.boss.cmd();
        int query = super.master.query();
        super.stuff.buy(query);
    }
}
