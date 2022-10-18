package com.cydeo.tests.ts13_2.recursion;

public class Armstrong {

    public static void main(String[] args) {
        boolean isArmstrongNumber = isArmstrong(153);
        System.out.println("isArmstrongNumber = " + isArmstrongNumber);
        System.out.println("isArmstrong() = " + isArmstrong(1634));

        armstrongNumbers(153);
        armstrongNumbers(370);
        armstrongNumbers(372);
        armstrongNumbers(1000);
        armstrongNumbers(371);
    }

    public static boolean isArmstrong(int number) {
        //you can convert number to string and you can get the numbers with split and
        //you can use wrapper classes
        //last digit
        int lastDigit = number % 10; // 153%10=3
        //second digit
        int result = number / 10; //result=153/10=15
        int secondDigit = result % 10; //15%10=5
        //third digit
        int thirdDigit = number / 100; //153/100 = 1
        int total = (lastDigit * lastDigit * lastDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit);
        total = (int) (Math.pow(lastDigit, 3) + Math.pow(secondDigit, 3) + Math.pow(thirdDigit, 3));

        if (total == number)
            return true;
        else
            return false;
    }

    public static void armstrongNumbers(int number) {
        int a = number, b = number;
        int counter = 0;
        int sum = 0;
        int y = 1;
        int x = 0;

        do {
            counter++;
            a = a / 10;
        }while (a>0);
        System.out.println(counter);
        for (int i = 0; i < counter; i++) {
            x = number%10;
            for (int k = 0; k < counter; k++) {
                y=y*x;
            }
            sum+=y;
            y=1;
            number=number/10;
        }
        System.out.println(sum==b?b+" is Armstrong":b+" is NOT Armstrong");
    }
}
