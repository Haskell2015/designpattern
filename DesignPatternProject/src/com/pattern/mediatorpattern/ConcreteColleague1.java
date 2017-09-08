package com.pattern.mediatorpattern;

public class ConcreteColleague1 extends AbsColleague {
    public ConcreteColleague1(AbsMediator absMediator) {
        super(absMediator);
    }

    public void A2B(String str){
        super.absMediator.doA();
    }
    public void selfFunc(){
        System.out.println("1自己能处理");
    }
}
