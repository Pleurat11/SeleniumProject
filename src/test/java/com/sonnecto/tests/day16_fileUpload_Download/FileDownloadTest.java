package com.sonnecto.tests.day16_fileUpload_Download;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTest extends TestBase {

    @Test
    public void fileDownloadTest(){
        driver.get(ConfigurationReader.getProperty("downloadCydeo"));

        WebElement someFileTxt = driver.findElement(By.partialLinkText("some-file.txt"));
        someFileTxt.click();

        BrowserUtils.sleep(2);

        // Verify that file is downloaded

        //                                C:\Users\inter\     Downloads\some-file.txt
        String filePath = System.getProperty("user.home") //gets the username too
                + "/Downloads/some-file.txt";
        System.out.println(filePath);

        //Build the file object
        File file = new File(filePath);

        while (!file.exists()){
            BrowserUtils.sleep(1);

        }

        System.out.println("File exists = " + file.exists());
        System.out.println("File name = " + file.getName());

        Assert.assertTrue(file.exists());
        //delete after verification complete
        file.delete();

    }

}
