package com.cydeo.tests.base;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver1("chrome", 10);}

    @AfterMethod
    public void tearDownClass() {
        driver.quit();
    }
}
