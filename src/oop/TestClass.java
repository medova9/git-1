package oop;

import java.util.Arrays;
import java.util.Objects;

public class TestClass {
    /*class body*/
    /*class fields*/
    public static final long TEST_COMPILE_CONST = 10L;
    public static final long TEST_COMPILE_CONST1 = 10L;

    public static int i = 0;
    private final int testIntConst = 10; //const

    private int testInt;
    private long testLong;
    private String testString; //null
    protected long[] testArray; //for extending
    public int testPublicInt;

    public TestClass() {
        System.out.println("Default Constructor");
    }

    public int getTestIntConst() {
        return testIntConst;
    }

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    public long getTestLong() {
        return testLong;
    }

    public void setTestLong(long testLong) {
        this.testLong = testLong;
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public long[] getTestArray() {
        return testArray;
    }

    public void setTestArray(long[] testArray) {
        this.testArray = testArray;
    }

    public int getTestPublicInt() {
        return testPublicInt;
    }

    public void setTestPublicInt(int testPublicInt) {
        this.testPublicInt = testPublicInt;
    }

    /*Methods*/
    public String /*возвращаемый тип метода*/ someTestIntMethod(String s) {
        /*some logic*/
        return "Hello HTP\n" + "I am i Java programmer!\n" + s;
    }

    public int testMethod() {
        methodWithSomeSecretLogic();
        return 10;
    }

    private void methodWithSomeSecretLogic(){
        System.out.println("in void method");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return testInt == testClass.testInt &&
                testLong == testClass.testLong &&
                testPublicInt == testClass.testPublicInt &&
                Objects.equals(testString, testClass.testString) &&
                Arrays.equals(testArray, testClass.testArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(testIntConst, testInt, testLong, testString, testPublicInt);
        result = 31 * result + Arrays.hashCode(testArray);
        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
