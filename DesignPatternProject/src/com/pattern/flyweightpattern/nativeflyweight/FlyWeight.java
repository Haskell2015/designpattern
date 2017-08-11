package com.pattern.flyweightpattern.nativeflyweight;

public abstract class FlyWeight {
    // 内部状态
    private String intrinsic;
    // 外部状态
    protected final String EXTRINSIC;// final

    // 享元角色必须接受外部的状态
    protected FlyWeight(String extrinsic) {
        this.EXTRINSIC = extrinsic;
    }

    // 业务操作
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
