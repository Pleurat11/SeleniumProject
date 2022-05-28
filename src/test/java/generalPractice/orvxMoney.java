package generalPractice;

import com.sonnecto.pages.OrvxLoginPage;
import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class orvxMoney extends TestBase {
    @Test
    public void readMoney(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://orvx.pw/login");
        WebDriverWait wait = new WebDriverWait(driver, 15);

        OrvxLoginPage loginPage = new OrvxLoginPage();

        loginPage.email.sendKeys("interloudd@gmail.com");

        loginPage.password.sendKeys("pleurati12345");

        BrowserUtils.sleep(1);

        loginPage.SignInBttn.click();

        wait.until(ExpectedConditions.titleContains("Dashboard"));

        driver.findElement(By.linkText("Seller panel")).click();

        WebElement money = driver.findElement(By.xpath("//span[@class='badge badge-pill badge-danger']"));

        WebElement pending = driver.findElement(By.xpath("//span[@class='badge badge-pill badge-warning']"));

        WebElement reports = driver.findElement(By.xpath("//*[@id=\"MainPage\"]/div/div/div/div[1]/div/div/div/div/div/div[3]/div/div/a[2]"));

        System.out.println("money = " + money.getText());
        System.out.println("pending = " + pending.getText());
        System.out.println("reports = " + reports.getText());

    }


}
