package com.pattern.mediatorpattern;

public class ConcreteMediator extends AbsMediator {


    public void A2B(String string) {
        System.out.println("A需要B来处理：" + string);
    }

    public void B2A(String str) {
        System.out.println("B需要A来处理：" + str);
    }

    @Override
    public void doA() {
        super.colleague1.selfFunc();
        super.colleague2.selfFunc();
    }
}
