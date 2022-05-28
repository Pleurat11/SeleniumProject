package com.sonnecto.tests.day01_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // 1) set up the browser driver.
        WebDriverManager.chromedriver().setup();

        // 2) open the browser. Create object of ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        // 3) Go to google homepage
        driver.get("https://www.google.com");

    }

}
