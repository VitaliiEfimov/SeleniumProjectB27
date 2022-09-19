package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4LibraryAppLogin {
    /*
            1. Open Chrome browser
            2. Go to http://library2.cydeo.com/login.html
            3. Enter username: “incorrect@email.com”
            4. Enter password: “incorrect password”
            5. Verify: visually “Sorry, Wrong Email or Password”
            displayed

     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cydeo.com/login.html");

        WebElement userNameInput = driver.findElement(By.id("inputEmail"));
        userNameInput.sendKeys("incorrect@email.com");

        WebElement userPasswordInput = driver.findElement(By.id("inputPassword"));
        userPasswordInput.sendKeys("incorrect password");//+Keys.ENTER

        WebElement signInBatton = driver.findElement(By.tagName("button"));
        signInBatton.click();

        WebElement exp = driver.findElement(By.className("alert alert-danger"));
        String exp1 = "Sorry, Wrong Email or Password";
        System.out.println(exp.getText());
        if (exp.getText().equals(exp1)){
            System.out.println("Test PASSED!");
        }else {
            System.out.println("Test FAILED!");
        }

        driver.close();






    }
}
