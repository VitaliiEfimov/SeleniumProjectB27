package com.cydeo.tests.day10_javafaker_driver_util;

public class Singleton {
    //create private constructor
    private Singleton() {
    }

    // create private static String
    //prevent access and provide a getter method
    private static String word;

    //this utility method will return the "word" in the way we to return
    public static String getWord() {
        if (word == null) {
            System.out.println("First time call. Word == null" + "Assigning the value now");
            word = "something";
        }else{
            System.out.println("Word already has value");
        }
return word;
    }

}
