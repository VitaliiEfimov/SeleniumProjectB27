package com.cydeo.tests.day8_webtable_utilities;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_WebTable_Practice extends TestBase {
    /*
    1. Go to: https://practice.cydeo.com/web-tables
    2. Verify Bob’s name is listed as expected.
    Expected: “Bob Martin”
    3. Verify Bob Martin’s order date is as expected
    Expected: 12/31/2021
     */

//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        driver = WebDriverFactory.getDriver1("chrome", 10);
//        driver.get("https://practice.cydeo.com/web-tables");
//    }
//
//    @AfterMethod
//    public void tearDownClass() {
//        driver.quit();
//    }

    @Test
    public void order_name_verify_test() {

        WebElement bobMartinName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String expectedName = "Bob Martin";
        String actualName = bobMartinName.getText();

        Assert.assertEquals(actualName,expectedName,"bobMartinName is PASSED!");

        WebElement bobMartinDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        Assert.assertEquals(bobMartinDate.getText(),"12/31/2021", "\"bobMartinDate is PASSED!\"");
        BrowserUtils.verifyTitle(driver, "Web Tables");



    }
    @Test
    public void test2() {
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        BrowserUtils.sleep(5);
        System.out.println("customerOrderDate1 = " + customerOrderDate1);
    }
    @Test
    public void test3() {
        WebTableUtils.orderVerify(driver, "Ned Stark", "05/12/2021");
    }
}
