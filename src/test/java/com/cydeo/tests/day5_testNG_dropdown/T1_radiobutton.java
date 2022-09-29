package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T1_radiobutton {
    public static void main(String[] args) {
        /*
                1. Open Chrome browser
                2. Go to https://practice.cydeo.com/radio_buttons
                3. Click to “Hockey” radio button
                4. Verify “Hockey” radio button is selected after clicking.
         */

        WebDriver driver = WebDriverFactory.getDriver1("chrome",10);
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyBtn.click();
//        System.out.println("hockeyBtn.isSelected() before click = " + hockeyBtn.isSelected());
//        hockeyBtn.click();
//        System.out.println("hockeyBtn.isSelected() after click = " + hockeyBtn.isSelected());
        if (hockeyBtn.isSelected()) {
            System.out.println("HockeyBtn is selected!");
        }else {
            System.out.println("HockeyBtn is not selected!");
        }


// test all sport radiobtn if they are clickable
        List<WebElement> sportRadioBtns = driver.findElements(By.xpath("//input[@name='sport']"));
        for (WebElement sportRadioBtn : sportRadioBtns) {
            sportRadioBtn.click();
            if (sportRadioBtn.isSelected()) {
                System.out.println(sportRadioBtn.getAttribute("id")+ sportRadioBtn.getText() + " button is Selected!");
            }else {
                System.out.println("RadioBtn is not selected!");
            }
        }

        driver.quit();
    }
}
