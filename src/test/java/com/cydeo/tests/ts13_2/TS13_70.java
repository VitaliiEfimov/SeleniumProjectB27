package com.cydeo.tests.ts13_2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class TS13_70 {
    /*
    AC #1: users access the Oronic Documentation page by clicking the question icon. The page URL: https://doc.oroinc.com/
    Description
    As a user, I should be access to the Oroinc Documentation page.(Window handle)
     */
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
        List<String> usersLogin = new ArrayList<>(Arrays.asList("user184", "storemanager251", "salesmanager251"));
        String password = "UserUser123";
        for (String eachUsersLogin : usersLogin) {
            WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
            WebElement userPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
            userName.sendKeys(eachUsersLogin);
            userPassword.sendKeys(password);
            loginButton.click();
            WebElement questionIcon = driver.findElement(By.xpath("//i[@class='fa-question-circle']"));
            questionIcon.click();
            Set<String> allWindows = driver.getWindowHandles();
            for (String eachWindow : allWindows) {
                driver.switchTo().window(eachWindow);
                if (!driver.getCurrentUrl().equals("https://doc.oroinc.com")) {
                    break;
                }
            }
            Set<String> allWindows1 = driver.getWindowHandles();
            for (String eachWindow1 : allWindows) {
                driver.switchTo().window(eachWindow1);
                if (!driver.getCurrentUrl().equals("https://qa2.vytrack.com")) {
                    break;
                }
            }
            WebElement user = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
            user.click();
            WebElement logOut = driver.findElement(By.xpath("//a[@class='no-hash']"));
            logOut.click();
        }
    }
}
