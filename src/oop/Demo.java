package com.htp.oop;

public class Demo {
    public static void main(String[] args) {
        TestClass testClass = new TestClass(); /*constructor invocation*/
        String s = testClass.someTestIntMethod("testString");
        System.out.println(s);
    }
}
