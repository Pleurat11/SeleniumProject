package com.sonnecto.tests.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDiscord {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test verification passed");
        }
        else System.out.println("Failed");

        Thread.sleep(3000);

        driver.navigate().back();

        String googleTitle = driver.getTitle();

        String expecteTitle = "Google";

        if (googleTitle.contains(expecteTitle)){
            System.out.println("Passedddd");
        }
        else System.out.println("Faileddddd");

    }
}
