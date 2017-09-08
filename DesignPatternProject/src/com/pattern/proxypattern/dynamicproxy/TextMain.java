package com.pattern.proxypattern.dynamicproxy;

import java.lang.reflect.Proxy;

public class TextMain {
    public static void main(String[] args) {
        ILawsuit xiaoMin = new XiaoMin();
        DynamicProxy proxy = new DynamicProxy(xiaoMin);
        ClassLoader classLoader = xiaoMin.getClass().getClassLoader();

        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[] {ILawsuit.class}, proxy);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
