package com.pattern.flyweightpattern.nativeflyweight;

import java.util.HashMap;

public class FlyweightFactory {
    // 定义一个池容器
    private static HashMap<String, FlyWeight> pool = new HashMap<>();

    // 享元工厂
    public static FlyWeight getFlyweight(String extrinsic) {
        // 用于返回的对象
        FlyWeight flyWeight = null;
        if (!pool.containsKey(extrinsic)) {
            // 不存在，根据外部条件创建并放入池中
            flyWeight = new ConcreteFlyWeight(extrinsic);
            pool.put(extrinsic, flyWeight);
        } else {
            //存在则直接从池中获取
            flyWeight = pool.get(extrinsic);
        }
        return flyWeight;
    }
}
