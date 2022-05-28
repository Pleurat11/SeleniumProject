package com.sonnecto.pages;

import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class SmartBearDashboardPage {
    //Constructor
    public SmartBearDashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void getLink(String link){
        Driver.getDriver().findElement(By.partialLinkText(link)).click();

    }

}
