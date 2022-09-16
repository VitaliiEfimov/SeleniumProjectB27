package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_LocateElementById {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //identify "I'm Feeling Lucky" element and save the element

        WebElement luckyText = driver.findElement(By.id("gbqfbb"));
        //find value of attribute
        String text = luckyText.getAttribute("value");

        //verify if value is "I'm Feeling Lucky"
        if (text.equals("I'm Feeling Lucky")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test Failed");
        }




    }
}
