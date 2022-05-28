package com.sonnecto.tests.day07_findElements;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorAddTestV2 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.calculator.net";
        int num1 = 9, num2 = 7;
        int expectedResult = num1 + num2;

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);

        //                                                  asign a value to xpath
        WebElement num1Elem = driver.findElement(By.xpath("//span[.='" + num1 + "']"));

        System.out.println("//span[.='" + num1 + "']");

        WebElement num2Elem = driver.findElement(By.xpath("//span[.='"+num2+"']"));

        WebElement plus = driver.findElement(By.xpath("//span[.='+']"));
        WebElement equals = driver.findElement(By.xpath("//span[.='=']"));

        num1Elem.click();

        plus.click();
        num2Elem.click();
        equals.click();

        WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        System.out.println("Result = " + result.getText());


        // Interview Question: Difference between CSS and xPath?

        // Both are one of 8 locators in Selenium WebDriver
        // They Help us write custom locators.
        // Especially useful when there is no Id or name etc.
        // We can use tagname and any html attribute.


        //1) Xpath can locate elements using text value.
        // CSS cannot use text value
        //2) Xpath can use indexes when there are multiple mathches.
        // Css does not support indexing numbers.
        //3) Xpath we can navigate from parent to child and child to parent.
        // Css does not support Child to parent navigation, only parent to child navigation.
        //4) Xpath is considered to be slower, Css is slightly faster.(Although we don't feel the difference unless we work with multiple elements)


    }
}
