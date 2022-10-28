package com.cydeo.tests.day14_practice;

import com.cydeo.pages.InternetSpeedPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InternetSpeedTest {
    /*
    TC #2: Explicit wait practice
    1- Open a Chrome browser

    2- Go to: https://www.speedtest.net/
    3- Wait until Results link is displayed
    4- Click on Go button
    5- Wait until gauge-speed-needle displayed
    6- Wait until gauge-speed-needle disappear
    7- Print Download and Upload Speeds
     */

    @Test
    public void internet_speed_test() {

        Driver.getDriver().get("https://www.speedtest.net/");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);
        InternetSpeedPage internetSpeedPage = new InternetSpeedPage();

//        3- Wait until Results link is displayed
        wait.until(ExpectedConditions.visibilityOf(internetSpeedPage.resultLink));

//    4- Click on Go button
        internetSpeedPage.goBtn.click();

//    5- Wait until gauge-speed-needle displayed
        wait.until(ExpectedConditions.visibilityOf(internetSpeedPage.gaugeSpeedNeedle));

//    6- Wait until gauge-speed-needle disappear
        wait.until(ExpectedConditions.invisibilityOf(internetSpeedPage.gaugeSpeedNeedle));

//    7- Print Download and Upload Speeds
        System.out.println("internetSpeedPage.downloadSpeed = " + internetSpeedPage.downloadSpeed.getText());
        System.out.println("internetSpeedPage.uploadSpeed = " + internetSpeedPage.uploadSpeed.getText());

        Driver.getDriver().close();


    }
}
