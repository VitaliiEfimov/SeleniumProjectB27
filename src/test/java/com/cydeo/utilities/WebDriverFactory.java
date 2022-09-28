package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    /*
                 TASK: NEW METHOD CREATION
                 Method name : getDriver
                 Static method
                 Accepts String arg: browserType
                   - This arg will determine what type of browser is opened
                   - if "chrome" passed --> it will open chrome browser
                   - if "firefox" passed --> it will open firefox browser
                 RETURN TYPE: "WebDriver"
     */
    public static void main(String[] args) {


    }

    //Teacher (Aysun) solution:
    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("Given browser type doesn't exist/or not currently supported");
            return null;
        }
    }

//My solution:
    public static WebDriver getDriver1(String type){
        if (type.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }else if(type.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }
        return null;
    }

}
