package com.cydeo.tests.ts13_2;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TS13_13 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver1("chrome",10);



        List<Person> credentials = new ArrayList<>();
        credentials.add(new Person("hr37@cydeo.com"));
        credentials.add(new Person("hr38@cydeo.com"));
        credentials.add(new Person("hr39@cydeo.com"));

        credentials.add(new Person("helpdesk37@cydeo.com"));
        credentials.add(new Person("helpdesk38@cydeo.com"));
        credentials.add(new Person("helpdesk39@cydeo.com"));

        credentials.add(new Person("marketing37@cydeo.com"));
        credentials.add(new Person("marketing38@cydeo.com"));
        credentials.add(new Person("marketing39@cydeo.com"));

        for (Person eachCredential : credentials) {

            driver.get("https://login1.nextbasecrm.com/auth/?backurl=%2Fstream%2F");
            WebElement loginElement = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
            loginElement.sendKeys(eachCredential.userName);



            WebElement loginPassword = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
            loginPassword.sendKeys(eachCredential.password + Keys.ENTER);



            WebElement sendMessage = driver.findElement(By.cssSelector("div#microoPostFormLHE_blogPostForm_inner"));
            sendMessage.click();


            // this is block locator
//            WebElement message = driver.findElement(By.xpath("//body[@contenteditable='true']"));
//          //this is input teg, what catch text, but while I put some text, value of that input changes and shearing to block
            WebElement messageInput = driver.findElement(By.xpath("//input[@id='bxed_idPostFormLHE_blogPostForm']"));
            String anyMessage = "Any Message Here";
            messageInput.sendKeys("Any Message Here");
            messageInput.getAttribute("value").replace("","Any Message Here");
            WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
            sendButton.click();
////input[@id='bxed_idPostFormLHE_blogPostForm']
            ////button[@id='blog-submit-button-save']


            driver.quit();

        }

    }
}


class Person {

    String userName;
    final String password = "UserUser";

    public Person(String userName) {
        this.userName = userName;
    }

}

