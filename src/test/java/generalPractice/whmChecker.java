package generalPractice;

import com.sonnecto.tests.TestBase;
import com.sonnecto.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class whmChecker extends TestBase {
    @Test
    public void test(){

        whmPage whmPage = new whmPage();
        whmPage.logInWhm("http://flaherty.com.ar:2086/", "flaherty", "89jId6mIyPYp");


        for (WebElement each : whmPage.urlOfCpanels) {
            System.out.println("https://" + each.getText() + ":2083");
        }
        for (WebElement each : whmPage.usernamesOnCpanel) {
            System.out.println(each.getText());
        }



    }
}
