package com.sonnecto.tests.day10_dropdown_alerts_iframes_windows;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class CarGurusSearchTest {
    WebDriver driver;
    String url = "https://cargurus.com";
    String expTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";

    @BeforeClass
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

    }
    @Test
    public void searchForMinivan() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(), expTitle);

        WebElement maker = driver.findElement(By.id("carPickerUsed_makerSelect"));
        Select make = new Select(maker);
        make.selectByValue("m7");

        Select model = new Select(driver.findElement(By.id("carPickerUsed_modelSelect")));
        model.selectByValue("d308");

        WebElement zipCode = driver.findElement(By.name("zip"));
        zipCode.sendKeys("22102" + Keys.ENTER);


        // print currently selected options of make and model


        WebElement resultCount = driver.findElement(By.xpath("(//span[@class='oKvYB4']/strong)[2]"));
        System.out.println(resultCount.getText());

        int count = Integer.parseInt(resultCount.getText());
        Assert.assertTrue(count > 0);
    }
    @AfterClass
    public void closeBrowser(){
        System.out.println("============================================");
        System.out.println("Closing the browser");

        driver.quit();
    }

}
