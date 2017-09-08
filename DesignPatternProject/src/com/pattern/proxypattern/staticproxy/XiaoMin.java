package com.pattern.proxypattern.staticproxy;

public class XiaoMin implements ILawsuit {
    @Override public void submit() {
        System.out.println("提交申请");
    }

    @Override public void burden() {
        System.out.println("举证");
    }

    @Override public void defend() {
        System.out.println("辩护");
    }

    @Override public void finish() {
        System.out.println("结束");
    }
}
