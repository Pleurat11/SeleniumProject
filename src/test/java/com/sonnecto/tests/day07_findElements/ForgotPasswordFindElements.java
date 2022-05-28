package com.sonnecto.tests.day07_findElements;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForgotPasswordFindElements {
    public static void main(String[] args) {
        String url = "http://practice.cydeo.com/forgot_password";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("First link : " + links.get(0).getText());

        int counter = 0;
        for (int i = 0; i <links.size(); i++) {
            counter++;
        }
        //loop and print href value of each link
        // iter -> enter
        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }
        links.get(1).click();

        driver.quit();

    }
}
