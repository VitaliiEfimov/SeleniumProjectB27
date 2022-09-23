package com.cydeo.tests.day4_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector {

    /*
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com/forgot_password
        3. Locate all the WebElements on the page using XPATH and/or CSS
        locator only (total of 6)
        a. “Home” link
        b. “Forgot password” header
        c. “E-mail” text
        d. E-mail input box
        e. “Retrieve password” button
        f. “Powered by Cydeo text
        4. Verify all web elements are displayed.
        T1_xpath_cssSelector
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");


        //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        //WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));


        //b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        //WebElement forgotPassword2 = driver.findElement(By.xpath("//h2[test()='Forgot Password']"));
        //a[@href='/']
        //div[class='example']>h2
        //div.example>h2
        //(//*[.="Forgot Password"])[2]
        ////div[@class='example']/h2


        //c. “E-mail” text
        WebElement emailText = driver.findElement(By.xpath("//label[.='E-mail']")); ////label[.='E-mail']
        //WebElement emailText2 = driver.findElement(By.xpath("label[contains(@for,'email')]"));////label[contains(@for,'email')]

//        d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.xpath("//label[.='E-mail']"));// //input[contains(@pattern, 'a-z')]
       // WebElement emailInputBox2 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));// //input[contains(@pattern, 'a-z')]

//        e. “Retrieve password” button
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[id=\"form_submit\"]>i"));// //button[id="form_submit"]>i

//        f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style=\"text-align: center;\"]"));// //div[@style="text-align: center;"]

//        4. Verify all web elements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


        driver.quit();


    }
}
