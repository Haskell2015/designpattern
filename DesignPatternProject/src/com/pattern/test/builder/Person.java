package com.pattern.test.builder;

public class Person {
    private String name;
    private String add;
    private int age;
    private int id;

    Person(PersonBuilder builder) {
        this.name = builder.name;
        this.add = builder.add;
        this.age = builder.age;
        this.id = builder.id;
    }

    private static class PersonBuilder {
        private String name;
        private String add;
        private int age;
        private int id;

        public PersonBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public PersonBuilder setAdd(String add) {
            this.add = add;
            return this;
        }

        public PersonBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
