package com.sonnecto.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {

    public static void loginToSmartBear(WebDriver driver){
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test" + Keys.ENTER);
    }

    public static void printNamesAndCities(WebDriver driver){
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        List<WebElement> cities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[7]"));

        for (int i = 0; i <allNames.size(); i++) {
            for (int j = 0; j <=1; j++) {

            }
            System.out.println("Name " + i + ": "+  allNames.get(i).getText() + ", City" +i +": " + cities.get(i).getText() );
        }
    }
}
