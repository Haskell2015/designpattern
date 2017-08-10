package com.pattern.test.factorymethod;

public class TCarFactory implements CarFactory{
    @Override
    public ICar creatCra() {
        return new TCar();
    }
}
