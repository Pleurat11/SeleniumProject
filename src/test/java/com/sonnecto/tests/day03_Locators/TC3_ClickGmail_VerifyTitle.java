package com.sonnecto.tests.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ClickGmail_VerifyTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://www.facebook.com";
        driver.get(url);

        WebElement email = driver.findElement(By.id("email"));

        email.click();

        email.sendKeys("pleuraat");

        WebElement pass = driver.findElement(By.id("pass"));

        pass.click();

        pass.sendKeys("looool");

        pass.submit();

/*    driver.findElement(By.linkText("Gmail")).click();

        driver.findElement(By.linkText("Sign in")).click();

        WebElement username = driver.findElement(By.id("identifierId"));

        username.sendKeys("pleurat.sonnecto@gmail.com");

        username.submit();
*/
    }

}
