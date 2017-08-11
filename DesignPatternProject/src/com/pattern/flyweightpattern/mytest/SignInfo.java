package com.pattern.flyweightpattern.mytest;

public class SignInfo {
    private String name;
    private String address;
    private TestRel testRel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TestRel getTestRel() {
        return testRel;
    }

    public void setTestRel(TestRel testRel) {
        this.testRel = testRel;
    }
}
