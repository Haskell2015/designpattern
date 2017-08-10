package com.pattern.test.builder.Native;

public class Main {
    public static void main(String[] args) {
        AndroidCoder coder=new AndroidCoder();
        Boss boss=new Boss();
        boss.cmd(coder);
        coder.getAPP();
    }
}
