package com.pattern.statepattern;

public class OpenState extends AbsLiftState {
    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void close() {
        super.mContext.seTLiftState(Context.CLOSE_STATE);
        super.mContext.close();
    }

    @Override
    public void open() {
        System.out.println("电梯打开了");
    }
}
