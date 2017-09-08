package com.pattern.proxypattern.staticproxy;

public class TestMain {
    public static void main(String[] args) {
        ILawsuit xiaoMin=new XiaoMin();
        ILawsuit lawyer=new Lawyer((XiaoMin) xiaoMin);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
