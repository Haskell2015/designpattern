package com.pattern.flyweightpattern.mytest;

public class TestRel extends AbsFlyweight {
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

    protected TestRel(String key) {
        super(key);
        this.key = key;
    }

    @Override
    public void sign() {
        if ("1".equals(key)) {
            location = "China";
            subject = "数学";
        } else if ("2".equals(key)) {
            location = "China";
            subject = "语文";
        } else if ("3".equals(key)) {
            location = "China";
            subject = "化学";
        } else if ("4".equals(key)) {
            location = "China";
            subject = "物理";
        } else if ("5".equals(key)) {
            location = "China";
            subject = "生物";
        }else {
            location="USA";
            subject="微积分";
        }
    }
}
