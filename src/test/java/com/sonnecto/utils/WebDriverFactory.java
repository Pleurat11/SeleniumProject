package com.sonnecto.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
WebDriverFactory class:
                    is used to create WebDriver(Selenium) object and return it.
                    It will open the browser and maximise it.

Nice working with you, thanks. Bye :)
 */

public class WebDriverFactory {
    public static WebDriver getDriver(String str){
        if (str.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        else if (str.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        else {
            System.out.println("Invalid broswer type = " + str);
            return null;
        }
    }
}
