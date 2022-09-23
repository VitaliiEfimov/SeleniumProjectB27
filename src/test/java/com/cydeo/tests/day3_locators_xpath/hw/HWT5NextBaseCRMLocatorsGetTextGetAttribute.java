package com.cydeo.tests.day3_locators_xpath.hw;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWT5NextBaseCRMLocatorsGetTextGetAttribute {
    /*
                TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
                1- Open a chrome browser
                2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
                3- Enter incorrect username into login box:
                4- Click to `Reset password` button
                5- Verify “error” label is as expected
                Expected: Login or E-mail not found




                PS: Inspect and decide which locator you should be using to locate web
                elements.
                PS2: Pay attention to where to get the text of this button from
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement loginBox = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginBox.sendKeys("incorrect");
        WebElement resetPasswordBtn = driver.findElement(By.cssSelector("button[class='login-btn']"));
        resetPasswordBtn.click();
        WebElement errorLabel = driver.findElement(By.cssSelector("div[class='errortext']"));
        String expectedLabel = "Login or E-mail not found";
        String actualLabel = errorLabel.getText();
        if(expectedLabel.equals(actualLabel)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }




        driver.quit();


    }
}
