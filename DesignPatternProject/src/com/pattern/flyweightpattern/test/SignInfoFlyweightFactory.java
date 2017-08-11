package com.pattern.flyweightpattern.test;

import java.util.HashMap;

public class SignInfoFlyweightFactory {
    private static HashMap<String, AbsSignInfoFlyweight> pool = new HashMap<>();

    public static AbsSignInfoFlyweight getSignInfo(String key) {
        AbsSignInfoFlyweight result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "不存在，新建并添加");
            result = new ContreteSignInfoFlyweight(key);
            pool.put(key, result);
        } else {
            System.out.println(key + "已经存在，从pool中获取");
            result = pool.get(key);
        }
        return result;
    }
}
