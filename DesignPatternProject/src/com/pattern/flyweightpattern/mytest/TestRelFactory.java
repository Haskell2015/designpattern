package com.pattern.flyweightpattern.mytest;

import java.util.Hashtable;

public class TestRelFactory {
    private static Hashtable<String, AbsFlyweight> pool = new Hashtable<>();

    public static AbsFlyweight getTestRel(String key) {
        AbsFlyweight result = null;
        if (pool.containsKey(key)) {
            System.out.println("存在，直接返回");
            result = pool.get(key);
        } else {
            System.out.println("不存在，创建并存入池中");
            result = new TestRel(key);
            result.sign();
            pool.put(key, result);
        }
        return result;
    }

    public static void getCount() {
        System.out.println(pool.size());
    }
}
