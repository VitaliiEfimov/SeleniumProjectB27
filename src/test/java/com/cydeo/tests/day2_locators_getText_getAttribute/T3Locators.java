package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3Locators {
    /*
            1- Open a chrome browser
            2- Go to: https://google.com/
            3- Write “apple” in search box
            4- //Click google search button// use Keys.Enter to search
            5- Verify title:
            Expected: Title should start with “apple” word
     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("apple" + Keys.ENTER);

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title PASSED!");
        }else {
            System.out.println("Title FAILED!");
        }







    }
}
