package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {

    public static void main(String[] args) {
//TC #1:  Cydeo Title Verification
//1. Open Chrome browser
//2. Go to https://www.cydeo.com
//3. Verify title:
//Expected: Cydeo

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.cydeo.com
        driver.get("https://www.cydeo.com");
        //3. Verify title:
        String expectedTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is Passed!");
        }else {
            System.out.println("Title verification is Failed!");
        }

        driver.close();
    }
}
