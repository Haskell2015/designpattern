package com.pattern.statepattern;

public class Context {
    public static final AbsLiftState RUN_STATE = new RunState();
    public static final AbsLiftState STOP_STATE = new StopState();
    public static final AbsLiftState OPEN_STATE = new OpenState();
    public static final AbsLiftState CLOSE_STATE = new CloseState();
    private AbsLiftState mLiftState;

    public void seTLiftState(AbsLiftState state) {
        this.mLiftState = state;
        this.mLiftState.setContext(this);// 状态转移
    }

    public AbsLiftState getLiftState() {
        return this.mLiftState;
    }

    public void run() {
        this.mLiftState.run();
    }

    public void stop() {
        this.mLiftState.stop();
    }

    public void close() {
        this.mLiftState.close();
    }

    public void open() {
        this.mLiftState.open();
    }
}
