package com.pattern.test.factorymethod;

public class SCarFactory implements CarFactory {
    @Override
    public ICar creatCra() {
        return new SCar();
    }
}
