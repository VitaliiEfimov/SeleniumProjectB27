package com.cydeo.tests.day11_upload_actions_javascriptexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class T1_JavaFaker_Practice {

    @Test
    public void registration_form() {
//        1. Open browser
//        2. Go to website: https://practice.cydeo.com/registration_form
        Faker faker = new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

//        3. Enter first name

        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());



//        4. Enter last name

//        5. Enter username

        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String user = faker.name().username().replace(".","");
        userName.sendKeys(user);
//        6. Enter email address
//        7. Enter password
//        8. Enter phone number
//        9. Select a gender from radio buttons
        List<WebElement> genders = Driver.getDriver().findElements(By.xpath("//input[@type='radio']"));
        for (int i = 1; i <= 3; i++) {
            genders.get(faker.number().numberBetween(1, 3));
        }
        genders.get(faker.number().numberBetween(0, 2));

//        10. Enter date of birth
        WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirth.sendKeys("10/03/1980");
//        11. Select Department/Office
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        select.selectByIndex(faker.number().numberBetween(1,9));


//        12. Select Job Title


//        13. Select programming language from checkboxes


//        14. Click to sign up button


//        15. Verify success message “You’ve successfully completed registration.” is
//        displayed.
    }
}
