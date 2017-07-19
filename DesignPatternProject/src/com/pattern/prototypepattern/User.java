package com.pattern.prototypepattern;

/**
 * Created by Administrator on 2017/7/19.
 */
public class User implements Cloneable {
    public String name = "LiLy";
    public int age = 25;
    public int[]array={1,2,3};
    public Entity entity=new Entity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user;
        user= (User) super.clone();
        user.array=array.clone();
        user.entity= (Entity) entity.clone();//深拷贝
        return user;
    }
}
