package generalPractice;

import com.sonnecto.utils.BrowserUtils;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class whmPage {
    public whmPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath = "(//*[.='List Accounts'])[1]")
    public WebElement listAccounts;

    @FindBy(xpath = "//tbody/tr/td/a[@class]")
    public List<WebElement> urlOfCpanels;

    @FindBy(xpath = "//tr/td[5]")
    public List<WebElement> usernamesOnCpanel;

    @FindBy(xpath = "//td[@class='control-col']")
    public List<WebElement> changePassBttn;

    @FindBy(id = "passwordavantautocom")
    public WebElement changePassField;

    public void changePassOfWhm() {
        listAccounts.click();
        for (int i = 0; i < changePassBttn.size(); i++) {
            changePassBttn.get(i).click();
            changePassField.click();
            BrowserUtils.sleep(1);
            changePassField.sendKeys("cpanel123!@#" + Keys.ENTER);
            BrowserUtils.sleep(5);
            Driver.getDriver().navigate().back();
        }
    }

    public void logInWhm(String url, String username, String pass) {
        Driver.getDriver().get(url);
        userName.sendKeys(username);
        password.sendKeys(pass + Keys.ENTER);
    }

    @FindBy(xpath = "//tr/td[3]")
    List<WebElement> urls;


}
