package com.pattern.responsibilitypattern;

public class Father extends AbsHandler {

    public Father() {
        super(AbsHandler.FATHER_LEVER_REQUEST);
    }

    @Override
    protected void response(IWomen woman) {
        System.out.println("请求father");
        System.out.println("请求的内容是:" + woman.getRequest());
    }

    @Override
    public void setNetxHandler(AbsHandler next) {
        super.setNetxHandler(next);
    }
}
