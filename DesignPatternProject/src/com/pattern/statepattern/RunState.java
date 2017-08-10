package com.pattern.statepattern;

public class RunState extends AbsLiftState {
    @Override
    public void run() {
        System.out.println("电梯在运行");
    }

    @Override
    public void stop() {
        super.mContext.seTLiftState(Context.STOP_STATE);
        super.mContext.stop();
    }

    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void open() {
        // do nothing
    }
}
