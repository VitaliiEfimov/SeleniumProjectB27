package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_LocatorsPractice1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://app.vytrack.com/user/login");

        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("abcd");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        WebElement alert = driver.findElement(By.className("alert"));
        if (alert.getText().equals("Invalid user name or password.")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("vytrack")){
            System.out.println("URL PASSED");
        }else {
            System.out.println("URL FAILED");
        }
        //WebElement forgot = driver.findElement(By.partialLinkText("Forgot your password?"));
        // forgot.click();
        driver.findElement(By.partialLinkText("Forgot your password?")).click();
        if (driver.getTitle().equals("Forgot Password")){
            System.out.println("Title PASSED");
        }else {
            System.out.println("Title FAILED");
        }
        driver.close();



    }
}
