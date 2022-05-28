package com.sonnecto.tests.day07_findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/forgot_password");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shkas@gmail.com" + Keys.ENTER);

        WebElement confirmationMessage = driver.findElement(By.xpath("//h4[@name='confirmation_message']"));

        if (confirmationMessage.equals("Your e-mail's been sent!")){
            System.out.println("PASS : Email sent succesfully");
        }
        else {
            System.out.println("Test Case Failed");
        }



    }
}
