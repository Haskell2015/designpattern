package com.pattern.mediatorpattern;

public abstract class AbsColleague {
    protected AbsMediator absMediator;

    public AbsColleague(AbsMediator absMediator) {
        this.absMediator = absMediator;
    }
}
