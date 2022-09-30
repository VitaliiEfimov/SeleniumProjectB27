package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod//open for each @Test instead @BeforeClass runs only one time
    public void SetUpMethod() {
        driver = WebDriverFactory.getDriver1("chrome", 10);
    }

    @Test
    public void googleTitle() {
        //WebDriver driver = WebDriverFactory.getDriver1("chrome", 10);

        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching");
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}
