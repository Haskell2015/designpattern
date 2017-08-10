package com.pattern.test;

import com.pattern.test.factorymethod.CarFactory;
import com.pattern.test.factorymethod.ICar;
import com.pattern.test.factorymethod.SCar;
import com.pattern.test.factorymethod.SCarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory sCarFac=new SCarFactory();
        sCarFac.creatCra().makeCar();
    }
}
