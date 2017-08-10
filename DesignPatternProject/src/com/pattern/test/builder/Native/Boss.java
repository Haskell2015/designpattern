package com.pattern.test.builder.Native;

public class Boss {
    void cmd(ICoder coder){
        coder.makeUI();
        coder.makeBiz();
    }
}
