package com.pattern.flyweightpattern.test;

public class ContreteSignInfoFlyweight extends AbsSignInfoFlyweight {
    private String subject;
    private String location;
    private String key;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    protected ContreteSignInfoFlyweight(String key) {
        super(key);
    }

    @Override
    public void doBiz() {
    }
}
