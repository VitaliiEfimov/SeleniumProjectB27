package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownPractice {
    /*1. Open Chrome browser
    2. Go to http://practice.cybertekschool.com/dropdown
    3. Select Illinois
    4. Select Virginia
    5. Select California
    6. Verify final selected option is California.
    Use all Select options. (visible text, value, index)*/

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver1("chrome", 10);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdownTask4() {
        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectState.selectByVisibleText("Illinois");
        selectState.selectByValue("VA");
        selectState.selectByIndex(5);
        String actualFinalOption = selectState.getFirstSelectedOption().getText();
        String expectedFinalOption = "Californias";
        Assert.assertEquals(actualFinalOption, expectedFinalOption, "Verification final selected option is FAILED");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
