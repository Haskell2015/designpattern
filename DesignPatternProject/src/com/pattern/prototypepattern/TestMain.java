package com.pattern.prototypepattern;

/**
 * Created by Administrator on 2017/7/19.
 */
public class TestMain {
    public static void main(String[] args)
        throws CloneNotSupportedException {
        System.out.println("浅拷贝");
        Person person = new Person();
        Person person2 = (Person) person.clone();

        System.out.println(person.age == person2.age);
        System.out.println(person.name.equals(person2.name));
        System.out.println(person.array.equals(person2.array));// true
        System.out.println(person.entity.equals(person2.entity));// true
        System.out.println(person.deepEntity.equals(person2.deepEntity));//false

        System.out.println("深拷贝");
        User user = new User();
        User user2 = (User) user.clone();

        System.out.println(user.age == user2.age);
        System.out.println(user.name.equals(user2.name));
        System.out.println(user.array.equals(user2.array));// false
        System.out.println(user.entity.equals(user2.entity));// false
        System.out.println(user.deepEntity.equals(user2.deepEntity));//false
    }
}
