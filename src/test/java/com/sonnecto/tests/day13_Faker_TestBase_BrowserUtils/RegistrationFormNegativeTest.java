package com.sonnecto.tests.day13_Faker_TestBase_BrowserUtils;

import com.github.javafaker.Faker;
import com.sonnecto.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationFormNegativeTest extends RegistrationFormTestBase{
    @Test
    public void inalidFirstNameTest(){
        Faker faker = new Faker();

        driver.findElement(By.id("wooden_spoon")).click();

        BrowserUtils.sleep(2);
        WebElement errorMsg = driver.findElement(By.xpath("//small[.='first name is required']"));
        Assert.assertTrue(errorMsg.isDisplayed(), "Error message is not displayed");

        // type numbers and verify "first name can only consist of alphabetical letters" error.
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("1234");
        WebElement errorMsg2 = driver.findElement(By.xpath("//small[.='first name can only consist of alphabetical letters']"));

        Assert.assertTrue(errorMsg2.isDisplayed(), "Error2 is not displayed");

    }
}
