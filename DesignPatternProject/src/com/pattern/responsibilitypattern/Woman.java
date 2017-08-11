package com.pattern.responsibilitypattern;

public class Woman implements IWomen {
    /**
     * 1:从父
     * 2:从夫
     * 3:从子
     */
    private int type;
    private String request;

    public Woman(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
