package com.pattern.prototypepattern;

import java.io.IOException;

/**
 * Created by Administrator on 2017/7/19.
 */
public class User implements Cloneable {
    public String name = "LiLy";
    public int age = 25;
    public int[] array = {1, 2, 3};
    public Entity entity = new Entity();
    public DeepEntity deepEntity = new DeepEntity();

    @Override
    protected Object clone()
        throws CloneNotSupportedException {
        User user;
        user = (User) super.clone();
        user.array = array.clone();
        user.entity = (Entity) entity.clone();// 深拷贝
        try {
            user.deepEntity= (DeepEntity) deepEntity.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
