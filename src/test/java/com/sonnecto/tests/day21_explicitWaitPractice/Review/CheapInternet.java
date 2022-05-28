package com.sonnecto.tests.day21_explicitWaitPractice.Review;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheapInternet extends TestBase {
    @Test
    public void cheapInternetSpeedTest(){

        driver.get(ConfigurationReader.getProperty("speedtest.url"));
        WebDriverWait wait = new WebDriverWait(driver, 60);

        //wait until change server link is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Change Server")));

        //click on Go button
        WebElement go = driver.findElement(By.className("start-text"));
        go.click();

        //wait until element with class gauge-speed-needle disappears
        WebElement loading = driver.findElement(By.className("gauge-speed-needle"));
        wait.until(ExpectedConditions.visibilityOf(loading));

        wait.until(ExpectedConditions.invisibilityOf(loading));
        WebElement results = driver.findElement(By.xpath("//div[@class='result-container-data']"));
        System.out.println("results = " + results.getText());
    }
}
