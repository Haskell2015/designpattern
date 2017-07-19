package com.pattern.prototypepattern;

/**
 * Created by Administrator on 2017/7/19.
 */
public class Entity implements Cloneable {
    @Override
    protected Object clone()
        throws CloneNotSupportedException {
        return super.clone();
    }
}
