package com.pattern.test.absfactory;

import com.sun.istack.internal.NotNull;

public class FactoryProducer {
    public static AbsFactory getFactory(@NotNull String factoryType) {
        if (factoryType.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("SIZE")) {
            return new SizeFactory();
        }
        return null;
    }
}
