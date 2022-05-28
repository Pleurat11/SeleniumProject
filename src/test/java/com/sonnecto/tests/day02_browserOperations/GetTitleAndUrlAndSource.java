package com.sonnecto.tests.day02_browserOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class GetTitleAndUrlAndSource {

    public static void main(String [] args){

        WebDriverManager.chromedriver().setup();

        String url = "https://www.sonnecto.com";

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        System.out.println(driver.getTitle());

        System.out.println("HTML page source: " + driver.getPageSource());

        String sourceCode = driver.getPageSource();

        System.out.println(sourceCode.length());


    }

}
