package com.pattern.watcherpattern;

/**
 * Created by Administrator on 2017/7/14.
 */
public class TestMain {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();

        Watcher1 watcher1 = new Watcher1();
        Watcher2 watcher2 = new Watcher2();
        Watcher3 watcher3 = new Watcher3();

        hanFeiZi.addObserver(watcher1);
        hanFeiZi.addObserver(watcher2);
        hanFeiZi.addObserver(watcher3);

        hanFeiZi.sing();
        hanFeiZi.dinner();
    }
}
