package com.sonnecto.utils;

import com.sonnecto.tests.TestBase;
import org.openqa.selenium.JavascriptExecutor;

public class BrowserUtils extends TestBase {
    /**
     Utility classes are written for repeated steps to call and reuse methods.
     It is good for code re-usability and more readable code.

     BrowserUtils
        static method sleep (int seconds)

     We have been using Thread.sleep very often, so why not make it a reusable utility method,
     and call it whenever we need to pause the code execution.

     */
    public static void sleep(long seconds){
        try {
            Thread.sleep(seconds * 1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void scrollDown(int pixels){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,"+ pixels+")");
    }
}
