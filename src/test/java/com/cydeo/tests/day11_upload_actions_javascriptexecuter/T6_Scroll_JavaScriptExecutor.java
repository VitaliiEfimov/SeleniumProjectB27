package com.cydeo.tests.day11_upload_actions_javascriptexecuter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T6_Scroll_JavaScriptExecutor {
    /*
    1- Open a Chrome browser
    2- Go to: https://practice.cydeo.com/infinite_scroll
    3- Use below JavaScript method and scroll
    a. 750 pixels down 10 times.
    b. 750 pixels up 10 times
     */

    @Test
    public void scroll_javascriptExecuter_test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();//ChromeDriver driver = new ChromeDriver() don't need a reference
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/infinite_scroll");

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,750)");

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,750)");
        }

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,-750)");
        }






    }
}
