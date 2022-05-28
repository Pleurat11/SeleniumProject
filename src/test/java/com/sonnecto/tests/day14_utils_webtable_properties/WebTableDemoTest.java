package com.sonnecto.tests.day14_utils_webtable_properties;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
/*
/.. -> go to parent
/following-sibling:: -> go to next sibling(s)
/preceding-sibling:: -> go to previous sibling
 */

public class WebTableDemoTest {
    WebDriver driver;
    String url = "https://practice.cydeo.com/tables";
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void readFromTablesTest(){
        //Print table data as a single String, not so common but useful sometimes.
        WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println("Table 1 text = " + table1.getText());
        Assert.assertTrue(table1.getText().contains("tconway@earthlink.net"), "IT does not contain");

        // print all column names
        WebElement columnNames = driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println(columnNames.getText());

        WebElement first = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"));
        System.out.println("first row first column = " + first.getText());

        System.out.println("================================================");
        List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        for (WebElement each : allColumns) {
            System.out.println("This is all the columns: "+ each.getText());
        }
        String xpathStr = "//table[@id='table1']/tbody/tr[1]/td[1]";
        WebElement firstRowCell = driver.findElement(By.xpath(xpathStr));
        System.out.println("firstRowCell = " + firstRowCell.getText());

        System.out.println("col 1, row 4 = " + getCellData(1,4) );

    }
    @Test
    public void getAllColumnData(){
        //print all names
        //print all emails
        List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
        List<WebElement> emails = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));

        for (int i=0; i<names.size(); i++){
            System.out.println(i + " - " + names.get(i).getText() + " " + emails.get(i).getText());
        }
    }
    @Test
    public void nestedLoopPrintAllTableData(){
        //get rows count and assign to rowsCount variable.
        int rowsCount = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
        System.out.println("rowsCount = " + rowsCount);

        for (int r = 1; r <rowsCount; r++) {
            for (int c = 1; c <=6; c++) {
             //String value = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+ r + "]/td["+c+"]")).getText();
                String value = getCellData(r,c);

                System.out.println("value = " + value);


            }
        }
    }

    @Test
    public void nestedLoop(){
        int km = 10;
        int steps = 0;
        for (int i = 0; i <km; i++) {
            for (int j = steps; j <km; j++) {
                System.out.println("steps = " +j+ "|| kms = " +i);
            }
        }
    }

    @Test
    public void readNeighborCell() throws InterruptedException {
        // next sibling
        // //table[@id='table1']//td[.='John']/following-sibling::td

        // previous sibling
        // //table[@id='table1']//td[.='John']/preceding-sibling::td

        // choose a sibling from the parent
        // //table[@id='table1']//td[.='Doe']/../td[4]


        WebElement johnEmail = driver.findElement(By.xpath("//table[@id='table1']//td[.='John']/following-sibling::td[1]"));
        System.out.println("John's email = " + johnEmail.getText());

        WebElement johnsLAstName = driver.findElement(By.xpath("//table[@id='table1']//td[.='John']/preceding-sibling::td"));
        System.out.println("John's last name = " + johnsLAstName.getText());

        WebElement deleteJohn = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[6]/a[@class='cell']"));
        Thread.sleep(2345);
        deleteJohn.click();




    }
    public String getCellData(int row, int col){
        String xpathStr = "//table[@id='table1']/tbody/tr["+row+"]/td["+col+"]";
        return driver.findElement(By.xpath(xpathStr)).getText();
    }

}
