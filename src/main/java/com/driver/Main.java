package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setVal(100);
        System.out.println(obj.getVal());
    }
}