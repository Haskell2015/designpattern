package com.pattern.factorypattern.factorymethod;

/**
 * Created by Administrator on 2017/7/17.
 */
public class TestMain {
    public static void main(String[] args) {
        CarFactory factory=new BMWCarFactory();
        factory.createCar().docar();

        CarFactory carFactory=new BuickCarFactory();
        carFactory.createCar().docar();

        CarFactory dfFac=new DongFengCarFactory();
        dfFac.createCar().docar();
    }
}
