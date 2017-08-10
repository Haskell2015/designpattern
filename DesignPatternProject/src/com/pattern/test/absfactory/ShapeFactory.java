package com.pattern.test.absfactory;

public class ShapeFactory extends AbsFactory {

    @Override
    IColor getColor(String color) {
        return null;
    }

    @Override
    IShape getShape(String shape) {
        if (null == shape) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;
    }

    @Override
    ISize getSize(String size) {
        return null;
    }
}
