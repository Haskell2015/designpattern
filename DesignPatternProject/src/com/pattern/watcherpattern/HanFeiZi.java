package com.pattern.watcherpattern;

import java.util.Observable;

/**
 * Created by Administrator on 2017/7/14.
 */
public class HanFeiZi extends Observable {
    public void sing() {
        System.out.println("HanFeiZi 开始sing");
        super.setChanged();
        super.notifyObservers("HanFeiZi 在sing");
    }

    public void dinner() {
        System.out.println("HanFeiZi 开始dinner");
        super.setChanged();
        super.notifyObservers("HanFeiZi 在dinner");
    }
}
