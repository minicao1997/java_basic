package com.cyf;

public class EnumColor {
    public static void main(String[] args) {
        for (NewColor2 newColor2:NewColor2.values()) {
            System.out.println(newColor2.ordinal()+"->"+newColor2.name()+"->"+newColor2.getColor());
        }
        System.out.println("添加一点信息！");

    }
}
