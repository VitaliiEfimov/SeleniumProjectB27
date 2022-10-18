package com.cydeo.tests.day11_upload_actions_javascriptexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class T3_Hover_Test {
    /*
    1. Go to https://practice.cydeo.com/hovers
    2. Hover over to first image
    3. Assert:
    a . “name: user1” is displayed
    b. “view profile” is displayed
       4. Hover over to second image
       5. Assert:
    a . “name: user2” is displayed
    b. “view profile” is displayed
       6. Hover over to third image
       7. Confirm:
    a . “name: user3” is displayed
    b. “view profile” is displayed

     */

    @Test
    public void hover_test() {

        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        WebElement view1 = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[1]"));
        WebElement view2 = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[2]"));
        WebElement view3 = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[3]"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(image1).perform();
        Assert.assertTrue(view1.isDisplayed());
//        view1.click();
        Assert.assertTrue(user1.isDisplayed());

        actions.moveToElement(image2).perform();
        Assert.assertTrue(view2.isDisplayed());
        Assert.assertTrue(user2.isDisplayed());

        actions.moveToElement(image3).perform();
        Assert.assertTrue(view3.isDisplayed());
        Assert.assertTrue(user3.isDisplayed());

        Driver.closeDriver();

    }
    @Test
    public void T3(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        List<WebElement> pics = Driver.getDriver().findElements(By.xpath("//img"));
        List<WebElement> names = Driver.getDriver().findElements(By.xpath("//h5"));
        List<WebElement> view = Driver.getDriver().findElements(By.xpath("//a[.='View profile']"));
        Actions action = new Actions(Driver.getDriver());

        for (int i = 0; i < pics.size(); i++) {
            action.moveToElement(pics.get(i)).perform();
            Assert.assertTrue(names.get(i).isDisplayed());
            Assert.assertTrue(view.get(i).isDisplayed());
        }

        Driver.closeDriver();
    }


}
