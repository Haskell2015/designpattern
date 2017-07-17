package com.pattern.factorypattern.absfactory;

/**
 * Created by Administrator on 2017/7/17.
 */
public class FactoryProducer {
    public static AbsFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
