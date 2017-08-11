package com.pattern.flyweightpattern.mytest2;

public class TestMain {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            SignFactory.getSignInfo(((i + 1) * 3) % 4 + "").sign(new User("User" + i));
        }
        SignFactory.getCount();
    }
}
