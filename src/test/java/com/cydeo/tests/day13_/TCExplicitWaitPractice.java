package com.cydeo.tests.day13_;

import com.cydeo.pages.DynamicallyLoadedPage_7;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TCExplicitWaitPractice {
    /*
    TC#4 : Dynamically Loaded Page Elements 7
    1. Go to https://practice.cydeo.com/dynamic_loading/7
    2. Wait until title is “Dynamic title”
    3. Assert: Message “Done” is displayed.
    4. Assert: Image is displayed.
     */

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void dynamically_Loaded_Page_Elements_7() {
        //    2. Wait until title is “Dynamic title”

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //    3. Assert: Message “Done” is displayed.
        DynamicallyLoadedPage_7 dynamicallyLoadedPage_7 = new DynamicallyLoadedPage_7();
        Assert.assertTrue(dynamicallyLoadedPage_7.doneMsg.isDisplayed());//Assert.assertTrue(new DynamicallyLoadedPage_7().doneMsg.isDisplayed());

        //    4. Assert: Image is displayed.

        Assert.assertTrue(dynamicallyLoadedPage_7.spongeBobImage.isDisplayed());
    }


}
