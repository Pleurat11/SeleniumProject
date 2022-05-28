package generalPractice;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class disccc {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://discord.com/");

        driver.findElement(By.linkText("Login")).click();

        Thread.sleep(2000);
        WebElement login = driver.findElement(By.name("email"));
        login.click();
        login.sendKeys("pleuratbajrami1@gmail.com");

        WebElement pass = driver.findElement(By.name("password"));
        pass.click();
        pass.sendKeys("pleurati123" + Keys.ENTER);


    }
}
