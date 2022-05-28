package generalPractice;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class xletToChecker extends TestBase {
    @Test
    public void testCheck(){
        Driver.getDriver().get("https://xlet.to/login");
        Driver.getDriver().findElement(By.name("username")).sendKeys("strongseller");
        Driver.getDriver().findElement(By.name("password")).sendKeys("pleurati123");
        BrowserUtils.sleep(20);
        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        Driver.getDriver().findElement(By.xpath("(//a[@class='dropdown-toggle'])[6]")).click();

        Driver.getDriver().findElement(By.xpath("//a[@href='https://xlet.to/user/tickets']")).click();

        Driver.getDriver().findElement(By.xpath("//a[@href='https://xlet.to/user/ticket-create']")).click();

        Driver.getDriver().findElement(By.name("title")).sendKeys("MAKE ME A SELLER");

        Driver.getDriver().findElement(By.id("summernote4")).sendKeys("Make me a seller please sir, I will add tools daily");

        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        for (int i = 0; i <50; i++) {
            BrowserUtils.sleep(6);

            Driver.getDriver().findElement(By.xpath("(//a[@class='dropdown-toggle'])[6]")).click();

            Driver.getDriver().findElement(By.xpath("//a[@href='https://xlet.to/user/tickets']")).click();

            Driver.getDriver().findElement(By.xpath("//a[@href='https://xlet.to/user/ticket-create']")).click();

            Driver.getDriver().findElement(By.name("title")).sendKeys("MAKE ME A SELLER");

            Driver.getDriver().findElement(By.id("summernote4")).sendKeys("Make me a seller please sir, I will add tools daily");

            Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']")).click();

            BrowserUtils.sleep(2);
        }


    }
}
