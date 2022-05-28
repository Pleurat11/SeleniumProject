package com.sonnecto.tests.day02_browserOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAndPracticeVerification {
    public static void main (String [] args){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        boolean verifyTitle = true;

        if (driver.getTitle().equalsIgnoreCase("yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos")){
            System.out.println(verifyTitle);
        }
        else System.out.println(!verifyTitle);


        driver.get("https://practice.cybertekschool.com");

        if (driver.getCurrentUrl().contains("cybertekschool")){
            System.out.println(verifyTitle);
        }
        if (driver.getTitle().equalsIgnoreCase("practice")){
            System.out.println(verifyTitle);
        }
    }
}
