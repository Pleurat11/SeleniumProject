package generalPractice;

import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class whmChangePassword {
    @Test
    public void test() {
        whmPage whmPage = new whmPage();

        BrowserUtils.sleep(5);
        whmPage.logInWhm("https://compurede.com.br:2087", "root", "P{YR*NX{Djo5");

        List<WebElement> plusList = Driver.getDriver().findElements(By.xpath("//img[@border='0']"));

        List<WebElement> passList = Driver.getDriver().findElements(By.xpath("//input[@name='password']"));

        List<WebElement> changeList = Driver.getDriver().findElements(By.xpath("btn btn-primary"));

        for (int i = 0; i <plusList.size(); i++) {
            plusList.get(i).click();
            BrowserUtils.sleep(3);
            passList.get(i).sendKeys("cpanel123!@#");
            BrowserUtils.sleep(3);
            changeList.get(i).click();
            BrowserUtils.sleep(5);
            Driver.getDriver().navigate().back();
        }


    }
}
