package com.pattern.test.absfactory;

public class ColorFactory extends AbsFactory {


    @Override
    IColor getColor(String color) {
        if(null==color){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }
        return null;
    }

    @Override
    IShape getShape(String shape) {
        return null;
    }

    @Override
    ISize getSize(String size) {
        return null;
    }
}
