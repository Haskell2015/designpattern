package com.pattern.responsibilitypattern;

public class Son extends AbsHandler {
    public Son() {
        super(AbsHandler.SON_LEVER_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("请求son");
        System.out.println("请求的内容是:" + women.getRequest());
    }
}
