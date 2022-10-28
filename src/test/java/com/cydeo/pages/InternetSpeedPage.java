package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetSpeedPage {

    public InternetSpeedPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //normalize-space() if you have white spaces in your HTML, you can use normalize-space() for text of element
    @FindBy(xpath = "//a[normalize-space()='Results']")
    public WebElement resultLink;

    @FindBy(xpath = "//span[.='Go']")
    public WebElement goBtn;

    @FindBy(xpath = "//canvas[@class='gauge-speed-text']")
    public WebElement gaugeSpeedNeedle;

    @FindBy(xpath = "//span[@class='result-data-large number result-data-value download-speed']")
    public WebElement downloadSpeed;

    @FindBy(xpath = "//span[@class='result-data-large number result-data-value upload-speed']")
    public WebElement uploadSpeed;
}
