package com.cydeo.tests.day7_windows_webtables;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_MultiplyWindows {
    /*
    1. Open a chrome browser
    2. Go to : https://practice.cydeo.com/windows
    3. Assert: Title is “Windows”
    4. Click to: “Click Here” link
    5. Click to: “CYDEO” link
    6. Switch to Cydeo page.
    7. Assert: Title is “Cydeo”
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // 1. Set up browser
        driver = WebDriverFactory.getDriver1("chrome",10);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_windows_test(){
        //    3. Assert: Title is “Windows”:
        // Assert.assertEquals(driver.getTitle(),"Windows");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle);

        //    4. Click to: “Click Here” link:
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        //    5. Click to: “CYDEO” link:
        WebElement cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        cydeoLink.click();

        //    6. Switch to Cydeo page:
        Set<String> allWindows = driver.getWindowHandles();
        for (String eachWindow : allWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            if (driver.getTitle().equals("Cydeo")){
                break;
            }
        }
        //    7. Assert: Title is “Cydeo”:
//        actualTitle = driver.getTitle();
//        expectedTitle = "Cydeo";
//        Assert.assertEquals(actualTitle,expectedTitle);

        Assert.assertEquals(driver.getTitle(), "Cydeo");


    }

    @AfterMethod
    public void tearDown(){
        //driver.close();
        driver.quit();
    }
}
