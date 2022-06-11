package com.cyf;

public class ObjectArray {

    public static void main(String[] args) {
        Person[] person = {new Person("张三",23),new Person("王麻子",26),new Person("李四",25)};

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].talk());
        }

    }
}
