package com.pattern.test.builder.Native;

public class AndroidCoder implements ICoder {
    private APP app = new APP();

    @Override
    public void makeUI() {
        System.out.println("制作界面");
        app.setUi(new UI());
    }

    @Override
    public void makeBiz() {
        System.out.println("实现业务");
        app.setBiz(new Biz());
    }

    @Override
    public APP getAPP() {
        System.out.println("交付App");
        return app;
    }
}
