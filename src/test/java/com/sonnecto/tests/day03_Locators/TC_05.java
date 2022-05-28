package com.sonnecto.tests.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_05 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Web Orders Login")){
            System.out.println("Web orders login test pass");
        }
        else System.out.println("First test failed");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        Thread.sleep(1000);

        driver.findElement(By.id("ctl00_MainContent_password")).click();
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        String title2 = driver.getTitle();

        if (title2.equalsIgnoreCase("Web Orders")){
            System.out.println("Second test passed succesfully");
        }
        else System.out.println("Failed succesfully");
    }



}
