package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    /*
            1- Open a chrome browser
            2- Go to: https://practice.cydeo.com/registration_form
            3- Verify header text is as expected:
              Expected: Registration form
            4- Locate “First name” input box
            5- Verify placeholder attribute’s value is as expected:
              Expected: first name
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement element = driver.findElement(By.tagName("h2"));
        String expected = "Registration form";
        String actual = element.getText();
        if (actual.equals(expected)){
            System.out.println("Test1 PASSED!");
        }else {
            System.out.println("Test1 FAILED!");
        }
        WebElement element1 = driver.findElement(By.name("firstname"));
        expected = "first name";
        actual = element1.getAttribute("placeholder");
        if (actual.equals(expected)){
            System.out.println("Test2 PASSED!");
        }else {
            System.out.println("Test2 FAILED!");
        }

        driver.close();
    }
}
