package com.pattern.mediatorpattern.demo;

public class Stuff extends AbsColleague {

    public Stuff(AbsMediator absMediator) {
        super(absMediator);
    }

    public void buy(int num) {
        System.out.println("采购说：库存还有" + num + "，进货量只要" + (150 - num) + "就够了");
    }

}
