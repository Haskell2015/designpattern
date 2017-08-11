package com.pattern.responsibilitypattern;

public abstract class AbsHandler {
    public static final int FATHER_LEVER_REQUEST = 1;
    public static final int HUSBAND_LEVER_REQUEST = 2;
    public static final int SON_LEVER_REQUEST = 3;

    private int level = 0;
    // 下一个处理者
    private AbsHandler nextHandler;

    public AbsHandler(int level) {
        this.level = level;
    }

    public final void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (null != nextHandler) {
                nextHandler.handlerMessage(women);
            } else {
                System.out.println("没人处理");
            }
        }
    }

    public void setNetxHandler(AbsHandler next) {
        this.nextHandler = next;
    }

    protected abstract void response(IWomen women);
}
