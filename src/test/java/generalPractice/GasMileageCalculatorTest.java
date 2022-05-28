package generalPractice;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class GasMileageCalculatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://calculator.net");

        WebElement searchBox = driver.findElement(By.name("calcSearchTerm"));
        searchBox.sendKeys("gas mileage" + Keys.ENTER);

        Thread.sleep(1234);
        WebElement link = driver.findElement(By.xpath("//div[@id='calcSearchOut']//div//a"));
        link.click();

        String expectedTitle = "Gas Mileage Calculator";
        WebElement actualTitle = driver.findElement(By.xpath("//h1"));

        if (expectedTitle.equalsIgnoreCase(actualTitle.getText())){
            System.out.println("First Test Passed");
        }
        else System.out.println("Failed");

        Thread.sleep(1234);
        WebElement metricUnit = driver.findElement(By.linkText("Metric Units"));
        metricUnit.click();

        Thread.sleep(700);

        WebElement firstOne = driver.findElement(By.name("mucodreading"));
        firstOne.clear();
        firstOne.click();
        firstOne.sendKeys("7925");
        Thread.sleep(700);
        WebElement secondOne = driver.findElement(By.name("mupodreading"));
        secondOne.clear();
        secondOne.click();
        secondOne.sendKeys("7550");
        Thread.sleep(700);
        WebElement thirdOne = driver.findElement(By.name("mugasputin"));
        thirdOne.clear();
        thirdOne.click();
        thirdOne.sendKeys("16");
        Thread.sleep(700);
        WebElement lastOne = driver.findElement(By.name("mugasprice"));
        lastOne.clear();
        lastOne.click();
        lastOne.sendKeys("1.25" + Keys.ENTER);


        WebElement result = driver.findElement(By.xpath("//span[@class='bigtext']"));

        System.out.println(result.getText());

        String expectedResult = "(55.13 mpg)";
        if (expectedResult.equalsIgnoreCase(result.getText())){
            System.out.println("TEST HAS PASSED");
        }
        else System.out.println("You shall not pass");

    }
}
