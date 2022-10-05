package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

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
    public void setUpClass() {
        driver = WebDriverFactory.getDriver1("chrome", 10);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdown() throws InterruptedException {
//        2. Go to https://practice.cydeo.com/dropdown


//        3. Verify “Simple dropdown” default selected value is correct. Expected: “Please select an option”
        //select[@id='dropdown']
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));

        String actualSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSimpleDropdown = "Please select an option";
        Assert.assertEquals(actualSimpleDropdown, expectedSimpleDropdown);


//Thread.sleep(3000);
//        4. Verify “State selection” default selected value is correct. Expected: “Select a State”
        //select[@id='state']
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateSelection = simpleDropdown.getFirstSelectedOption().getText();
        String expectedStateSelection = "Please select an option";
        Assert.assertEquals(expectedStateSelection, actualStateSelection);


        //stateSelection.getOptions().iter + ENTER ===>>>
        // for (WebElement option : stateSelection.getOptions()) {}

        //extra
        int index = -1;
        for (WebElement eachState : stateSelection.getOptions()) {
            index++;
            if (eachState.getText().equals("California")) {
                System.out.println(index);
            }


        }


    }

    /*  1. Open Chrome browser
        2. Go to https://practice.cydeo.com/dropdown////select[@name='Languages']
        3. Select all the options from multiple select dropdown.
        4. Print out all selected values.
        5. Deselect all values.*/
    @Test
    public void selectMultiply() {
        Select selectMultiply = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        for (WebElement each : selectMultiply.getOptions()) {
            each.click();
            System.out.println("each.getText() = " + each.getText());
        }
        System.out.println("selectMultiply.getAllSelectedOptions() = " + selectMultiply.getAllSelectedOptions());
        List<WebElement> list = new ArrayList<>(selectMultiply.getAllSelectedOptions());

        selectMultiply.deselectAll();


    }

    @AfterClass
    public void tearDownClass() {
        driver.quit();
    }

}
