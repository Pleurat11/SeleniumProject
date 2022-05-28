package com.sonnecto.tests.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.youtube.com";
        driver.get(url);

        driver.findElement(By.name("search_query")).click();

        driver.findElement(By.name("search_query")).sendKeys("Blleki");

        driver.findElement(By.name("search_query")).submit();

        Thread.sleep(1500);

        driver.findElement(By.partialLinkText(("MALINA"))).click();




























    }
}
