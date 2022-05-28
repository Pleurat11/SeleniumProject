package com.sonnecto.tests.day10_dropdown_alerts_iframes_windows;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class AmazonDepartmentNamesListTest {
    WebDriver driver;
    String url  = "https://amazon.com";

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void amazonDepartmentTest(){
        String expTitle = "Amazon.com. Spend less. Smile more.";
        assertEquals(driver.getTitle(), expTitle);

        //assert that ALL option is selected by default
        Select departments = new Select(driver.findElement(By.id("searchDropdownBox")));
        String selectedOption = departments.getFirstSelectedOption().getText();
        assertEquals(selectedOption, "All Departments");

        List<WebElement> allDepartments = departments.getOptions();
        int countOfDepartments = allDepartments.size();
        for (WebElement each : allDepartments) {
            System.out.println(each.getText());
        }
        assertTrue(countOfDepartments > 10, "You are an aasshole");

        //Assert Exceptions(Errors) cannot be handled by try & catch block.
        // Since it's an error, we cannot handle by trying to handle the exception.
        // Syntax:
        //try{
        //"piece of code"
        // }catch(Throwable t);

        // If there is the keyword multiple after Select, it means we can select multiple options at the same time.


    }
    @Test(enabled = false) // SKIP THIS TEST
    public void testDemo(){
        System.out.println("test demo runninng");
    }
}
