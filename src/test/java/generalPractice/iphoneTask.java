package generalPractice;

import com.sonnecto.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class iphoneTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.apple.com/");
        Thread.sleep(1234);

        driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']")).click();

        List<WebElement> links = driver.findElements(By.xpath("//a"));

        String empty = "";
        int counter1 = 0;
        int counter = 0;

        for (WebElement each : links) {
            counter++;
            if (each.getText().equalsIgnoreCase(empty)){
           //     counter++;
            }


            if (!each.isDisplayed()){
                counter1++;
            }

        }
        System.out.println(counter);
//        System.out.println("Links with no text : " + counter);
  //      System.out.println("Not displayed links: " + counter1);


    }
}
