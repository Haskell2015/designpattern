package com.pattern.test.absfactory;

public abstract class AbsFactory {
    abstract IColor getColor(String color);

    abstract IShape getShape(String shape);

    abstract ISize getSize(String size);
}
