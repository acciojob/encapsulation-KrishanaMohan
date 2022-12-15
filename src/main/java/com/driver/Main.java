package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // name.Myname="mohan"; //java: Myname has private access in com.driver.RWOnly

        obj.setName("Mohan");
        obj.getName();
    }
}
