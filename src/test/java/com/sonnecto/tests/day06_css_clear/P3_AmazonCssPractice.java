package com.sonnecto.tests.day06_css_clear;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_AmazonCssPractice {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://amazon.com";

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);

        WebElement searchBox = driver.findElement(By.cssSelector("input[aria-label='Search']"));

        searchBox.click();

        Thread.sleep(1000);

        searchBox.sendKeys("shkas");

        Thread.sleep(1500);

        searchBox.clear();

        searchBox.sendKeys("wooden spoon");

        WebElement search = driver.findElement(By.cssSelector("input[value = 'Go']"));
        search.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
