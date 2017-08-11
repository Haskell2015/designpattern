package com.pattern.flyweightpattern.demo;

public class Client {
    public static void main(String[] args) {
        SignInfo signInfo = SignInfoFactory.getSignInfo();
        //初始化数据
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;
            for (int j = 0; j < 10; j++) {
                String key = subject + "地点" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        //获取数据
        SignInfoFactory.getSignInfo("科目2地点15");
    }
}
