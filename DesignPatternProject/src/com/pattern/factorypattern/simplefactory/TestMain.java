package com.pattern.factorypattern.simplefactory;

/**
 * Created by Administrator on 2017/7/17.
 */
public class TestMain {
    public static void main(String[] args) {
        Person person=PersonFactory.creatPerson(1);
        person.laught();
    }
}
