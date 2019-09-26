package com.htp.oop;

public class TestClass {
    /*class body*/
    /*class fields*/
    private int testInt;
    private long testLong;
    private String testString;
    private TestVariable testVar;
    private long[] testArray;

    public int testPublicInt;
    int testFriendlyInt; //friendly or package private

    private final int testIntConst = 10; //const
    private static final long TEST_COMPILE_CONST = 10L;

    /*Methods*/
    public String /*возвращаемый тип метода*/ someTestIntMethod(String s) {
        /*some logic*/
        return "Hello HTP\n" + "I am i Java programmer!\n" + s;
    }
}
