package com.sonnecto.tests.day21_explicitWaitPractice.Review;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CherCherWaitPracticeTest extends TestBase {

//    When we have @BeforeMethod in both TestBase and Test child classes,
//    @BeforeMethod of TestBase parent class runs first, then @BeforeMethod of child class.
//
//    It is useful when @Test methods need initial steps.

    @BeforeMethod
    public void goToHomePage(){
        driver.get(ConfigurationReader.getProperty("chercher.url"));
    }

    @Test
    public void waitForAlertTest(){
        //no such alert
        WebElement cherCherAlert = driver.findElement(By.id("alert"));
        cherCherAlert.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.alertIsPresent());


        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void waitForButtonEnabledTest(){
        WebElement button = driver.findElement(By.id("disable"));
        System.out.println(button.isEnabled()); // returns false

        //click on enable button
        WebElement enableBtn = driver.findElement(By.id("enable-button"));
        enableBtn.click();

        //wait until the button is enabled
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(enableBtn));

        System.out.println(button.isEnabled());

    }
    @Test
    public void waitForCheckboxCheckedTest(){
        WebElement checkBox = driver.findElement(By.id("ch"));
        System.out.println("Checkbox is chkecked = " + checkBox.isSelected());

        WebElement checkBoxBtn = driver.findElement(By.id("checkbox"));
        checkBoxBtn.click();

        //Wait until checkbox is selected
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeSelected(checkBox));
        System.out.println("Checkbox is checked = " + checkBox.isSelected());


    }
}
