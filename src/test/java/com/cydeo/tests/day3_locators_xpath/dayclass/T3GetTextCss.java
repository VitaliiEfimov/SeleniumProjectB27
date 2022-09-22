package com.cydeo.tests.day3_locators_xpath.dayclass;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3GetTextCss {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        /*
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/

        3- Verify “Log in” button text is as expected:
        Expected: Log In
         */

        driver.get("https://login1.nextbasecrm.com/");

//        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        //by attribute

        //Locate with using cddSelector by class attribute: with Syntax #2
//        WebElement logInBtn3 = driver.findElement(By.cssSelector("input.login-btn"));
//        WebElement logInBtn4 = driver.findElement(By.cssSelector("input[onclick=\"BX.addClass(this, 'wait');\"]"));
//        WebElement logInBtn5 = driver.findElement(By.cssSelector("input[type='submit']"));

        WebElement logInBtn2 = driver.findElement(By.cssSelector("input[class='login-btn']"));
        String expectedLoginBtnText = "Log In";
        String actualLoginBtnText = logInBtn2.getAttribute("value");
        if(expectedLoginBtnText.contains(actualLoginBtnText)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }

        driver.quit();


    }
}