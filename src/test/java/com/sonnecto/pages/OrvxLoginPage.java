package com.sonnecto.pages;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrvxLoginPage extends TestBase {
    public OrvxLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "email_signin")
    public WebElement email;

    @FindBy(id="pass_signin")
    public WebElement password;

    @FindBy(id = "loginbutt")
    public WebElement SignInBttn;


}
