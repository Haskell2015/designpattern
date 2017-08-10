package com.pattern.statepattern;

public abstract class AbsLiftState {
    protected Context mContext;

    public void setContext(Context context) {
        this.mContext = context;
    }

    public abstract void run();

    public abstract void stop();

    public abstract void close();

    public abstract void open();

}
