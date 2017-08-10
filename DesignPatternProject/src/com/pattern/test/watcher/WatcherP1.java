package com.pattern.test.watcher;

import java.util.Observable;
import java.util.Observer;

public class WatcherP1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Watcher1 发现" + arg.toString());
    }
}
