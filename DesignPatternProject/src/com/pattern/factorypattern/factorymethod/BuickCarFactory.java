package com.pattern.factorypattern.factorymethod;

/**
 * Created by Administrator on 2017/7/17.
 */
public class BuickCarFactory implements CarFactory {
    @Override
    public ICar createCar() {
        return new BuickCar();
    }
}
