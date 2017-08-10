package com.pattern.test.watcher;

import java.util.Observable;
import java.util.Observer;

public class PersonObservable extends Observable {
    public void sing(){
        super.setChanged();
        super.notifyObservers("在sing");
    }
    public void play(){
        super.setChanged();
        super.notifyObservers("在play");
    }

}
