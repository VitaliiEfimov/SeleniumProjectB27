package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    /*1. Create a new class called: T5_WindowsPractice
    2. Create new test and make set ups
    3. Go to : https://practice.cydeo.com/windows
    4. Assert: Title is “Windows”
    5. Click to: “Click Here” link
    6. Switch to new Window.
    7. Assert: Title is “New Window”*/

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1. Set up browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void windowsTask(){

        //store main window
        String mainWindow = driver.getWindowHandle();

        //4. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        System.out.println("Before opening new window: " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Assert: Title is “Windows” - FAILED");

        //5. Click to: “Click Here” link////a[.='Click Here']
        WebElement clickHereBtn = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereBtn.click();

        actualTitle = driver.getTitle();
        System.out.println("After opening new window: " + actualTitle);


        //6. Switch to new Window.
        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
            System.out.println("eachWindow = " + eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }


        //7. Assert: Title is “New Window”

        actualTitle = driver.getTitle();
        String expectedTitleAfterClick = "New Window";

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);


        driver.switchTo().window(mainWindow);

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
