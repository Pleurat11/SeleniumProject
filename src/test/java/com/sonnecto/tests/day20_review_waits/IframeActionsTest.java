package com.sonnecto.tests.day20_review_waits;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class IframeActionsTest extends TestBase {
    @Test
    public void test(){
        driver.get(ConfigurationReader.getProperty("doubleclick.url"));

        //let's switch to iframe
        driver.switchTo().frame("iframeResult");

        WebElement textForDoubleClick = driver.findElement(By.id("demo"));

        BrowserUtils.sleep(1); //Static wait

        actions.doubleClick(textForDoubleClick).perform();
        BrowserUtils.sleep(1);

        //Assert: Text's "style" attribute contains "red"
        String expectedStyle = "red";
        String actualStyle = textForDoubleClick.getAttribute("style");
        assertTrue(actualStyle.contains(expectedStyle));

    }


}
