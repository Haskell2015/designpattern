package com.pattern.factorypattern.absfactory;

/**
 * Created by Administrator on 2017/7/17.
 */
public abstract class AbsFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
