package com.pattern.mediatorpattern.demo;

public class StockMaster extends AbsColleague {
    private int num = 100;

    public StockMaster(AbsMediator absMediator) {
        super(absMediator);
    }


    public int query() {
        System.out.println("仓管说：我去查下库存....");
        System.out.println("仓管说：库存还有" + num);
        return num;
    }
}
