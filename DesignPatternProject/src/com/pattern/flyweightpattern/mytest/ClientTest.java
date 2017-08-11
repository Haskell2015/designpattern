package com.pattern.flyweightpattern.mytest;

public class ClientTest {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            SignInfo signInfo = new SignInfo();
            TestRel testRel = (TestRel) TestRelFactory.getTestRel("" + ((i + 1) * 7) % 5);
            signInfo.setTestRel(testRel);
            System.out.println(testRel.getSubject() + "_" + testRel.getLocation());
        }
        TestRelFactory.getCount();
    }
}
