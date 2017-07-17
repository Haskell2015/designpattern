package com.pattern.factorypattern.factorymethod;

/**
 * Created by Administrator on 2017/7/17.
 */
public class BMWCarFactory implements CarFactory {
    @Override
    public ICar createCar() {
        return new BMWCar();
    }
}
