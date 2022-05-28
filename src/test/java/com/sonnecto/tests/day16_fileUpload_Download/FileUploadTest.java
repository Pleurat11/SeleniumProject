package com.sonnecto.tests.day16_fileUpload_Download;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

    @Test
    public void uploadFileTest(){
        driver.get(ConfigurationReader.getProperty("uploadCydeo"));
        WebElement upload = driver.findElement(By.id("file-upload"));

        upload.sendKeys(System.getProperty("user.home") + "/Downloads/some-file.txt");

        driver.findElement(By.id("file-submit")).click();

        /**
            Verify file is uploaded. Check file name is displayed on page.
         */
    }
}
