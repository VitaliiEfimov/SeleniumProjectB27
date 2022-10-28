package com.cydeo.tests.day13_;

import com.cydeo.pages.DynamicallyLoadedPage_1;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicallyLoadedPageElement {
    /*
    TC#5 : Dynamically Loaded Page Elements 1
    1. Go to https://practice.cydeo.com/dynamic_loading/1
    2. Click to start
    3. Wait until loading bar disappears
    4. Assert username inputbox is displayed
    5. Enter username: tomsmith
    6. Enter password: incorrectpassword
    7. Click to Submit button
    8. Assert “Your password is invalid!” text is displayed.
     */

    @Test
    public void dynamically_Loaded_Page_Elements_1(){
//        1. Go to https://practice.cydeo.com/dynamic_loading/1

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

//    2. Click to start

        DynamicallyLoadedPage_1 dynamicallyLoadedPage_1 = new DynamicallyLoadedPage_1();
        dynamicallyLoadedPage_1.startBtn.click();

//    3. Wait until loading bar disappears

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage_1.loadingBar));
        BrowserUtils.waitForInvisibilityOf(dynamicallyLoadedPage_1.loadingBar,10);

//    4. Assert username inputbox is displayed

        Assert.assertTrue(dynamicallyLoadedPage_1.inputbox.isDisplayed());

//    5. Enter username: tomsmith

        dynamicallyLoadedPage_1.inputUserName.sendKeys("tomsmdsfgdsfgith");

//    6. Enter password: incorrectpassword

        dynamicallyLoadedPage_1.inputPassword.sendKeys("incorresdgsctpassword");

//    7. Click to Submit button

        dynamicallyLoadedPage_1.submitBtn.click();

//    8. Assert “Your password is invalid!” text is displayed.

        Assert.assertTrue(dynamicallyLoadedPage_1.invalidMsg.isDisplayed());
    }
}
