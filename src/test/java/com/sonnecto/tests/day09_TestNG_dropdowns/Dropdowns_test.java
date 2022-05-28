package com.sonnecto.tests.day09_TestNG_dropdowns;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdowns_test {
    /*
    Select tag is used to add dropdown in HTML.
    <select id ="countries">
            <option name = "Turkey">
            <option name = "USA">
            <option name = "Kosovo">
    </select>

    There's a class called Select in selenium that makes working with dropdowns easy.

    1)Locate the Select tag
    2)Pass the WebElement to Select class constructor.

    WebElement allCountries = driver.findElement(By.id("countries"));
    Select allCountries = new Select(allCountries);

    allcountries.selectByVisibleText("USA");
    allcountries.selectByValue("TR");
    allcountries.selectByIndex("0")


     */
    String url = "http://practice.cydeo.com/dropdown";
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        System.out.println("Setting up WebDriver...");
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void titleTest(){
        System.out.println("Title of the page = " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Dropdowns");
    }

    @Test
    public void simpleDropdownTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select simpleDropdown = new Select(dropdown);
        simpleDropdown.selectByIndex(2);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        System.out.println("Closing browser");
        Thread.sleep(4000);
        driver.quit();
    }
}
