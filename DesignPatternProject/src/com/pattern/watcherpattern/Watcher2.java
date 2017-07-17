package com.pattern.watcherpattern;

import java.util.Observable;
import java.util.Observer;

/**
* 
 * Created by Administrator on 2017/7/14.
 */
public class Watcher2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(("Watcher2 发现" + arg.toString()));
    }
}
