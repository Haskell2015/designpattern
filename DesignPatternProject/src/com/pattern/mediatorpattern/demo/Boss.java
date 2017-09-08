package com.pattern.mediatorpattern.demo;

public class Boss extends AbsColleague{

    public Boss(AbsMediator absMediator) {
        super(absMediator);
    }

    public void cmd(){
        System.out.println("老板说：是不是该进货了?");
    }

    public void buyStovk(){
        super.absMediator.isNeedBuy();
    }
}
