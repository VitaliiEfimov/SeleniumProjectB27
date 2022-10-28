package com.cydeo.tests.day12_actions_javascriptexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_and_Drop {
    /*
    1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
    2. Drag and drop the small circle to bigger circle.
    3. Assert:
    -Text in big circle changed to: “You did great!”
     */

    @Test
    public void circle_drag_and_drop() {

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //div[@id='draggable']
        //div[@id='droptarget']

        WebElement draggable = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement droptarget = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(draggable).moveToElement(droptarget).pause(2000).clickAndHold().pause(2000).release().perform();
//        actions.moveToElement(droptarget).pause(2000).click().pause(2000).perform();

//        actions.dragAndDrop(draggable,droptarget).perform();

        String actualTextOnBigCircle = droptarget.getText();
        String expectedTextOnBigCircle = "You did great!";
        Assert.assertEquals(actualTextOnBigCircle,expectedTextOnBigCircle);

    }
}
