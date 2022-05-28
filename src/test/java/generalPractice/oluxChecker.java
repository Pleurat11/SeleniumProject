package generalPractice;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class oluxChecker extends TestBase {

    @Test
    public void checkAll(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("olux.url"));
        driver.findElement(By.name("username")).sendKeys("interloudd");
        BrowserUtils.sleep(2);
        WebElement password = driver.findElement(By.name("pass"));
        password.click();
        password.sendKeys("pleurati12345" + Keys.ENTER);

        WebElement money = driver.findElement(By.xpath("(//span[@class='balance_user'])[1]"));
        money.click();

        driver.findElement(By.xpath("//a[@href='cpanel.php']")).click();

        BrowserUtils.sleep(1);


























        driver.findElement(By.id("all")).click();

        List<WebElement> all = driver.findElements(By.xpath("//button"));

        for (WebElement each : all) {
            each.click();
        }

    }

}
