package com.sonnecto.tests.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankLink {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        ChromeDriversetup(driver);
        driver.get("https://zero.webappsecurity.com/login.html");

    }
    public static void ChromeDriversetup(WebDriver driver){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
