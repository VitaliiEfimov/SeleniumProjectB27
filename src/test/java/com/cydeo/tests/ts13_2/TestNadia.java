package com.cydeo.tests.ts13_2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNadia {
    WebDriver driver;

    @BeforeMethod
    public void setUpClass() {
        driver = WebDriverFactory.getDriver1("chrome", 20);
        driver.get("https://qa2.vytrack.com/user/login");
    }

    @AfterMethod
    public void tearDownClass() {
        driver.quit();
    }

    @Test(description = "Verify access to the Oroinc Documentation page")
    public void OroincDocumentationPage() {
        WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput'] "));
        userName.sendKeys("user184");
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        userPassword.sendKeys("UserUser123");
        WebElement logInBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        logInBtn.click();

        WebElement FleetBtn = driver.findElement(By.xpath("(//div[@id='main-menu']//a[@class='unclickable'])[1]"));
        FleetBtn.click();

        WebElement VehicleBtn = driver.findElement(By.xpath("(//span[@class='title title-level-2'])"));
        VehicleBtn.click();

        WebElement treeDots = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]"));
        System.out.println("treeDots.getAttribute() = " + treeDots.getAttribute("data-toggle"));
//        treeDots.click();



    WebElement ViewBtn = driver.findElement(By.xpath("((//a[@class='dropdown-toggle'])[4]/../ul/li/ul/li/a)[1]"));
        System.out.println("ViewBtn.getAttribute(\"title\") = " + ViewBtn.getAttribute("title"));
        WebElement EditBtn = driver.findElement(By.xpath("((//a[@class='dropdown-toggle'])[4]/../ul/li/ul/li/a)[2]"));
        System.out.println("EditBtn.getAttribute(\"title\") = " + EditBtn.getAttribute("title"));
        WebElement DeleteBtn = driver.findElement(By.xpath("((//a[@class='dropdown-toggle'])[4]/../ul/li/ul/li/a)[3]"));
        System.out.println("DeleteBtn.getAttribute(\"title\") = " + DeleteBtn.getAttribute("title"));
        WebElement user = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
            user.click();
    WebElement logOut = driver.findElement(By.xpath("//a[@class='no-hash']"));
            logOut.click();
}}



