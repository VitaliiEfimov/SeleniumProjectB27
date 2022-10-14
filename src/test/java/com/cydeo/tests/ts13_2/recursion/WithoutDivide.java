package com.cydeo.tests.ts13_2.recursion;

public class WithoutDivide {
    /*  2) Numbers - Divide without / operator
            Write a method that can divide two numbers without using division operator

     */

    static int count = 0;

    public static void main(String[] args) {

        int number1 = -4;
        int number2 = 2;
        int reminder =  noDivide(number1, number2);

        if (reminder == -1) {
            System.out.println("Not legal to divide by 0");
        } else {
            System.out.println(number1 + " divide by " + number2 + " = " + count + " and " + reminder + " in reminder");
        }
    }

    public static int noDivide(int num1, int num2 ) {

        if (num2 == 0) {
            return -1;
        }
        // 1:      num1 = 9,  num2 = 2   --> count = 1
        if (num1 >= num2) {                                     // 2:             7          2               2
            count ++;                                           // 3:             5          2               3
            return noDivide(num1 - num2, num2);                 // 4:             3          2               4
        } else {                                                // 5:             1          2
            return num1;
        }
    }

}

