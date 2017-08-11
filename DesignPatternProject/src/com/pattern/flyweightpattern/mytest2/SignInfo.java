package com.pattern.flyweightpattern.mytest2;

public class SignInfo extends AbsFlyweigth2 {
    private String location;
    private String subject;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    protected SignInfo(String key) {
        super(key);
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
        } else {
            location = "USA";
            subject = "微积分";
        }
    }

    @Override
    public void sign(User user) {
        System.out.println(user.getName() + "选定了" + subject + "地点在" + location);
    }
}
