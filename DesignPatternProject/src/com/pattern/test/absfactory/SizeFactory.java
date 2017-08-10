package com.pattern.test.absfactory;

public class SizeFactory extends AbsFactory {
    @Override
    IColor getColor(String color) {
        return null;
    }

    @Override
    IShape getShape(String shape) {
        return null;
    }

    @Override
    ISize getSize(String size) {
        if(null==size){
            return null;
        }
        if(size.equalsIgnoreCase("BIG")){
            return new Big();
        }
        return null;
    }
}
