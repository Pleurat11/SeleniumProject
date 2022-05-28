package com.sonnecto.tests.day07_findElements;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorAddTest {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.calculator.net";
        int num1 = 5, num2 = 3, expectedResult = 8;

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);

        Thread.sleep(1234);

        WebElement five = driver.findElement(By.xpath("//span[@onclick='r(5)']"));
        WebElement three = driver.findElement(By.cssSelector("span[onclick='r(3)']"));
        WebElement plusSign = driver.findElement(By.xpath("//span[.='+']"));
        WebElement equalSign = driver.findElement(By.xpath("//span[.='=']"));

        five.click();
        plusSign.click();
        Thread.sleep(1234);
        three.click();
        equalSign.click();

        WebElement actualResult = driver.findElement(By.xpath("//div[@id='sciOutPut']"));

        System.out.println(five.getText() + " + " + three.getText() + " =" + actualResult.getText());

        String resultValue = actualResult.getText();
        //remove right and left spaces
        resultValue = resultValue.trim();
        // convert from String to int
        int actualResult1 = Integer.parseInt(resultValue);

        if (actualResult1 == expectedResult){
            System.out.println("Pass: calculation match");
        }
        else System.out.println("FAIL");

        driver.quit();
    }
}
