package com.cydeo.tests.day10_javafaker_driver_util.hw;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RegistrationFormConfirmation {
    /*
            1. Open browser
            2. Go to website: https://practice.cydeo.com/registration_form
            3. Enter first name
            4. Enter last name
            5. Enter username
            6. Enter email address
            7. Enter password
            8. Enter phone number
            9. Select a gender from radio buttons
            10. Enter date of birth
            11. Select Department/Office
            12. Select Job Title
            13. Select programming language from checkboxes
            14. Click to sign up button
            15. Verify success message “You’ve successfully completed registration.” is
            displayed.

            Note:
            1. Use new Driver utility class and method
            2. User JavaFaker when possible
            3. User ConfigurationReader when it makes sense
     */


    @Test
    public void registrationForm() {
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");
        Faker faker = new Faker();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//input[@class='form-control']"));
        for (WebElement each : list) {
            if (each.getAttribute("name").equals("firstname")) {
                each.sendKeys(faker.name().firstName());
            }
            if (each.getAttribute("name").equals("lastname")) {
                each.sendKeys(faker.name().lastName());
            }
            if (each.getAttribute("name").equals("username")) {
                each.sendKeys(faker.bothify("######?????????"));
            }
            if (each.getAttribute("name").equals("email")) {
                each.sendKeys(faker.internet().emailAddress());
            }
            if (each.getAttribute("name").equals("password")) {
                each.sendKeys(faker.internet().password());
            }
            if (each.getAttribute("name").equals("phone")) {
                each.sendKeys(faker.numerify("###-###-####"));
            }
            if (each.getAttribute("name").equals("birthday")) {
                each.sendKeys(faker.numerify(faker.number().numberBetween(1, 12) + "/" + faker.number().numberBetween(1, 30) + "/" + faker.numerify("####")));
            }
        }
        List<WebElement> list2 = Driver.getDriver().findElements(By.xpath("//select[@class='form-control selectpicker']"));
        for (WebElement each : list2) {
            Select select = new Select(each);
            if (each.getAttribute("name").equals("department")) {
                select.selectByIndex(faker.number().numberBetween(1, 8));
            }
            if (each.getAttribute("name").equals("job_title")) {
                select.selectByIndex(faker.number().numberBetween(1, 8));
            }
        }
        //input[@name='gender']//input[@class='form-check-input']
        WebElement radioButtons = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        radioButtons.click();
        WebElement programmingLanguage = Driver.getDriver().findElement(By.xpath("//input[@value='javascript']"));
        programmingLanguage.click();
        WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUpButton.click();

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//p")).isDisplayed());
        Driver.getDriver().quit();
    }
    public static int pow(int value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * pow(value, powValue - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("pow(5, 3) = " + pow(5, 3));
    }
}


