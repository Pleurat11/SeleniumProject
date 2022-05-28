package com.sonnecto.tests.day15_properties_driverUtil_TestBase;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.ConfigurationReader;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TechilisticTask extends TestBase {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("techlistic.Url"));
    }
    @Test
    public void firstTest(){
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
        Assert.assertEquals(tableRows.size(), 4);

        WebElement burjKhalifaHeight = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td[3]"));
        Assert.assertEquals(burjKhalifaHeight.getText(), "829m");

        //Both find the same element
        WebElement total = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//td[contains(text(),'buildings')]"));
        WebElement total2 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td"));
    }

}
