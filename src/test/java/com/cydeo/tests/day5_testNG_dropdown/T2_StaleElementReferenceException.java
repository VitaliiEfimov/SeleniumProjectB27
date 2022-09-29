package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_StaleElementReferenceException {

    public static void main(String[] args) {
        /*
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com/add_remove_elements/
        3. Click to “Add Element” button
        4. Verify “Delete” button is displayed after clicking.
        5. Click to “Delete” button.
        6. Verify “Delete” button is NOT displayed after clicking. USE
        */

        WebDriver driver = WebDriverFactory.getDriver1("chrome", 10);
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        //3. Click to “Add Element” button////button[.='Add Element']
        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElement.click();
        //4. Verify “Delete” button is displayed after clicking.//button[.='Delete']//button[@class='added-manually']
        WebElement deleteBtn = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());
        //5. Click to “Delete” button.
        deleteBtn.click();
        //6. Verify “Delete” button is NOT displayed after clicking. USE
        try {
            System.out.println("deleteBtn.isDisplayed() =" + deleteBtn.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException is thrown and this is already expected");
        }






        /*
        if (deleteBtn.isDisplayed()) {
            System.out.println("deleteBtn before click is Displayed");
        }else {
            System.out.println("deleteBtn before click is  NOT Displayed");
        }
        deleteBtn.click();
        if (deleteBtn.isDisplayed()) {
            System.out.println("deleteBtn after click is Displayed");
        }else {
            System.out.println("deleteBtn after click is  NOT Displayed");
        }*/
        driver.quit();
    }
}
