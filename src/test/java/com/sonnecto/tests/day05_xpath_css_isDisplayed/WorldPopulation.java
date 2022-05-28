package com.sonnecto.tests.day05_xpath_css_isDisplayed;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldPopulation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.worldometers.info/world-population/");

        Thread.sleep(2000);

        for (int i = 1; i <=10; i++) {
            Thread.sleep(1000);
            System.out.println(i+ " : " + driver.findElement(By.xpath("//div[@class = 'maincounter-number']")).getText());

        }

    }
}
