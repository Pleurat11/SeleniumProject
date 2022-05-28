package generalPractice;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.ConfigurationReader;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class fireFoxOrvx extends TestBase {
    @Test
    public void testtt(){

        driver.get("https://orvx.pw");



        driver.findElement(By.xpath("")).sendKeys("lapiho5121@nuesond.com");
    }

}
