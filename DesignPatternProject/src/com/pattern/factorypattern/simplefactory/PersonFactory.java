package com.pattern.factorypattern.simplefactory;

/**
 * Created by Administrator on 2017/7/17.
 */
public class PersonFactory {
    public static Person creatPerson(int type) {
        switch (type) {
            case 1: {
                return new ChinesePerson();
            }
            case 2: {
                return new USAPerson();
            }
            default:
                return null;
        }
    }
}
