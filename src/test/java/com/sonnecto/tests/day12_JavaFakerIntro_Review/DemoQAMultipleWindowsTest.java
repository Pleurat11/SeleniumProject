package com.sonnecto.tests.day12_JavaFakerIntro_Review;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DemoQAMultipleWindowsTest {
    WebDriver driver;
    String url = "https://demoqa.com/browser-windows";

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Quitting driver...");driver.quit();
    }

    /**
     Click on new window button
     Switch to a new window
     Locate and print the message
     Close the opened window
     Go back to main window
     */
    @Test
    public void newWindowTest() throws InterruptedException {
        WebElement newWindow = driver.findElement(By.cssSelector("#windowButton"));
        newWindow.click();

        Thread.sleep(2000);
        String parentWindowHandle = driver.getWindowHandle(); // store main window handle
        Set<String> windowHandles = driver.getWindowHandles();


        for (String each : windowHandles) {
            if (!each.equalsIgnoreCase(parentWindowHandle)) {
                driver.switchTo().window(each);
            }
        }
        WebElement header = driver.findElement(By.cssSelector("#sampleHeading"));
        System.out.println("header = " + header.getText());
        Thread.sleep(2000);
        
        driver.close(); // closes current window
        
        // go back to parent window
        driver.switchTo().window(parentWindowHandle);
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    /*
    # -> is ID in css Selector.
    #windowButton -> means look for element that has ID = "windowButton".

    .-> is CLASSNAME in cssSelector.
    .className -> means look for element that has class name = "classname".
     */
    /**
     driver.close() -> closes the current active window.
     driver.quit() -> closes all windows.
     */
}
