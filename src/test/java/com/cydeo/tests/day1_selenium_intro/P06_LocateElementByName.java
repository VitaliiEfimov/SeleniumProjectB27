package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P06_LocateElementByName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //identify  and save the search box element
        WebElement searchBox = driver.findElement(By.name("q"));

        //enter text "selenium" and search for it
        searchBox.sendKeys("selenium" + Keys.ENTER);
Thread.sleep(5000);
        //close the browser

        driver.close();
    }
}
