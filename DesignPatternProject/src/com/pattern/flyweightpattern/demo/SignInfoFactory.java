package com.pattern.flyweightpattern.demo;

import java.util.HashMap;

public class SignInfoFactory {
    // 池容器
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    public static SignInfo getSignInfo(String key) {
        // 设置返回对象
        SignInfo resule = null;
        // 池中没有该对象，则建立并放入池中
        if (!pool.containsKey(key)) {
            System.out.println(key + "不存在，建立并放入池中");
            resule = new SignInfo();
            pool.put(key, resule);
        } else {
            System.out.println(key + "存在，从池中获取");
            resule = pool.get(key);
        }
        return resule;
    }

    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }
}
