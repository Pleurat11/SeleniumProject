package com.sonnecto.pages;

import com.sonnecto.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrvxMainPage {
    public OrvxMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='dropdown-toggle nav-link']/i[@class='feather icon-server text-danger']")
    public WebElement hostsSection;
    @FindBy(xpath = "//a[@class='dropdown-item']/i[@class='fa fa-server']")
    public WebElement cpanelSection;

    public void selectHost(String seller){

    }
}
