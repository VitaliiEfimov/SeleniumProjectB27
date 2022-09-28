package com.cydeo.tests.day4_xpath.hw;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6XPATHLocatorPractice {
    public static void main(String[] args) {


        //1. Open Chrome browser
        //2. Go to http://practice.cydeo.com/multiple_buttons
        //3. Click on Button 1
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/multiple_buttons");

        WebElement btn1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        btn1.click();

        ////p[@id='result']
        WebElement text = driver.findElement(By.xpath("//p[@id='result']"));

        String exp = "Clicked on button one!";
        String act = text.getText();
        if (exp.contains(act)) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!");
        }

        driver.quit();


    }
}
