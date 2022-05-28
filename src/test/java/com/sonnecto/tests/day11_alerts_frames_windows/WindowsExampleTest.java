package com.sonnecto.tests.day11_alerts_frames_windows;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsExampleTest {
    /*
    Interview Question: How would you handle multiple windows using selenium?

    ->We can switch to a different window using switchTo().window() method and passing the window handle id.
    Sometimes when we click on a link on the page, it will open a new page/tab.
    ->If you want selenium to focus on a different tab/window, we need to switch to it first.
    Selenium can only focus on a single window/tab of the browser at a time.
    ->Each browser will have a unique windows handle assigned to it, it is a long string with numbers and letters.
    ->For Selenium Windows and Tab are the same.
    ->We can use the unique window handle to switch to a different window.

    String currentWindowHandleID = driver.getWindowHandle();

    currentWindowHandleID will contain handle id of the current window.

    Set -> collection of unique values.

    driver.getWindowHandles() returns Set of Strings.
    Set<String> windows = driver.getWindowHandles();
    then loop through it.


        WHAT IS WINDOW HANDLE?
        It is a randomly generated String ID for each window/tab.
        Every window will have different window handle that is automatically generated.
        We need to use window handle to switch to a different window.

    How do we get Current Window Handle?
    driver.getWindowHandle(); will return the current one as a String.

    How do you find out the count of windows opened in Selenium?
    driver.getWindowHandles(); method that will return window handle for each window, as a set of string values.
    I can get the count of the set and that's how I know the count of windows.
     */
    String url = "http://practice.cydeo.com/windows";
    WebDriver driver;
    String demoQaUrl = "https://demoqa.com/browser-windows";
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void windowsTest(){
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + mainWindowHandle);
        WebElement newWindowLink = driver.findElement(By.linkText("Click Here"));
        for (int i = 0; i <7; i++) {
            newWindowLink.click();
        }
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("windowHandles size = " + windowHandles.size());

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            System.out.println("Current window Title = " + driver.getTitle());
        }
        WebElement h3Element = driver.findElement(By.xpath("//h3"));
        System.out.println("h3Element on the new page = " + h3Element.getText());

        //go back to parent window
        driver.switchTo().window(mainWindowHandle);
        System.out.println("Title after switching to main window = " + driver.getTitle() );
    }
    @Test
    public void demoQAMultipleWindows(){
        driver.get(demoQaUrl);
        WebElement newTab = driver.findElement(By.id("tabButton"));
        WebElement newWindow = driver.findElement(By.id("windowButton"));
        WebElement newWindowText = driver.findElement(By.id("messageWindowButton"));

        newTab.click();
        newWindow.click();
        newWindowText.click();
        System.out.println("mainPage text = " + driver.getTitle());

        // store parent window handle id in a variable
        String parentWindowHandle = driver.getWindowHandle();
        //store all window handles ids to a SET
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("allWindowHandles = " + allWindowHandles.size());

        for (String window : allWindowHandles) {
            System.out.println("Switching to = " + window);
            driver.switchTo().window(window);

        }
    }


}
