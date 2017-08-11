package com.pattern.responsibilitypattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainTest {
    public static void main(String[] args) {

        Random random = new Random();
        List<IWomen> womenList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int j=random.nextInt(4);
            System.out.println(j);
            IWomen woman = new Woman(j, "出门");
            womenList.add(woman);
        }

        AbsHandler fa = new Father();
        AbsHandler hu = new Husband();
        AbsHandler son = new Son();

        fa.setNetxHandler(hu);
        hu.setNetxHandler(son);
        for (IWomen women : womenList) {
            fa.handlerMessage(women);
        }
    }
}
