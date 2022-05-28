package generalPractice;

import com.google.common.base.Verify;
import com.sonnecto.pages.OrvxCpanelPage;
import com.sonnecto.pages.OrvxLoginPage;
import com.sonnecto.pages.OrvxMainPage;
import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class orvxChecker extends TestBase {
    @Test
    public void checkAll(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://google.com");

        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("Vpn extension chrome" + Keys.ENTER);
        driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
        driver.findElement(By.xpath("(//div[@class='a-na-d-K-A-w'])[1]")).click();


        BrowserUtils.sleep(25);



        driver.get("https://orvx.pw/login");

        OrvxLoginPage loginPage = new OrvxLoginPage();

        loginPage.email.sendKeys("lapiho5121@nuesond.com");

        loginPage.password.sendKeys("pleurati123");

        BrowserUtils.sleep(1);

        loginPage.SignInBttn.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);


        wait.until(ExpectedConditions.titleContains("Dashboard"));

        OrvxMainPage mainPage = new OrvxMainPage();
        mainPage.hostsSection.click();
        BrowserUtils.sleep(1);
        mainPage.cpanelSection.click();

        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.titleIs("ORVX SHOP - CPANEL"));

        BrowserUtils.sleep(2);

        WebElement selecttwo = driver.findElement(By.xpath("(//select[@class='select2 form-control select2-hidden-accessible'])[6]"));
        Select select= new Select(selecttwo);
        select.selectByVisibleText("Seller 43");


        BrowserUtils.sleep(1);

        driver.findElement(By.id("searchb")).click();

        BrowserUtils.sleep(3);

        List<WebElement> check = driver.findElements(By.xpath("//div[@class='badge badge-pill badge-glow  badge-primary badge-md mr-1 mb-1']"));

        for (WebElement each: check) {
            each.click();
            BrowserUtils.sleep(5);
        }

    }
}
