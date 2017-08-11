package com.pattern.flyweightpattern.mytest;

public abstract class AbsFlyweight {
    protected final String KEY;

    protected AbsFlyweight(String key) {
        KEY = key;
    }

    public abstract void sign();
}
