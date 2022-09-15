package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //
        driver.manage().window().maximize();//
        driver.manage().window().fullscreen();//
        driver.get("https://www.tesla.com");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        //Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");// open new url in browser
        //Thread.sleep(3000);
        driver.navigate().back();// navigate back
        //Thread.sleep(3000);
        driver.navigate().forward();// navigate forward
        //Thread.sleep(3000);
        driver.navigate().refresh();// refresh page

        driver.navigate().to("https://www.google.com");

        title = driver.getTitle();
        System.out.println("title = " + title);
        //System.out.println("driver title= " + driver.getTitle());
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        //System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("https://www.google.com");


        driver.close();
        //driver.quite();

        //driver.get("https://www.google.com");//NoSuchSessionException: invalid session id

    }
}
