package com.sonnecto.tests.day18_actions_pom_intro;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.ConfigurationReader;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class ActionsDemoTest extends TestBase {
    /*
    Actions class is used for advanced mouse and keyboard actions using Selenium.
    Like double click, hover over an element, right click, drag drop etc..

    When doing test automation, at some steps we will need to perform advanced actions
    to simulate the user.

    How to use Actions class?
        1)Create object of Actions class.
            Actions actions = new Actions(driver);
        2)Call the required method or methods for a particular webelement or in general.

        3)Add perform() or build().perform() at the end.

    Some actions we can do using Actions class:
        Hover over an element-> actions.moveToElement(element).perform();
        Click and hold-> actions.clickAndHold(element).perform();
        Drag and drop-> actions.dragAndDrop().perform();
        Double click -> actions.doubleClick().perform();

    perform(); method needs to be ALWAYS added at the end to perform/run the moveToElement action.
===================================================================================================
    Since we need Actions object in our tests, it's a good idea to add the actions object variable to TestBase class.

    TestBase class is parent class to all the Test classes, so if we declare protected or public
    variables or methods, all child classes can access them easily.


     */
    @Test
    public void hoverElementTest(){
        Actions actions = new Actions(driver);
        driver.get(ConfigurationReader.getProperty("hover.url"));


        WebElement avatarOne = driver.findElement(By.xpath("(//div[@class='figure']/img[@src='/img/avatar-blank.jpg'])[1]"));
        actions.moveToElement(avatarOne).perform();

        BrowserUtils.sleep(2);

        WebElement avatarTwo = driver.findElement(By.xpath("(//div[@class='figure']/img[@src='/img/avatar-blank.jpg'])[2]"));
        actions.moveToElement(avatarTwo).perform();
    }
    @Test
    public void hoverOverGroupElements(){
        driver.get(ConfigurationReader.getProperty("hover.url"));

        List<WebElement> images = driver.findElements(By.tagName("img"));
        for (WebElement image : images) {
            BrowserUtils.sleep(2);
            actions.moveToElement(image).perform();
        }
    }
    @Test
    public void googleFeelingLuckyHoverTest(){
        driver.get(ConfigurationReader.getProperty("google.url"));
        //locate 2 buttons
        WebElement searchBttn = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']"));
        WebElement feelingLuckyBttn = driver.findElement(By.id("gbqfbb"));

        for (int i = 0; i <3; i++) {
            actions.moveToElement(feelingLuckyBttn).perform();
            BrowserUtils.sleep(1);
            actions.moveToElement(searchBttn).perform();
            BrowserUtils.sleep(1);
        }

    }

}
