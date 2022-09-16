package com.cydeo.tests.day1_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePractice01 {
    /*
                        TC #1: Cydeo practice tool verifications
                    1. Open Chrome browser
                    2. Go to
                    https://practice.cydeo.com
                    3. Verify URL contains
                    Expected: cydeo
                    4. Verify title:
                    Expected: Practice
     */

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver","C:\\Users\\15717\\Desktop\\chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        String expected = "cydeo";
        String actual = driver.getCurrentUrl();

        if (actual.contains(expected)){
            System.out.println("URL contains PASSED!");
        }else {
            System.out.println("URL contains FAILED!");
        }
        expected = "Practices";
        actual = driver.getTitle();

        if (actual.equals(expected)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }

        driver.close();


    }
}
