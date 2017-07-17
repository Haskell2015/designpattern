package com.pattern.factorypattern.factorymethod;

/**
 * Created by Administrator on 2017/7/17.
 */
public class BMWCar implements ICar {
    @Override
    public void docar() {
        System.out.println("我是BMW");
    }
}
