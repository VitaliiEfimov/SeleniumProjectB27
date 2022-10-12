package com.cydeo.tests.ts13_2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
    }

    @AfterMethod
    public void tearDownMethod () {
        driver.quit();
    }

    @Test(dataProvider="credentials")
    public void test1(String name, String password) throws InterruptedException {

        WebElement loginBox = driver.findElement(By.xpath("//input[@name='_username']"));
        loginBox.click();
        loginBox.sendKeys(name);

        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.click();
        passwordBox.sendKeys(password);


        WebElement loginInBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginInBtn.click();
        Thread.sleep(2000);


        WebElement learnLink = driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
        Thread.sleep(2000);
        learnLink.click();

        WebElement howToUsePinbar = driver.findElement(By.xpath("//div//h3[.='How To Use Pinbar']"));
        System.out.println(howToUsePinbar.getText());

        WebElement longText = driver.findElement(By.xpath("//div//p[1]"));
        System.out.println(longText.getText());

        WebElement image = driver.findElement(By.xpath("//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']"));
        System.out.println(image.getAttribute("img"));
        String expectedSource ="/bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertTrue(image.getAttribute("src").contains(expectedSource));

        driver.quit();

    }

    @DataProvider(name="credentials")
    public Object[][] testData(){
        return new Object[][]{

                {"user19","UserUser123"},
                {"user20","UserUser123"},
                {"user21","UserUser123"},
                {"user22","UserUser123"},
                {"user23","UserUser123"},
                {"user24","UserUser123"},
                {"storemanager63","UserUser123"},
                {"storemanager64","UserUser123"},
                {"storemanager65","UserUser123"},
                {"storemanager66","UserUser123"},
                {"salesmanager113","UserUser123"},
                {"salesmanager114","UserUser123"},
                {"salesmanager115","UserUser123"},
                {"salesmanager116","UserUser123"},
        };
    }
}
