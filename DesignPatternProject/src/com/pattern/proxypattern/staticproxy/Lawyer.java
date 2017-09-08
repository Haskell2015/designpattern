package com.pattern.proxypattern.staticproxy;

public class Lawyer implements ILawsuit {
    private XiaoMin mXiaoMin;

    public Lawyer(XiaoMin mXiaoMin) {
        this.mXiaoMin = mXiaoMin;
    }

    @Override public void submit() {
        mXiaoMin.submit();
    }

    @Override public void burden() {
        mXiaoMin.burden();
    }

    @Override public void defend() {
        mXiaoMin.defend();
    }

    @Override public void finish() {
        mXiaoMin.finish();
    }
}

