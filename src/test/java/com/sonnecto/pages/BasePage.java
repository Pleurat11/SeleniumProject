package com.sonnecto.pages;

import com.sonnecto.utils.Driver;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    //WebDriver variable just in case any of the children classes need.
    protected WebDriver driver;

    @FindBy(xpath = "//img[@alt='Home']") // this element is available to all the child classes.
    public WebElement edmundsLogo;

    @FindBy(linkText = "New Car Pricing")
    public WebElement newCarPricing;


    public BasePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }
    public void goToNewCarPricingPage(){
        newCarPricing.click();
    }

    /**
     abstract method to be implemented by POM classes.
     This is to verify if we are at the correct page.
     Using title of the page or anything similar.
     */
    public abstract void isCurrentPage();



}
