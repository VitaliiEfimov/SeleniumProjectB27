package com.cydeo.tests.day13_;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1LibraryLoginTest {

    /*
            TC #1: Required field error message test
            1- Open a Chrome browser
            2- Go to: https://library1.cydeo.com/
            3- Do not enter any information
            4- Click to “Sign in” button
            5- Verify expected error is displayed:
            Expected: This field is required.
     */
    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();
    }

    @Test
    public void required_field_error_message_test() {
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
//        Driver.getDriver().get("https://library1.cydeo.com");
        //3- Do not enter any information
        //4- Click to “Sign in” button
//        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMSG.isDisplayed());
    }

    @Test
    public void invalid_email_format_error_message_test() {
        /*
        TC #2: Invalid email format error message test
        1- Open a Chrome browser
        2- Go to: https://library1.cydeo.com/
        3- Enter invalid email format
        4- Verify expected error is displayed:
        Expected: Please enter a valid email address.
         */
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
//        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Enter invalid email format
        libraryLoginPage.inputUserName.sendKeys("invalid");
        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.

        Assert.assertTrue(libraryLoginPage.enterInvalidEmailErrorMsg.isDisplayed());
    }

    @Test
    public void libraryNegativeLogin() {
        libraryLoginPage.inputUserName.sendKeys("wrong@email.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");
        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.wrongEmailAndPasswordErrorMsg.isDisplayed());
    }

    @Test
    public void libraryPositiveLogin() {
        libraryLoginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("library.app.username"));
        libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("library.app.password"));
        libraryLoginPage.signInButton.click();


    }
    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }


}
