package com.wenbochao;

import com.pojo.Testone;

public class Connne {
    public static void main(String[] args) {
        Testone obj = new Testone();
        Testone obj1 = new Testone();
        obj.setAddr("dalian");
        obj1.setAddr("dalian");
        obj1.setSex("jkjkj");
        System.out.println(obj.equals(obj1));
    }
}
