package com.pattern.prototypepattern;

/**声明一个克隆自身的接口<br></br>
 * Created by Administrator on 2017/7/19.
 */
public class Prototype implements Cloneable {
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();// 这仅仅是浅拷贝，如果有非一般数据类型，还需要单独进行深拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
