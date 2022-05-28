package com.sonnecto.tests.day08_SeleniumWaits_Checkbox_Radio_TestNG;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EtsyTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        WebElement search = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));

        search.click();

        search.sendKeys("Wooden Spoon" + Keys.ENTER);
        
        driver.findElement(By.xpath("//span[@class='wt-hide-xs wt-show-md filter-expander']")).click();

        Thread.sleep(1234);

        WebElement freeShipping = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        WebElement onSale = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
        WebElement under25 = driver.findElement(By.xpath("//label[@for='price-input-1']"));
        WebElement apply = driver.findElement(By.xpath("//button[@aria-label='Apply']"));

        WebElement results = driver.findElement(By.xpath("//span[@class='wt-display-inline-flex-sm']"));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Thread.sleep(1234);

        freeShipping.click();
        Thread.sleep(1234);
        onSale.click();
        Thread.sleep(1234);
        under25.click();
        Thread.sleep(1234);
        apply.click();
        Thread.sleep(1234);

        System.out.println(results.getText());




    }
}
