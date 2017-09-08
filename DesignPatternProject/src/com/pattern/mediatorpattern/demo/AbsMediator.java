package com.pattern.mediatorpattern.demo;

public abstract class AbsMediator {
    protected Boss boss;
    protected StockMaster master;
    protected Stuff stuff;

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public StockMaster getMaster() {
        return master;
    }

    public void setMaster(StockMaster master) {
        this.master = master;
    }

    public Stuff getStuff() {
        return stuff;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }

    /**
     * 是否需要采购
     */
    public abstract void isNeedBuy();
}
