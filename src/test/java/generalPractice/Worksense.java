package generalPractice;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Worksense {
    WebDriver driver;
    String url = "https://dashboard.worksense.cloud/workspace";

    @BeforeMethod
    public void setUp() throws InterruptedException{
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        WebElement workspaceName =  driver.findElement(By.id("workspaceName"));
        workspaceName.click();
        Thread.sleep(1000);
        workspaceName.sendKeys("sonnecto" + Keys.ENTER);
        WebElement email = driver.findElement(By.id("Username"));
        email.click();
        Thread.sleep(1000);
        email.sendKeys("edisonbajrami@sonnecto.net");
        WebElement password = driver.findElement(By.id("Password"));
        password.click();
        Thread.sleep(1000);
        password.sendKeys("Sonnecto@1" + Keys.ENTER);

        driver.findElement(By.xpath("//button[@class='MuiButtonBase-root-103 MuiIconButton-root-154 w-64 h-64 mr-4 ml-4']")).click();

        WebElement timeTracking = driver.findElement(By.xpath("//a[@class='MuiButtonBase-root-450 MuiListItem-root-439 list-item worksenseClassMui489 worksenseClassMui491 MuiListItem-gutters-446 MuiListItem-button-447']"));
        Thread.sleep(1000);
        timeTracking.click();
    }
    //@Test
    //public void STOP(){
      //  WebElement stop = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root worksenseClassMui680 MuiButton-contained worksenseClassMui673'])[2]"));
        //stop.click();
    //}
    @Test
    public void BREAK() throws InterruptedException {
        WebElement breakk = driver.findElement(By.xpath("//button[@title='Break']"));
        Thread.sleep(3000);
        breakk.click();
    }


}
