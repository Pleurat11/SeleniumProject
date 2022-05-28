package com.sonnecto.tests.day17_JavaScriptExecutioner;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru99UploadTest extends TestBase {
    @Test
    public void uploadTest(){
        driver.get(ConfigurationReader.getProperty("guru99upload.url"));

        //locate elements
        WebElement chooseFile = driver.findElement(By.name("uploadfile_0"));
        WebElement termsCheckbox = driver.findElement(By.id("terms"));
        WebElement submitFile = driver.findElement(By.id("submitbutton"));

        //set file path
        chooseFile.sendKeys(System.getProperty("user.home") + "/Downloads/some-file.txt");
        termsCheckbox.click();
        submitFile.click();

        //verify upload success by checking the message

        BrowserUtils.sleep(2);
        WebElement result= driver.findElement(By.id("res"));
        System.out.println("result = " + result.getText());
        Assert.assertEquals(result.getText(), "1 file\nhas been successfully uploaded.");
    }
}
