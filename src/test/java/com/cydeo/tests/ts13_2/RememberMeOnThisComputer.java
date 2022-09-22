package com.cydeo.tests.ts13_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RememberMeOnThisComputer {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");
        WebElement remember = driver.findElement(By.tagName("label"));
        System.out.println(driver.findElement(By.tagName("label")).getText());
        System.out.println(driver.findElement(By.tagName("label")).getAttribute("for"));
        System.out.println(driver.findElement(By.tagName("label")).getTagName());
        System.out.println(driver.findElement(By.tagName("label")).getSize());
        System.out.println(driver.findElement(By.tagName("label")).getLocation());
        String expected = "Remember me on this computer";
        String actual = remember.getText();
        if (actual.equals(expected)) {
            System.out.println("Remember me on this computer: TEST PASSED");
        } else {
            System.out.println("Remember me on this computer: TEST FAILED");
        }
        driver.close();
    }
}
