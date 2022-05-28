package generalPractice;

import com.sonnecto.pages.OrvxLoginPage;
import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class orvxDeleteTools extends TestBase {

    @Test
    public void test() {
        driver.get("https://orvx.pw/login");

        OrvxLoginPage loginPage = new OrvxLoginPage();

        loginPage.email.sendKeys("interloudd@gmail.com");

        loginPage.password.sendKeys("pleurati12345");

        BrowserUtils.sleep(1);

        loginPage.SignInBttn.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);


        wait.until(ExpectedConditions.titleContains("Dashboard"));

        driver.findElement(By.xpath("//a[contains(text(),'Seller pane')]")).click();

        driver.findElement(By.xpath("//a[@href='https://orvx.pw/seller/unsold_items']")).click();

        List<WebElement> deleteTools = driver.findElements(By.xpath("//button[@class='btn btn-danger btn-xs']"));


            for (WebElement each : deleteTools) {
                each.click();
                Alert alert = driver.switchTo().alert();
                alert.accept();
            }






    }
}