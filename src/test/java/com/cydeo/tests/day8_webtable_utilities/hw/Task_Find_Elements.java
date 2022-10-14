package com.cydeo.tests.day8_webtable_utilities.hw;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Task_Find_Elements {

    /*
            TC #1: Checking the number of links on the page
            1. Open Chrome browser
            2. Go to https://www.openxcell.com
            3. Count the number of the links on the page and verify
            Expected: 332

            TC #2: Printing out the texts of the links on the page
            1. Open Chrome browser
            2. Go to https://www.openxcell.com
            3. Print out all of the texts of the links on the page

            TC #3: Counting the number of links that does not have text
            1. Open Chrome browser
            2. Go to https://www.openxcell.com
            3. Count the number of links that does not have text and verify
            Expected: 109
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver1("chrome", 10);
        driver.get("https://www.openxcell.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1, description = "Checking the number of links on the page + Counting the number of links that does not have text")
    public void checkingNumberOfLinks() {
        List<WebElement> checkingNumberOfLinks = driver.findElements(By.xpath("//a[contains(@href,'https')]"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(checkingNumberOfLinks.size(), 332, "Checking the number of links on the page");
        softAssert.assertAll();
    }

    @Test(priority = 2, description = "Printing out the texts of the links on the page")
    public void PrintingTextsOfTheLinks() {
        List<WebElement> checkingNumberOfLinks = driver.findElements(By.xpath("//a[contains(@href,'https')]"));
        int count = 0;
        for (WebElement each : checkingNumberOfLinks) {

            if (!each.getText().isEmpty()) {
                System.out.println(each.getText());
            } else {
                count++;
            }
        }

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(count, 109);
        softAssert.assertAll();
    }

}