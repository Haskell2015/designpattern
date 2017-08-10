package com.pattern.test.absfactory;

public class Main {
    public static void main(String[] args) {
        ColorFactory colorFactory = (ColorFactory) FactoryProducer.getFactory("COLOR");
        colorFactory.getColor("RED").fill();

        ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer.getFactory("SHAPE");
        shapeFactory.getShape("CIRCLE").draw();

        SizeFactory sizeFactory = (SizeFactory) FactoryProducer.getFactory("SIZE");
        sizeFactory.getSize("BIG").setSize();
    }
}
