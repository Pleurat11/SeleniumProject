package com.sonnecto.tests.day18_actions_pom_intro;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsSendKeysTest extends TestBase {
    /*
        Actions class can also be used to automate keyboard key presses.
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

        sendKeys method is used to send keyboard presses using Keys class.

     How to right click using Selenium?
     -> I can use Actions class and contextClick() method to perform right click.

===============================================================================================
    Difference between perform() vs build().perform() ?
       perform()-> : When using actions class, if we perform 1 action

       build().perform()-> When we chain multiple actions together we use this.
            actions.moveToElement(btn).contectClick(btn).sendKeys.....

    Important notice:
                    The perform() method calls build() method internally,
                    so just perform() should work for multiple actions as well.


     */


    @Test
    public void scrollWithKeysTest(){
        driver.get(ConfigurationReader.getProperty("cydeoBase.url"));
        WebElement cbSchoolLink = driver.findElement(By.linkText("CYDEO"));
        actions.moveToElement(cbSchoolLink).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();
        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Test
    public void rightClickTest(){
        driver.get(ConfigurationReader.getProperty("cydeoBase.url"));
        WebElement ab = driver.findElement(By.linkText("A/B Testing"));

        actions.contextClick(ab).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);

        actions.sendKeys(ab, Keys.ENTER).perform();
    }
}
