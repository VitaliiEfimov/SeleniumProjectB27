package com.cydeo.tests.day3_locators_xpath.dayclass;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1NextBaseCRM_locators_getText {

    public static void main(String[] args) {


        //        1- Open a Chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");



        driver.manage().window().maximize();

        //        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //        3- Enter incorrect username: “incorrect”
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("incorrect");


        //        4- Enter incorrect password: “incorrect”

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");//win+alt+enter => WebElement user_password = driver.findElement(By.name("USER_PASSWORD"));


        //        5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();


        //        6- Verify error message text is as expectedErrorMessage:
        //        Expected: Incorrect login or password
        //errortext
        WebElement errorText = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorText.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED!");
        }else {
            System.out.println("Error message verification FAILED!");
        }

        driver.close();


    }
}
