package com.pattern.factorypattern.absfactory;

/**
 * Created by Administrator on 2017/7/17.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填充Green");
    }
}
