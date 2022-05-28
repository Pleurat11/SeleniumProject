package com.sonnecto.tests.day11_alerts_frames_windows;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertExampleTest {
    WebDriver driver;
    String url = "http://practice.cydeo.com/javascript_alerts";
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get(url);

    }
    @Test
    public void infoAlertTest(){
        WebElement alertLink = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        alertLink.click();
        Alert jsAlert = driver.switchTo().alert();
        Assert.assertEquals(jsAlert.getText(),"I am a JS Alert");
        jsAlert.accept();

    }
    @Test
    public void confirmAlertTest(){
        WebElement jsLink = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsLink.click();
        Alert jsAlert = driver.switchTo().alert();
        Assert.assertEquals(jsAlert.getText(), "I am a JS Confirm");
        jsAlert.dismiss();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You clicked: Cancel");
    }

    @Test
    public void promptAlertTest(){
        WebElement jsButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsButton.click();
        Alert jsAlert = driver.switchTo().alert();
        Assert.assertEquals(jsAlert.getText(),"I am a JS prompt");
        System.out.println("Alert text = " + jsAlert.getText());
        jsAlert.sendKeys("hello");
        jsAlert.accept();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You entered: hello");
        System.out.println("Result text = "+ result.getText());
    }
}
