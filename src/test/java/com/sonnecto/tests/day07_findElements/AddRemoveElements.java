package com.sonnecto.tests.day07_findElements;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick = 'addElement()']"));

        for (int i = 1; i <=50; i++) {
            addElement.click();
        }

        List<WebElement> deleteButtons = driver.findElements(By.xpath("//button[.='Delete']"));

        Thread.sleep(1234);

        /*if (deleteButtons.size() == 50){
            System.out.println("Pass: 50 buttons");
        }
        else System.out.println("Fail: Invalid nr of buttons");
*/

        deleteButtons.forEach(deleteButton -> deleteButton.click());

        deleteButtons = driver.findElements(By.xpath("//button[.='Delete']"));

        Thread.sleep(1111);

        if (deleteButtons.size() == 0){
            System.out.println("Pass : All 50 buttons deleted");
        }
        else {
            System.out.println("Fail : Could not delete all 50 buttons");
        }
    }
}
