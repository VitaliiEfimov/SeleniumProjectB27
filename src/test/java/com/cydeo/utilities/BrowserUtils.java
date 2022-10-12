package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {
    //Methods are static, because we don't want to create an object to call this method. Just by name.

    /**
     * This method is used to pass the code for given seconds
     * It is static method we can call with class name
     * BrowserUtils.sleep(3);
     *
     * @param seconds
     */
    public static void sleep(int seconds) {
        // 1 second = 1000 millis
        // millis = second * 1000

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }

    }

    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle
    public static void verifyTitle(WebDriver driver, String expectedTitle) {

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);



    }
}