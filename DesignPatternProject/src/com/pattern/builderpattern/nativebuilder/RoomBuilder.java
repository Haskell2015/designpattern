package com.pattern.builderpattern.nativebuilder;

/**
 * Created by Administrator on 2017/7/18.
 */
public class RoomBuilder implements Builder {
    private Room room = new Room();

    @Override
    public void makeWindow() {
        room.setWindow(new Window());
    }

    @Override
    public void makeFloor() {
        room.setFloor(new Floor());
    }

    @Override
    public Room getRoom() {
        return room;
    }
}
