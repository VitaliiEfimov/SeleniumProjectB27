package com.cydeo.tests.day9_properties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Config_Practice extends TestBase {
    /*
                            1- Open a chrome browser
                            2- Go to: https://google.com/
                            3- Write “apple” in search box
                             4- Verify title:
                            Expected: apple - Google Search
     */

    @Test
    public void google_search_test_using_properties() {
        driver.get("https://google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);
//        BrowserUtils.verifyTitle(driver,"apple - Google Search");
        String actualTitle = driver.getTitle();
        String expectedTitle = "apple - Google Search";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void google_search_test_using_properties2() {
        driver.get(ConfigurationReader.getProperty("google.url"));
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);
//        BrowserUtils.verifyTitle(driver,"apple - Google Search");
        String actualTitle = driver.getTitle();
        String expectedTitle = ConfigurationReader.getProperty("search.keyword") + " - Google Search";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test
    public void google_search_test_using_properties3(){

//        2- Go to: https://google.com
        // driver.get("https://google.com");
        driver.get(ConfigurationReader.getProperty("google.url"));

//        3- Write “apple” in search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("search.keyword") + Keys.ENTER);

//        4- Verify title:
//        Expected: apple - Google Search
        String actualTitle = driver.getTitle();

        //  String expectedTitle = "apple" + " - Google Search";
        String expectedTitle = ConfigurationReader.getProperty("search.keyword") + " - Google Search";

        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
