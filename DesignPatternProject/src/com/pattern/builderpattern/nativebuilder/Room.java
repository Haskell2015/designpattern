package com.pattern.builderpattern.nativebuilder;

/**
 * Created by Administrator on 2017/7/18.
 */
class Room {

    private Window window;
    private Floor floor;

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
