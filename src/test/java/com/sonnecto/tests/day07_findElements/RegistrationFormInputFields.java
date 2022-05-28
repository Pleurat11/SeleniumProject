package com.sonnecto.tests.day07_findElements;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationFormInputFields {
    public static void main(String[] args) throws InterruptedException {


        String url = "https://form.jotform.com/213106431512137";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get(url);

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input[type='text']"));

        System.out.println(inputFields.size());

        for (WebElement inputField : inputFields) {
            inputField.sendKeys("Wooden Spoon");
            Thread.sleep(1000);
        }

        Select select = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        select.selectByIndex(1);
    }

}
