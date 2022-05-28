package com.sonnecto.tests.day08_SeleniumWaits_Checkbox_Radio_TestNG;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBoxWithImplicitWait {
    public static void main(String[] args) {
        /*
        When selenium findElement method is called, by default if the element is not on the page at that moment
        it will throw NoSuchElement Exception.

        By adding ImplicitWait command, we can tell selenium to wait
        until element appears on the page within given time.

        Selenium will look for the element until the given time passes, if element is not found within
        the given time, then it will throw NoSuchElementException.

        If element is found before the given seconds, it will locate and continue to next step.
        It does not wait for the full given time.

        implicitlyWait works with findElement method.
        driver will wait up to 10 secs to find the element, if it finds before 10 seconds it will continue to the next step.
        If it cannot find within 10 secs, then it will show Exception.


        CHECKBOXES:
                    in html are written using input tag and type ="checkbox"

        We can locate the checkbox using any of the 8 locators.
        In order to check or uncheck it, we click on it.

        We can use isSelected() method in selenium to find out if checkbox is checked or not.
        isSelected() returns a boolean expression.



         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/checkboxes");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement checkBox1 = driver.findElement(By.name("checkbox1"));
        checkBox1.click();

        WebElement checkBox2 = driver.findElement(By.name("checkbox2"));
        //uncheck second checkbox
        checkBox2.click();

        checkBox1.getLocation();
    }
}
