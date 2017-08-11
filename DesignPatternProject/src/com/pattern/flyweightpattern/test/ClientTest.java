package com.pattern.flyweightpattern.test;

public class ClientTest {
    public static void main(String[] args) {
        System.out.println("开始初始化数据");
        for (int i = 0; i < 10; i++) {
            SignInfoFlyweightFactory.getSignInfo(Integer.toString(i));
        }
        System.out.println("初始化数据结束");
        System.out.println("开始测试查询");
        SignInfoFlyweightFactory.getSignInfo("4");
        SignInfoFlyweightFactory.getSignInfo("14");
        SignInfoFlyweightFactory.getSignInfo("1");
        SignInfoFlyweightFactory.getSignInfo("14");
        SignInfoFlyweightFactory.getSignInfo("2");
    }
}
