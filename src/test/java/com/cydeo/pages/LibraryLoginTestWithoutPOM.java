package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginTestWithoutPOM {
    // As soon as we create object it will go to PAGE class and look for elements that we located


    //    public LibraryLoginPageWithoutPOM(){
//        PageFactory.initElements(Driver.getDriver(), this);
//    }
    public LibraryLoginTestWithoutPOM() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public WebElement signInButton1 = Driver.getDriver().findElement(By.xpath("//button[.='Sign in']"));

    public WebElement fieldRequiredErrorMessage1 =  Driver.getDriver().findElement(By.xpath("//div[.='This field is required.']/div"));



}

