package com.pattern.factorypattern.absfactory;

/**
 * Created by Administrator on 2017/7/17.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画Rectangle");
    }
}
