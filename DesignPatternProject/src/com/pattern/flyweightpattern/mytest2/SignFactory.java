package com.pattern.flyweightpattern.mytest2;

import java.util.Hashtable;

public class SignFactory {
    private static Hashtable<String, AbsFlyweigth2> pool = new Hashtable<>();

    public static AbsFlyweigth2 getSignInfo(String key) {
        AbsFlyweigth2 result ;
        System.out.println(key);
        if (pool.containsKey(key)) {
            System.out.println("已经存在了");
            result = pool.get(key);
        } else {
            System.out.println("不存在");
            result = new SignInfo(key);
            pool.put(key, result);
        }
        return result;
    }

    public static void getCount() {
        System.out.println("info的实例有" + pool.size() + "个");
    }
}
