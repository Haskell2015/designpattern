package com.pattern.test.watcher;

public class Main {
    public static void main(String[] args) {
        PersonObservable personObservable = new PersonObservable();
        WatcherP1 watcherP1 = new WatcherP1();
        WatcherP2 watcherP2 = new WatcherP2();
        personObservable.addObserver(watcherP1);
        personObservable.addObserver(watcherP2);
        personObservable.sing();
        personObservable.play();
    }
}
