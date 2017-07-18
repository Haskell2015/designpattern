package com.pattern.builderpattern.nativebuilder;

/**
 * Created by Administrator on 2017/7/18.
 */
class Director {
    void command(Builder builder) {
        builder.makeFloor();
        builder.makeWindow();
    }
}
