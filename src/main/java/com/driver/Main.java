package com.driver;

public class Main {
  public static void main(String []args){
      RWOnly name= new RWOnly();

     // name.Myname="mohan"; //java: Myname has private access in com.driver.RWOnly

        name.setMyname("Mohan");
        System.out.println(name.getMyname());
  }
}