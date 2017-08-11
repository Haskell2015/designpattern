package com.pattern.flyweightpattern.test;

public abstract class AbsSignInfoFlyweight {
    protected  final String KEY;

    protected AbsSignInfoFlyweight(String key) {
        this.KEY = key;
    }
    public abstract  void doBiz();

}
