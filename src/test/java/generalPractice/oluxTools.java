package generalPractice;

import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.ConfigurationReader;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class oluxTools {

    @Test
    public void myTest() {
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getProperty("olux.url"));
        driver.findElement(By.name("username")).sendKeys("interloudd");
        BrowserUtils.sleep(2);
        WebElement password = driver.findElement(By.name("pass"));
        password.click();
        password.sendKeys("pleurati12345" + Keys.ENTER);

        driver.findElement(By.xpath("//a[@href='seller']")).click();

        driver.findElement(By.xpath("//a[@href='cpanel.php']")).click();

        driver.findElement(By.id("all")).click();


    }
}