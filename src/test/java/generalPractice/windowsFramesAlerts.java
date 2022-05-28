package generalPractice;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.ConfigurationReader;
import com.sonnecto.utils.Driver;
import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class windowsFramesAlerts extends TestBase {
    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();

        driver.get(ConfigurationReader.getProperty("framesCydeo"));
    }
    @Test
    public void windowsPractice(){

        WebElement clickHere = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();

        String mainWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String each : allWindows) {
            if (driver.getWindowHandle().equals(mainWindow)){
                driver.switchTo().window(each);
            }
        }
        WebElement newWindowText = driver.findElement(By.xpath("//h3[.='New Window']"));
        System.out.println("newWindowText = " + newWindowText.getText());

        //switch back to main window
        driver.switchTo().window(mainWindow);
    }
    @Test
    public void alertsTest(){
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(result.getText());



    }
    @Test
    public void jsConfirmTest(){
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());

    }
    @Test
    public void framesTest(){
        driver.findElement(By.xpath("//a[@href='/iframe']")).click();
       driver.switchTo().frame("mce_0_ifr");
       WebElement result = driver.findElement(By.id("tinymce"));

        System.out.println(result.getText());

        driver.switchTo().parentFrame();
    }
    @Test
    public void nestedFrames(){
        driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();

        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.xpath("(//frame)[2]")).getText());


    }

}
