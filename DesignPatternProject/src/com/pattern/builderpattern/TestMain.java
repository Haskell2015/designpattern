package com.pattern.builderpattern;

/**
 * Created by Administrator on 2017/7/18.
 */
public class TestMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Zhang", "小二").setAge(26).setPhone("10086").setAddress("XM").build();
        System.out.println(user);
    }
}
