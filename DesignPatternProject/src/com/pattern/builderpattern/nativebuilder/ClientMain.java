package com.pattern.builderpattern.nativebuilder;

/**
 * Created by Administrator on 2017/7/18.
 */
public class ClientMain {
    public static void main(String[] args) {
        // need a worker
        RoomBuilder roomBuilder = new RoomBuilder();
        // need a director
        Director director = new Director();
        // director cmd worker to make a room
        director.command(roomBuilder);
        // worker deliver the room
        Room room = roomBuilder.getRoom();
    }
}
