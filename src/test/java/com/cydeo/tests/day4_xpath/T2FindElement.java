package com.cydeo.tests.day4_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2FindElement {
    /*

     */
    public static void main(String[] args) {
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks);

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        // 6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {
            System.out.println("Text of each link: " + each.getText());
            System.out.println("HREF value for each link:  " + each.getAttribute("href"));
        }
        //iter:
//        for (WebElement allLink : allLinks) {
//
//        }

        driver.quit();

    }
}