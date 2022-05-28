package com.sonnecto.tests.day10_dropdown_alerts_iframes_windows;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsIntro {
    /*
    Alert is a pop up box, that we normally click yes, ok, cancel, no etc.

    It will have some text, sometimes we can even enter a value.

    2 types of alerts in Selenium:
              HTML Alert: this type of alert is like normal html element,
              we locate it and we can click on Ok, cancel, no etc.

              JavaScript Alert: these normally block the page and we cannot do anything without dealing with the alert.
              We cannot inspect and locate it. User has to accept or cancel. It's not part of HTML.
              We need to use a special Alert interface to handle these.
              There are 3 types of Alerts in JavaScript.

              Browser pop-ups cannot be handled by Selenium, we can see this when we want to save a file and the
              window with folder names is displayed. Selenium cannot handle those. We need some other library for these classes.

    Alert interface is used to accept or dismiss JavaScript alerts.
    Alert alert = driver.switchTo().alert();
    alert.accept();
    alert.dismiss();
    alert.getText();
    alert.sendKeys();

     */
    String url = "http://practice.cydeo.com/javascript_alerts";
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void jsAlertsTest() throws InterruptedException {
        //click on informational/warning alert link
        WebElement infoAlertLink = driver.findElement(By.xpath("//*[.='Click for JS Alert']"));
        infoAlertLink.click();

        Thread.sleep(1234);
        Alert infoAlert = driver.switchTo().alert();
        infoAlert.accept();
    }
}
