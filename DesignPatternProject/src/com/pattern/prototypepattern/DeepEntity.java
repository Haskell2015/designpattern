package com.pattern.prototypepattern;

import java.io.*;

/**
 * Created by Administrator on 2017/7/19.
 */
public class DeepEntity implements Serializable {

    public transient int id = 100;

    public Object deepClone()
        throws IOException, ClassNotFoundException {
        // 写入对象
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        // 读取对象
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());

    }
}
