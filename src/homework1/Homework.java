package homework1;



public class Homework {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №1");

        //-------1-------
        System.out.println("1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести ");
        System.out.println("равна 16% от силы тяжести на Земле.");
        new Weight(49);
        System.out.println("--РЕЗУЛЬТАТ--");
        System.out.println("Вес " + Weight.myWeight + " кг. на Земле равен " + Weight.weightOnMoon + " кг. на луне");

        //-------2-------
        System.out.println("2. Напишите метод, который будет увеличивать каждый элемент массива на 10%.");
        double[] myArray = {3, 14, 22.3, -67};
        int myPercent = 10;
        System.out.println("--РЕЗУЛЬТАТ--");
        System.out.println("При увеличении каждого элемента массива " + arrayStr(myArray) + " на " + myPercent + "%");
        increaseEachArrayEl(myArray, myPercent);
        System.out.println("получается массив " + arrayStr(myArray));

        //-------3-------
        System.out.println("3. Напишите метод, который будет проверять является ли число палиндромом (одинаково ");
        System.out.println("читающееся в обоих направлениях).");
        int number = 155585551;
        System.out.println("--РЕЗУЛЬТАТ--");
        System.out.println("Число " + number + " палиндром - " + isPalindrome(number));

        //-------4-------
        System.out.println("4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)");
        System.out.println("--РЕЗУЛЬТАТ--");
        int startOfInterval = 1;
        int endOfInterval = 100;
        int evenCheck = 0;
        printEvenNumbers(startOfInterval, endOfInterval, evenCheck);

        //-------5-------
        System.out.println("5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)");
        System.out.println("--РЕЗУЛЬТАТ--");
        startOfInterval = 1;
        endOfInterval = 15;
        evenCheck = 1;
        printEvenNumbers(startOfInterval, endOfInterval, evenCheck);

        //-------6-------
        System.out.println("6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления ");
        System.out.println("(используя только цикл for)");
        System.out.println("--РЕЗУЛЬТАТ--");
        startOfInterval = 1;
        endOfInterval = 100;
        printEvenNumbersTo100(startOfInterval, endOfInterval);

        //-------7-------
        int resultSum = 0;
        System.out.println("7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)");
        startOfInterval = 20;
        endOfInterval = 200;
        for (int i = startOfInterval; i <= endOfInterval; i++) {
            resultSum += i;
        }
        System.out.println("--РЕЗУЛЬТАТ--");
        System.out.println(resultSum);

        //-------8-------
        System.out.println("8. Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому ");
        System.out.println("числу (используя цикл и оператор if else)");
        System.out.println("--РЕЗУЛЬТАТ--");
        startOfInterval = 1;
        endOfInterval = 12;
        String month = "";
        for (int i = startOfInterval; i <= endOfInterval; i++) {
            if (i == 1) {
                month = "январь";
            } else if (i == 2) {
                month = "февраль";
            } else if (i == 3) {
                month = "март";
            } else if (i == 4) {
                month = "апрель";
            } else if (i == 5) {
                month = "май";
            } else if (i == 6) {
                month = "июнь";
            } else if (i == 7) {
                month = "июль";
            } else if (i == 8) {
                month = "август";
            } else if (i == 9) {
                month = "сентябрь";
            } else if (i == 10) {
                month = "октябрь";
            } else if (i == 11) {
                month = "ноябрь";
            } else {
                month = "декабрь";
            }
            System.out.println(i + " месяц " + month);
        }

        //-------9-------
        System.out.println("9 Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы ");
        System.out.println("значение первой оказалось во второй, а второй - в первой.");
        int firstNum = 1;
        int secondNum = 2;
        System.out.println("firstNum = " + firstNum + ", " + "secondNum = " + secondNum);
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println("ВЖУХ!");
        System.out.println("firstNum = " + firstNum + ", " + "secondNum = " + secondNum);

        //-------10-------
        System.out.println("10. Напишите программу с тремя переменными целого типа, первым двум присвойте значения, ");
        System.out.println("а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.");
        int num1 = 1;
        int num2 = 2;
        int num3;
        num3 = sumNums(num1, num2);
        System.out.println("--РЕЗУЛЬТАТ--");
        System.out.println(num1 + "+" + num2 + "=" + num3);

        //-------11-------
        System.out.println("11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.");
        num1 = 13;
        num2 = -3;
        num3 = 5;
        System.out.println("--РЕЗУЛЬТАТ--");
        System.out.println("Наибольшее число из " + num1 + ", " + num2 + " и " + num3 + " это "
                + maxNum(num1, num2, num3));

        //-------12-------
        System.out.println("12. Напишите программу, в которой используются две переменные логического типа (boolean),");
        System.out.println("присвойте им значения и выведете для каждой переменной на экран строку \"истина\", если ");
        System.out.println("переменная имеет значение true и \"ложь\", если переменная имеет значение false.");
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("--РЕЗУЛЬТАТ--");
        System.out.println("В первой переменной " + trueOrFalseName(bool1)
                + ", во второй " + trueOrFalseName(bool2));

        //-------13-------
        String str1;
        String str2;
        String str3;
        str1 = "13. Напишите программу, где двум строковым переменным присваиваются значения, третей же ";
        str2 = "строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк. Затем " +
                "напечатайте значение третьей строковой переменной.";
        str3 = str1 + str2;
        System.out.println(str3);

        //-------14-------
        System.out.println("14. Создайте программу с двумя переменными целого типа, присвойте им значения, если первая");
        System.out.println("переменная больше второй, то увеличьте её значение на 3, иначе увеличьте значение второй ");
        System.out.println("переменной на 8. В конце программы выведите значения обоих чисел на экран.");
        num1 = 13;
        num2 = -3;
        System.out.println("Первая переменная = " + num1);
        System.out.println("Вторая переменная = " + num2);
        if (num1 > num2) {
            num1 = num1 + 3;
        } else {
            num2 += 8;
        }
        System.out.println("--ВЖУХ--");
        System.out.println("Первая переменная = " + num1);
        System.out.println("Вторая переменная = " + num2);

        //-------15-------
        System.out.println("Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной ");
        System.out.println("программе): for while do while");
        System.out.println("for");
        printHundred("for");
        System.out.println("while");
        printHundred("while");
        System.out.println("do while");
        printHundred("do while");

        //-------16-------
        System.out.println("16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, ");
        System.out.println("если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35. ");
        System.out.println("Минимум, максимум и шаг указываются пользователем (можно захардкодить).");
        printSeriesOfNumbers(-10, 35, 5);


        //-------17-------
        System.out.println("17. Все элементы массива поделить на значение наибольшего элемента этого массива.");
        double[] myArray1 = {3, 14, 22.3, -67};
        System.out.println("--РЕЗУЛЬТАТ--");
        System.out.println("При делении каждого элемента массива " + arrayStr(myArray1) + " на максимальный элемент ");
        decreaseEachArrayEl(myArray1);
        System.out.println("получается массив " + arrayStr(myArray1));

        //-------18-------
        System.out.println("18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов ");
        System.out.println("укажите кол-во рублей и курс.");
        double sumUSD;
        double rateUSD = 2.0698;
        double sumBYN = 500;
        sumUSD = conversionToBYN(sumBYN, rateUSD);
        System.out.println((int) sumBYN + " белорусских рублей это " + (int) sumUSD + " $");

        //-------Advanced Level-------
        //-------2-------
        System.out.println("2. Напишите программу, которая будет считать количество часов, минут и секунд в n-ном ");
        System.out.println("количестве суток.");
        int days = 15;
        DaysCounter daysCounter = new DaysCounter(days);

        System.out.println("В " + days + " днях "
                + daysCounter.getHours() + " часов "
                + daysCounter.getMinutes() + " минут "
                + daysCounter.getSeconds() + " секунд.");

    }

    private static double conversionToBYN(double sum, double rate) {
        double result;
        result = sum / rate;
        return result;
    }

    private static void printSeriesOfNumbers(int startOfInterval, int endOfInterval, int step) {
        String outStr = "";
        for (int i = startOfInterval; i <= endOfInterval; i += step) {
            // натуральные числа начинаются с 1
            if (i > 0) {
                outStr += i + " ";
            }
            if (outStr.length() > 80) {
                System.out.println(outStr);
                outStr = "";
            }
        }
        System.out.println(outStr);

    }

    private static void printHundred(String cycleType) {
        String outStr = "";
        int i;
        switch (cycleType) {
            case "for":
                for (i = 1; i <= 100; i++) {
                    outStr = outStr + i + ", ";
                    if (outStr.length() > 80) {
                        System.out.println(outStr);
                        outStr = "";
                    }
                }
                System.out.println(outStr);
                break;
            case "while":
                i = 1;
                while (i <= 100) {
                    outStr = outStr + i + ", ";
                    if (outStr.length() > 80) {
                        System.out.println(outStr);
                        outStr = "";
                    }
                    i++;
                }
                System.out.println(outStr);
                break;
            case "do while":
                i = 1;
                do {
                    outStr = outStr + i + ", ";
                    if (outStr.length() > 80) {
                        System.out.println(outStr);
                        outStr = "";
                    }
                    i++;
                } while (i <= 100);
                System.out.println(outStr);
                break;
            default:
                System.out.println("Неверный оператор " + cycleType);
        }
    }


    private static void increaseEachArrayEl(double[] array, int incPercent) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * (1 + (double) incPercent / 100);
        }
    }

    private static String arrayStr(double[] array) {
        String str = "{ ";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i] + (i + 1 < array.length ? ", " : " }");
        }
        return str;
    }

    private static Boolean isPalindrome(int checkedNumber) {
        int resultNumber = 0;
        int bufferNumber = checkedNumber;
        Boolean result;
        int i = 1;

        while (bufferNumber != 0) {
            i++;
            resultNumber = resultNumber * 10 + (bufferNumber % 10);
            bufferNumber /= 10;
        }
        result = (checkedNumber == resultNumber ? Boolean.TRUE : Boolean.FALSE);
        return result;
    }

    //evenCheck 1 - нечетный, 0 - четный
    private static void printEvenNumbers(int startOfInterval, int endOfInterval, int evenCheck) {
        String outStr = "";
        if (startOfInterval > endOfInterval) {
            System.out.println("Неверный интервал! Задайте правильный. Второе число должно быть больше первого.");
        } else {
            for (int i = startOfInterval; i <= endOfInterval; i++) {
                if (i % 2 == evenCheck) {
                    outStr = outStr + i + ", ";
                }
                if (outStr.length() > 80) {
                    System.out.println(outStr);
                    outStr = "";
                }
            }
            System.out.println(outStr);
        }
    }

    private static void printEvenNumbersTo100(int startOfInterval, int endOfInterval) {
        String outStr = "";
        if (startOfInterval > endOfInterval) {
            System.out.println("Неверный интервал! Задайте правильный. Второе число должно быть больше первого.");
        } else {
            for (int i = startOfInterval; i <= endOfInterval; i += 2) {
                outStr = outStr + (i + 1) + ", ";

                if (outStr.length() > 80) {
                    System.out.println(outStr);
                    outStr = "";
                }
            }
            System.out.println(outStr);
        }
    }

    private static int sumNums(int num1, int num2) {
        return num1 + num2;
    }

    private static int maxNum(int num1, int num2, int num3) {
        if (num1 < num2) {
            num1 = num2;
        }
        if (num1 < num3) {
            num1 = num3;
        }
        return num1;
    }

    private static String trueOrFalseName(boolean param) {
        String result;
        result = (param ? "истина" : "ложь");
        return result;
    }

    private static void decreaseEachArrayEl(double[] array) {
        double maxEl = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxEl < array[i]) {
                maxEl = array[i];
            }
        }
        System.out.println("maxEl = " + maxEl);
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] / maxEl;
        }

    }


}