package com.pattern.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override public Object invoke(Object o, Method method, Object[] objects)
        throws Throwable {
        Object result = method.invoke(obj, objects);
        return result;
    }
}
