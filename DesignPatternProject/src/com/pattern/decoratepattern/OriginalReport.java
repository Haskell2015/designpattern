package com.pattern.decoratepattern;

public class OriginalReport extends AbsSchoolReport {
    @Override
    void report() {
        System.out.println("尊敬的XXX家长");
        System.out.println("一下是成绩");
        System.out.println("~~~~~");
        System.out.println("~~~~~");
        System.out.println("请家长签名");
    }

    @Override
    void sign(String name) {
        System.out.println("家长的签名为:" + name);
    }
}
