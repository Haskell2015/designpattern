package com.pattern.mediatorpattern;

public class ConcreteColleague2 extends AbsColleague {
    public ConcreteColleague2(AbsMediator absMediator) {
        super(absMediator);
    }


    public void selfFunc(){
        System.out.println("2自己能处理");
    }
}
