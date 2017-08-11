package com.pattern.responsibilitypattern;

public class Husband extends AbsHandler {


    public Husband() {
        super(AbsHandler.HUSBAND_LEVER_REQUEST);
    }

    @Override
    protected void response(IWomen woman) {
        System.out.println("请求husband");
        System.out.println("请求的内容是:" + woman.getRequest());
    }
}
