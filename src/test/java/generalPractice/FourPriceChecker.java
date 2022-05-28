package generalPractice;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import java.util.List;

public class FourPriceChecker extends TestBase {
    @Test
    public void test() {
        driver.get("https://4price.sk");
        driver.findElement(By.id("email")).sendKeys("pleuratbajrami1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("pleurati123");
        driver.findElement(By.xpath("//button[@class='fxt-btn-fill']")).click();

        driver.findElement(By.id("seller")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Cpanel')]")).click();

        driver.findElement(By.xpath("//a[.='All']")).click();

        List<WebElement> urls = driver.findElements(By.xpath("//tr/td[3]"));
        List<WebElement> usernames = driver.findElements(By.xpath("//tr/td[5]"));
        List<WebElement> passwords = driver.findElements(By.xpath("//tr/td[6]"));





//        for (int i = 0; i < 100; i++) {
//            driver.findElement(By.xpath("//input[@class='check-all']")).click();
//            driver.findElement(By.xpath("(//div//input[@class='btn btn-danger'])[1]")).click();
//            BrowserUtils.sleep(1);
//            driver.findElement(By.xpath("//button[.='Yes, delete it!']")).click();
//            BrowserUtils.sleep(2);
//            driver.findElement(By.xpath("//button[.='OK']")).click();
//            BrowserUtils.sleep(2);
//
//        }

//        WebElement hosts = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(hosts).perform();
//
//        driver.findElement(By.xpath("//a[@data-title='Cpanels']")).click();
//
//        BrowserUtils.sleep(2);
//
////        Select select = new Select(driver.findElement(By.id("Seller")));
////        select.selectByVisibleText("Seller_15920");
////
////        driver.findElement(By.xpath("//button[@class='btn btn-success btn-block ']")).click();
//
//        List<WebElement> checkAll = driver.findElements(By.xpath("//button[@class='btn btn-sm check_up_item btn-primary ']"));
//
//        for (WebElement each : checkAll) {
//            each.click();
//            BrowserUtils.sleep(1);
//        }

        }
    }

