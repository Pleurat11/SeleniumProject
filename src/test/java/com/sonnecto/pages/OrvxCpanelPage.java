package com.sonnecto.pages;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrvxCpanelPage extends TestBase {

    public OrvxCpanelPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "seller")
    public WebElement sellerSelect;

    public void selectSeller(String seller){
        Select selectSeller = new Select(sellerSelect);
        selectSeller.selectByVisibleText(seller);
    }
}
