package com.sonnecto.tests.day20_review_waits;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitExamples extends TestBase {

    @Test
    public void test1(){
        driver.get("http://practice.cydeo.com/dynamic_loading/1");

        WebElement triggerButton = driver.findElement(By.xpath("//button[.='Start']"));

        triggerButton.click();

        WebElement userName = driver.findElement(By.id("username"));

        //In order to use explicit wait you need to create "wait" object.
        WebDriverWait wait = new WebDriverWait(driver, 10); //constructor expects parameters
        //1.Driver object, 2.Waiting time

        //Give condition for the element that you are waiting for, in this case element that
            //I am waiting for is userName

        wait.until(ExpectedConditions.visibilityOf(userName));



        userName.sendKeys("MikeSmith");

        //When we comment out implicit wait to observe synchronization issue
        //ElementNotInteractableException.

    }

    @Test
    public void test2(){
        driver.get("https://practice.cydeo.com/dynamic_controls");
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shkas");

    }

}
