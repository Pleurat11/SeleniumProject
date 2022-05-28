package com.sonnecto.tests.day05_xpath_css_isDisplayed;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMapsXpathTest {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement mapsBoxSeach = driver.findElement(By.xpath("//a[@class='gb_d']"));

        mapsBoxSeach.click();




    }
}
