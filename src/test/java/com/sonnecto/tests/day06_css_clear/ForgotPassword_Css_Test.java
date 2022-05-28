package com.sonnecto.tests.day06_css_clear;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.*;

public class ForgotPassword_Css_Test {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        String url = "http://practice.cydeo.com/forgot_password";

        driver.get(url);

        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));




        input.click();

        input.sendKeys("shkas" + Keys.ENTER);
    }
}
