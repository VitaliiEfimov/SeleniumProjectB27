package com.cydeo.tests.day11_upload_actions_javascriptexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {
    /*
            1. Go to  “http://demo.guru99.com/test/upload”
            2. Upload file into Choose File
            3. Click terms of servide check box
            4. Click Submit File button
            5. Verify expected message appeared. Expected:
            “1 file
            has been successfully uploaded.”
     */

    @Test
    public void guru99_upload_test() {
        Driver.getDriver().get("https://demo.guru99.com/test/upload");

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']"));
        //"C:\Users\15717\Downloads\some-file.txt"
        chooseFile.sendKeys("C:\\Users\\15717\\Downloads\\some-file.txt");

        WebElement termsOfService = Driver.getDriver().findElement(By.id("terms"));
        termsOfService.click();

        Driver.getDriver().findElement(By.id("submitbutton")).click();

        WebElement result = Driver.getDriver().findElement(By.id("res"));

        String expectedMes = "1 file\nhas been successfully uploaded.";
        String actualText = result.getText();
        Assert.assertEquals(actualText,expectedMes);


    }
}
