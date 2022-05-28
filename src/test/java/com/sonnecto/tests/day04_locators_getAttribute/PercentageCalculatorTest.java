package com.sonnecto.tests.day04_locators_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PercentageCalculatorTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://calculator.net");

        String expectedTitle = "Percentage Calculator";
        String actualTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("First test passed");
        }
        else System.out.println("First test failed");

        driver.findElement(By.cssSelector("#sciout > tbody > tr:nth-child(2) > td:nth-child(2) > div > div:nth-child(3) > span:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#sciout > tbody > tr:nth-child(2) > td:nth-child(2) > div > div:nth-child(4) > span:nth-child(1)")).click();

        driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[1]/div/div[5]/span[4]")).click();

        driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
        driver.findElement(By.cssSelector("#sciout > tbody > tr:nth-child(2) > td:nth-child(2) > div > div:nth-child(3) > span:nth-child(2)")).click();


        for (int i = 0; i <=4; i++) {
            driver.findElement(By.cssSelector("#sciout > tbody > tr:nth-child(2) > td:nth-child(2) > div > div:nth-child(4) > span:nth-child(1)")).click();
        }
        System.out.println(driver.findElement(By.id("sciOutPut")).getText());





    }
}
