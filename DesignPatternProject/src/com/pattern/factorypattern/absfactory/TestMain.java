package com.pattern.factorypattern.absfactory;

/**
 * Created by Administrator on 2017/7/17.
 */
public class TestMain {
    public static void main(String[] args) {
        AbsFactory factory = FactoryProducer.getFactory("SHAPE");
        factory.getShape("SQUARE").draw();

        AbsFactory absFactory = FactoryProducer.getFactory("COLOR");
        absFactory.getColor("Red").fill();
    }
}
