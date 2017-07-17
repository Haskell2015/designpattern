package com.pattern.factorypattern.factorymethod;

/**
 * Created by Administrator on 2017/7/17.
 */
public class BuickCar implements ICar {
    @Override
    public void docar() {
        System.out.println("我是Buick");
    }
}
