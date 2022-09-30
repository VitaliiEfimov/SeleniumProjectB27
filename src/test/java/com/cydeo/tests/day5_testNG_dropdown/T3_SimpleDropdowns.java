package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class T3_SimpleDropdowns {
        /*
        . Open Chrome browser
        2. Go to https://practice.cydeo.com/dropdown
        3. Verify “Simple dropdown” default selected value is correct
        Expected: “Please select an option”
        4. Verify “State selection” default selected value is correct
        Expected: “Select a State”
        */
    WebDriver driver;
    @BeforeClass
    public void setUpClass(){
        driver = WebDriverFactory.getDriver1("chrome", 10);
    }

    @Test
    public void simpleDropdown() throws InterruptedException {
//        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");


//        3. Verify “Simple dropdown” default selected value is correct. Expected: “Please select an option”
        //select[@id='dropdown']
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));

        String actualSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSimpleDropdown = "Please select an option";
        Assert.assertEquals(actualSimpleDropdown,expectedSimpleDropdown);


//Thread.sleep(3000);
//        4. Verify “State selection” default selected value is correct. Expected: “Select a State”
        //select[@id='state']
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateSelection = simpleDropdown.getFirstSelectedOption().getText();
        String expectedStateSelection = "Please select an option";
        Assert.assertEquals(expectedStateSelection,actualStateSelection);


    }

    @AfterClass
    public void tearDownClass(){
        driver.quit();
    }

}
