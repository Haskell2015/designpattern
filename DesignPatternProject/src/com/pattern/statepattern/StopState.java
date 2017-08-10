package com.pattern.statepattern;

public class StopState extends AbsLiftState {
    @Override
    public void run() {
        super.mContext.seTLiftState(Context.RUN_STATE);
        super.mContext.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }

    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void open() {
        super.mContext.seTLiftState(Context.OPEN_STATE);
        super.mContext.open();
    }
}
