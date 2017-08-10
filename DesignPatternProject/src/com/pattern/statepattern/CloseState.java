package com.pattern.statepattern;

public class CloseState extends AbsLiftState {
    @Override
    public void run() {
        super.mContext.seTLiftState(Context.RUN_STATE);
        super.mContext.run();
    }

    @Override
    public void stop() {
        super.mContext.seTLiftState(Context.STOP_STATE);
        super.mContext.stop();
    }

    @Override
    public void close() {
        System.out.println("电梯在关门");
    }

    @Override
    public void open() {
        super.mContext.seTLiftState(Context.OPEN_STATE);
        super.mContext.open();
    }
}
