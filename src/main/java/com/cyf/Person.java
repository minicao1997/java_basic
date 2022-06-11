package com.cyf;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String talk() {
        return "我是" + name + "，我的年龄：" + age;
    }
}
