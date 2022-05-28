package com.sonnecto.pages;

import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllOrdersPage extends SmartBearDashboardPage{

    //Do I have to put constructor? NO
    //Constructor is not inherited however, child class has to call Parent class constructor.

    @FindBy(id = "ctl00_MainContent_btnDelete")
    public WebElement deleteSelected;

    //I want to go to other links in the AllOrders page, do I have to create a getLink method?
    //No, since I already have getLink method at the parent, we can use that.

    //Create a method that selects the checkbox with using Name of the person.

    public void selectCheckbox(String name){
        Driver.getDriver().findElement(By.xpath("//td[.="+name+"]/..//input[@type='checkbox']")).click();
    }

}
