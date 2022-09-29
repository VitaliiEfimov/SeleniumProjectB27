package com.cydeo.tests.day4_xpath.hw;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_2variant {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver1("chrome",10);

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
