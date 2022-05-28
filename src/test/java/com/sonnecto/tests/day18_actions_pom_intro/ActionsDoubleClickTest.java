package com.sonnecto.tests.day18_actions_pom_intro;

import com.sonnecto.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsDoubleClickTest extends TestBase {

    /*
    How to drag and drop using Selenium?
        I use actions class and dragAndDrop method for that.
             It accepts 2 elements, drag first element and drop to second element.
     */
    @Test
    public void doubleClickForColorChange(){
        driver.get("https://w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));

        WebElement colorChange = driver.findElement(By.xpath("//p[@id='demo']"));
        actions.doubleClick(colorChange).perform();

        driver.switchTo().parentFrame();
    }
    @Test
    public void ActionsDragAndDropTest(){
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement amount = driver.findElement(By.linkText("5000"));
        WebElement dropTo = driver.findElement(By.id("amt7"));

        actions.dragAndDrop(amount, dropTo).perform();
    }
}
