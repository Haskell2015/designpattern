package com.pattern.mediatorpattern.demo;

public class MainTest {
    public static void main(String[] args) {
        AbsMediator mediator=new ConcreteMediator();

        Boss boss=new Boss(mediator);
        StockMaster master=new StockMaster(mediator);
        Stuff stuff=new Stuff(mediator);

        mediator.setBoss(boss);
        mediator.setMaster(master);
        mediator.setStuff(stuff);

        boss.buyStovk();
    }
}
