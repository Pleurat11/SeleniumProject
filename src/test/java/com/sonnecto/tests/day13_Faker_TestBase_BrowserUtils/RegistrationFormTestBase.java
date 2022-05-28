package com.sonnecto.tests.day13_Faker_TestBase_BrowserUtils;

import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 Parent class for RegistrationFormTest
 */
public class RegistrationFormTestBase {
    WebDriver driver;
    String url = "https://practice.cydeo.com/registration_form";
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get(url);
    }
    @AfterMethod
    public void tearDown(){
        BrowserUtils.sleep(5);
        driver.quit();
    }
}
