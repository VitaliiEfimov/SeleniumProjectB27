package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage_7 {

    public DynamicallyLoadedPage_7(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//strong[.='Done!']")//strong[text()='Done!']
    public WebElement doneMsg;

    @FindBy (xpath = "//img[@alt='square pants']")
    public WebElement spongeBobImage;

}
