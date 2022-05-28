package com.sonnecto.tests.day22_fluentwait_testng_overview;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FluentWaitDemoTest extends TestBase {
    @Test
    public void fluentWaitTest(){
        driver.get(ConfigurationReader.getProperty("cydeoBase.url"));
        //Waiting 30 seconds for an element to be present on the page,
        //checking its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.id("foo"));
            }
        });

    }
}
