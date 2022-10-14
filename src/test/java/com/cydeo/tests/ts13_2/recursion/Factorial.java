package com.cydeo.tests.ts13_2.recursion;

public class Factorial {

    public static void main(String[] args) {

    }

    public static int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        }else {
            return 1;
        }
    }


}
