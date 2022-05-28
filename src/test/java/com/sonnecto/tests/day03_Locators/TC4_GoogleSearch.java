package com.sonnecto.tests.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_GoogleSearch {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.google.com";
        driver.get(url);

        driver.findElement(By.name("q")).sendKeys("apple");

        Thread.sleep(3000);
        driver.findElement(By.className("gNO89b")).click();

    }
}
