package com.cyf;

public class EnumColor {
    public static void main(String[] args) {
        for (NewColor2 newColor2:NewColor2.values()) {
            System.out.println(newColor2.ordinal()+"->"+newColor2.name()+"->"+newColor2.getColor());
        }
        System.out.println("添加一点信息！");
        System.out.println("再添加一条代码试试");
        System.out.println("我在hot-fix分支中添加了一条消息");
        System.out.println("在master分支中添加了一条消息");
        System.out.println("我再添加一点信息");

    }
}
