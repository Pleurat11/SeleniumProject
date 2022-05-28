package com.sonnecto.tests.day08_SeleniumWaits_Checkbox_Radio_TestNG;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonsTest {
    /*
    It is similar to checkboxes, we locate it using one of the 8 locators, then we click on it to select.
    isSelected() method can be used to check if a radio buttion is selected or not.

    //We can use isEnabled method to check if an element is active/disabled.
     */
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.cydeo.com/radio_buttons";

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        WebElement red = driver.findElement(By.id("red"));
        if (!red.isSelected()){
            red.click();
        }
        List <WebElement> allButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Number of Radio Buttons: " + allButtons.size());

        for (WebElement each : allButtons) {
            if (each.isEnabled()){
                each.click();
            }
        }
    }
}
