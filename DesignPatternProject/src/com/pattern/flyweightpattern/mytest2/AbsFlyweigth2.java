package com.pattern.flyweightpattern.mytest2;

public abstract class AbsFlyweigth2 {
    protected final String TYPE;

    protected AbsFlyweigth2(String type) {
        TYPE = type;
    }

    abstract void sign(User user);
}
