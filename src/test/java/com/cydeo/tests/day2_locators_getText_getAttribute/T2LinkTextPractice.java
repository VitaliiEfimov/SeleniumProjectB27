package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2LinkTextPractice {
    /*
    1- Open a chrome browser
            2- Go to: https://practice.cydeo.com/
            3- Click to A/B Testing from top of the list.
            4- Verify title is:
              Expected: No A/B Test
            5- Go back to home page by using the .back();
            6- Verify title equals:
              Expected: Practice
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get("https://practice.cydeo.com");
//        WebElement element = driver.findElement(By.partialLinkText("A/B Testing"));
//        element.click();
//        if (driver.getTitle().equals("No A/B Test")){
//            System.out.println("Test Verify1 title PASSED!");
//        }else{
//            System.out.println("Test Verify1 title FAILED!");
//        }
////        Thread.sleep(3000);
//        driver.navigate().back();
//        if (driver.getTitle().equals("Practice")){
//            System.out.println("Test Verify2 title PASSED!");
//        }else{
//            System.out.println("Test Verify2 title FAILED!");
//        }
//
//        driver.close();

        driver.get("https://practice.cydeo.com");
//      driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        String expectedTitle = "No A/B test";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("No A/B test PASSED!");
        }else {
            System.out.println("No A/B test FAILED");
        }
        driver.navigate().back();

        expectedTitle = "Practice";
        actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Practice test PASSED!");
        }else {
            System.out.println("Practice test FAILED");
        }

        driver.close();












    }
}
