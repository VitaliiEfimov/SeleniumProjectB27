package com.cydeo.tests.day13_;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class LoginTestWithoutPOM {

    // As soon as we create object it will go to PAGE class and look for elements that we located


    @Test
    public void required_field_error_message_test() {

        Driver.getDriver().get("https://library1.cydeo.com/");

        // As soon as we create object it will go to PAGE class and look for elements that we located
        LoginTestWithoutPOM libraryLoginPageWithoutPOM = new LoginTestWithoutPOM();

//       libraryLoginPageWithoutPOM.signInButton1.click();

 //       Assert.assertTrue(libraryLoginPageWithoutPOM.fieldRequiredErrorMessage.isDisplayed());
    }
}