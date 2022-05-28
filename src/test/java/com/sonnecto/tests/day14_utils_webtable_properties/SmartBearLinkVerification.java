package com.sonnecto.tests.day14_utils_webtable_properties;

import com.github.javafaker.Faker;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.SmartBearUtils;
import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearLinkVerification {
    WebDriver driver;
    String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void smartBearLink(){
        //calling login method from SmartBearUtils
        SmartBearUtils.loginToSmartBear(driver);

        //print count of all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        System.out.println(allLinks.size());
        for (WebElement each : allLinks) {
            System.out.println(each.getText());
        }
    }
    @Test
    public void smartBearOrder(){
        SmartBearUtils.loginToSmartBear(driver);
        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();
        Select product = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        BrowserUtils.sleep(1);
        product.selectByVisibleText("FamilyAlbum");
        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        BrowserUtils.sleep(1);
        quantity.sendKeys("2" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Faker faker = new Faker();
        WebElement name = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        name.sendKeys(faker.name().fullName());

        WebElement street = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        street.sendKeys(faker.address().streetAddress());

        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        city.sendKeys(faker.address().cityName());

        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        state.sendKeys(faker.address().state());

        WebElement zip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zip.sendKeys(faker.address().zipCode().replace("-",""));

        WebElement visa = driver.findElement(By.name("ctl00$MainContent$fmwOrder$cardList"));
        visa.click();

        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.number().digits(7));

        WebElement expireDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expireDate.sendKeys("06/2022");

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

        WebElement result = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/strong"));
        Assert.assertTrue(result.isDisplayed());
        Assert.assertEquals(result.getText(), "New order has been successfully added.");

    }
    @Test
    public void orderVerify(){
        SmartBearUtils.loginToSmartBear(driver);
        SmartBearUtils.printNamesAndCities(driver);
    }
    @Test
    public void verifyOrder(){
        SmartBearUtils.loginToSmartBear(driver);
        driver.findElement(By.xpath("//a[@href='Default.aspx']")).click();

        WebElement susan = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[6]/td[5]"));
        Assert.assertEquals(susan.getText(), "01/05/2010");
    }
}
