package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1CarInsuranceVerification {

    /*
    1. Open Chrome browser
            2. Go to
            https://www.qa1.excelsoirinsurance.com/login
            3. Verify URL contains
                 Expected: "excelsoirinsurance"
            4. Verify title:
                   Expected: "Login | Excelsoir Insurance"
            day2_locators_getText_getAttribute

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.qa1.excelsoirinsurance.com/login");
        String expected = "xcelsoirinsurance";
        String actual = driver.getCurrentUrl();
        if (actual.contains(expected)){
            System.out.println("URL PASSED!");
        }else{
            System.out.println("ERL FAILED!");
        }
        expected = "Login | Excelsoir Insurance";
        actual = driver.getTitle();
        if (actual.equals(expected)){
            System.out.println("TITLE PASSED!");
        }else{
            System.out.println("TITLE FAILED!");
        }
        driver.close();
    }
}
