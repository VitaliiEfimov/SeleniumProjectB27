package com.cydeo.tests.day3_locators_xpath.dayclass;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4GetTextCSSLocators {
    /*
                1- Open a chrome browser
                2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
                3- Verify “Reset password” button text is as expected:
                Expected: Reset password
     *///button[class='login-btn']

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPasswordBtn = driver.findElement(By.cssSelector("button[class='login-btn']"));//"button.login-btn"
        String expectedPasswordBtn = "Reset password";
        //String actualPasswordBtn = resetPasswordBtn.getAttribute("value");
        String actualPasswordBtn = resetPasswordBtn.getText();
        if(expectedPasswordBtn.contains(actualPasswordBtn)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }

        driver.quit();


    }
}
