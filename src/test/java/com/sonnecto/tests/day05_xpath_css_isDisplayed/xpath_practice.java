package com.sonnecto.tests.day05_xpath_css_isDisplayed;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xpath_practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://practice.cydeo.com/multiple_buttons");

        driver.findElement(By.xpath("//button[@onclick = 'button1()']")).click();

        String expectedResult = "Clicked on button one!";
        String actualResult = driver.findElement(By.id("result")).getText();

        if (actualResult.equalsIgnoreCase(expectedResult)){
            System.out.println("Test Passed");
        }
        else System.out.println("Failed");

        driver.quit();
    }

}
