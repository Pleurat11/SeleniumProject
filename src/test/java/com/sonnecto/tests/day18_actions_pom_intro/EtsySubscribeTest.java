package com.sonnecto.tests.day18_actions_pom_intro;

import com.github.javafaker.Faker;
import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EtsySubscribeTest extends TestBase {
    @Test
    public void etsyScroll(){
        driver.get(ConfigurationReader.getProperty("etsy.url"));

        WebElement emailSearch = driver.findElement(By.id("email-list-signup-email-input"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", emailSearch);

        BrowserUtils.sleep(2);

        //  Faker faker = new Faker();
        //  declared in TestBase now

        emailSearch.sendKeys(faker.internet().emailAddress());

        driver.findElement(By.xpath("//button[@class='wt-btn wt-input-btn-group__btn']")).click();

        WebElement result = driver.findElement(By.xpath("//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));

        Assert.assertTrue(result.isDisplayed());

        Assert.assertEquals(result.getText(), "Great! We've sent you an email to confirm your subscription.");
    }
}
