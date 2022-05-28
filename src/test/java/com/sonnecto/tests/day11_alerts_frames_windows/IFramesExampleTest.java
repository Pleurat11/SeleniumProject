package com.sonnecto.tests.day11_alerts_frames_windows;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IFramesExampleTest {
    /*
    IFrame -> Inline Frame: Is HTML inside HTML.
              Usually used to build re-usable page components and re-use it in different pages.

              If we change iframe code, it will affect every page that it was used for.
              So it is good for maintainability and reusability.


     When doing automation, if we want to locate an element which is inside the iframe
     then we need to switch to it first, then we can locate the element.

     Lets say I want to click on Google link which is inside iframe.
     If I just use findElement method it will show NoSuchElementException.
     Because link is inside the iframe, we need to go there first then locate the link.


     There are 3 ways we can switch to iframe:
     1)By id -> if there is Id property, we just pass it. driver.switchTo().frame("comments);
     2)By index -> indexes start with 0: driver.switchTo().frame(0) switches to the first frame.
     3)By locating iframe -> driver.switchTo().frame(driver.findElement(By.xpath("")));

     switch out from frame: driver.switchTo().defaultContent();

     INTERVIEW QUESTION:
                        HOW TO HANDLE NESTED FRAMES?
             First I switch to parent frame using one of three ways(name,id,webelement)
             then I switch again to the child frame.
                        HOW DO YOU BACK ONCE YOU ARE IN THE FRAME?
             driver.switchTo().defaultContent();
       if driver is focused on child rame, we switch to parent frame first then to default content
             driver.switchTo().parentFrame(); driver.switchTo().defaultContent();


     */
    String url = "http://practice.cydeo.com/iframe`";
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void iframeTest(){
   //  THIS DOESNT WORK   WebElement commentField = driver.findElement(By.id("tinymce"));
        //switch to the frame by id
        driver.switchTo().frame("mce_0_ifr");
        //now we're focused on the frame
        WebElement commentField = driver.findElement(By.id("tinymce"));
        System.out.println("comment field = " + commentField.getText());
        commentField.clear();
        commentField.sendKeys("hello hello");

        // go out from the iframe back to main content:
        driver.switchTo().defaultContent();

        WebElement Home = driver.findElement(By.linkText("Home"));
       // Home.click();
    }
    @Test
    public void multipleFramesTest(){
        driver.get("http://practice.cydeo.com/nested_frames");
        //find out the count of frames on this page
        List<WebElement> frames = driver.findElements(By.tagName("frame"));
        System.out.println("Only shows the parent frames - - frames size = " + frames.size());

        //switch to bottom frame by name
        driver.switchTo().frame("frame-bottom");
        WebElement bodyElem = driver.findElement(By.tagName("body"));
        System.out.println("Bottom frame text = " + bodyElem.getText());

        // go out from bottom frame
        driver.switchTo().defaultContent();

        // switching from parent frame to child frame using Index
        driver.switchTo().frame(0).switchTo().frame(1);
        WebElement bodyElem1 = driver.findElement(By.tagName("body"));
        System.out.println("Index 0 frame text = " + bodyElem1.getText());
        //go back to parent frame
        driver.switchTo().parentFrame();
        // go back to default content
        driver.switchTo().defaultContent();

        driver.switchTo().frame(0).
                switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_right']")));
        bodyElem = driver.findElement(By.tagName("body"));
        System.out.println("Third way = " + bodyElem.getText());
    }
}
