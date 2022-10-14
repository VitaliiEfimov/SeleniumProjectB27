package com.cydeo.tests.ts13_2.recursion;

import java.util.Scanner;

public class Change {
    static  int count100, count50, count20, count10, count5, count1 ;

    public static void main(String[] args) {

        System.out.print("Enter the amount: ");
        Scanner scan = new Scanner(System.in);
        checkChange(scan.nextInt());

        System.out.println("count100 = " + count100);
        System.out.println("count50 = " + count50);
        System.out.println("count20 = " + count20);
        System.out.println("count10 = " + count10);
        System.out.println("count5 = " + count5);
        System.out.println("count1 = " + count1);
    }

    static int checkChange(double amount) {

        if (amount >= 100) {
            count100 ++;
            return checkChange(amount - 100);
        } else if (amount >= 50) {
            count50 ++;
            return checkChange(amount - 50);
        } else if (amount >= 20) {
            count20 ++;
            return checkChange(amount - 20);
        } else if (amount >= 10) {
            count10 ++;
            return checkChange(amount - 10);
        } else if (amount >= 5) {
            count5 ++;
            return checkChange(amount - 5);
        } else if (amount >= 1) {
            count1 ++;
            return checkChange(amount - 1);
        } else {
            return 0;
        }
    }

}
