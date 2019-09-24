package classwork;

import homework1.Homework;

public class lesson {


    public static void main(String[] args) {

        runtask1();
        runtask2();
        runtask3();
        runtask4();
        runtask5();
        runtask6();
        runtask7();
        runtask8();
        runtask9();
        runtask10();
        runtask11();
        runtask12();
        runtask13();
        runtask14();
        runtask15();
        runtask16();
        runtask17();
        runtask18();
        runtask19();
        runtask20();
    }

    private static void runtask20() {
        //Task 20. Write a Java program to convert an array to ArrayList.
    }

    private static void runtask19() {
        //Task 19. Write a Java program to add two matrices of the same size.

    }

    private static void runtask18() {
        //Task 18. Write a Java program to find the second smallest element in an array.

    }

    private static void runtask17() {
        //Task 17. Write a Java program to find the second largest element in an array.

    }

    private static void runtask16() {
        //Task 16. Write a Java program to remove duplicate elements from an array.

    }

    private static void runtask15() {
        //Task 15. Write a Java program to find the common elements between two arrays of integers.

    }

    private static void runtask14() {
        //Task 14. Write a Java program to find the common elements between two arrays (string values).

    }

    private static void runtask13() {
        //Task 13. Write a Java program to find the duplicate values of an array of string values.

    }

    private static void runtask12() {
        //Task 12. Write a Java program to find the duplicate values of an array of integer values.

    }

    private static void runtask11() {
        //Task 11. Write a Java program to reverse an array of integer values.

    }

    private static void runtask10() {
        //Task 10. Write a Java program to find the maximum and minimum value of an array.

    }

    private static void runtask9() {
        //Task 9.  Write a Java program to insert an element (specific position) into an array.

    }

    private static void runtask8() {
        //Task 8.  Write a Java program to copy an array by iterating the array.

    }

    private static void runtask7() {
        //Task 7.  Write a Java program to remove a specific element from an array.

    }

    private static void runtask6() {
        //Task 6.  Write a Java program to find the index of an array element.

    }

    private static void runtask5() {
        //Task 5.  Write a Java program to test if an array contains a specific value.

    }

    private static void runtask4() {
        //Task 4.  Write a Java program to calculate the average value of array elements.

    }

    private static void runtask3() {
        //Task 3. Write a Java program to print the following grid

    }

    private static void runtask2() {
        //Task 2. Write a Java program to sum values of an array.
        int[] array1 = {12, 22, -5, 32, 8, 0};
        int tmp = 0;
        for (int i = 0; i < array1.length; i++) {
            tmp += array1[i];
        }
        System.out.println("Сумма элементов массива "+Homework.printArrayString(array1)+" = "+tmp);


    }

    private static void runtask1() {

        //Сортировка пузырьком
        //Task 1. Write a Java program to sort a numeric array and a string array.
        int[] array1 = {12, 22, -5, 32, 8, 0};
        int tmp = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = (array1.length - 1); j >= (i + 1); j--) {
                if (array1[j] < array1[j - 1]) {
                    tmp = array1[j];
                    array1[j] = array1[j - 1];
                    array1[j - 1] = tmp;
                }
            }
        }
        System.out.println(Homework.printArrayString(array1));

        String[] arrayString = {"Аня", "Таня", "Паша", "Оля","Влад"};
        String tmpString = "";
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = (arrayString.length - 1); j >= (i + 1); j--) {
                if (arrayString[j].compareTo(arrayString[j - 1]) < 0) {
                    tmpString = arrayString[j];
                    arrayString[j] = arrayString[j - 1];
                    arrayString[j - 1] = tmpString;
                }
            }
        }
        System.out.println(Homework.printArrayString(arrayString));


    }
}
