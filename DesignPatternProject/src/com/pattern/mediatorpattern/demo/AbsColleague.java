package com.pattern.mediatorpattern.demo;

public abstract class AbsColleague {
    protected AbsMediator absMediator;

    public AbsColleague(AbsMediator absMediator) {
        this.absMediator = absMediator;
    }
}
