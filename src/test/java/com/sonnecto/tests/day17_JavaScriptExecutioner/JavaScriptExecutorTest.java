package com.sonnecto.tests.day17_JavaScriptExecutioner;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest extends TestBase {
    /*
        How to run JavaScript code using Selenium?

        JavaScriptExecutor interface is used to run javascript code using selenium.

            We can use this for:
                ->scrolling the page
                ->opening a new tab
                ->setting value to input field.

        Sometimes, selenium with java might not be able to do certain steps.
        We can use then JavaScript language that runs in the browser
  =================================================
  Syntax:
         JavaScriptExecutor js = (JavaScriptExecutor)driver;
         js.executeScript("javascript code");


   How to scroll the page up or down using selenium?

   I use JavascriptExecutor interface to scroll the page.

   First we have to cast the driver to JavascriptExecutor interface
   Then run window.scrollBy("startPixels, endPixels") command using executeScript method.

   JavascriptExecutor js = (JavascriptExecutor)driver;
   js.executeScript( "window.scrollBy(0,-1000)" );
====================================================================

    Let's say we don't know how much to scroll.
    We can scroll until a certain element is visible.

    1)locate the element
    WebElement modelYLabel = driver.findElement(By.xpath("h1[.='Model Y']"));

    2)Cast the driver to JavascriptExecutor interface
    JavascriptExecutor js = (JavascriptExecutor)driver;

    3)Run js command: "arguments[0].scrollIntoView(true)", WebElementName;
        js.executeScript("arguments[0].scrollIntoView(true)", modelYLabel);
==============================================================================
    How to write to input box without using sendKeys() method?

    I can use JavascriptExecutor interface in Selenium to set value to input boxes.

    #1) locate the input field
        WebElement userName = driver.findElement(By.name("email"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='hello@gmail.com'", userName);



     */
    @Test
    public void alertExampleTest(){
        //down casting from WebDriver to JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //running javascript alert command
        js.executeScript("alert('hello hello')");

        BrowserUtils.sleep(2);

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text = " + alert.getText());
        alert.accept();
    }

    @Test
    public void scrollTest(){
        driver.get(ConfigurationReader.getProperty("infiniteScroll.url"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        BrowserUtils.sleep(2);


        for (int i = 0; i <10; i++) {
            js.executeScript("window.scrollBy(0,5000)");
        }
    }
    @Test
    public void scrollToElementTest(){
        driver.get(ConfigurationReader.getProperty("tesla.url"));
        //   1)locate the element
        WebElement modelYLabel = driver.findElement(By.xpath("(//h1[@class='tcl-homepage-hero__heading tds-colorscheme--light'])[6]"));

    //    2)Cast the driver to JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor)driver;

    //    3)Run js command: "arguments[0].scrollIntoView(true)", WebElementName;
     //   js.executeScript("arguments[0].scrollIntoView(true)", modelYLabel);

        BrowserUtils.sleep(2);

        WebElement contactLink = driver.findElement(By.xpath("//a[@title='Shop Now']"));
        js.executeScript("arguments[0].scrollIntoView(true)", contactLink);

    }

    @Test
    public void setValueUsingJSTest(){
        driver.get(ConfigurationReader.getProperty("facebook.url"));
        WebElement userName = driver.findElement(By.name("email"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='hello@gmail.com'", userName);
    }
}
