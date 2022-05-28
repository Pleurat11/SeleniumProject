package com.sonnecto.tests.day19_pageObjectModel_actionsPractice;

import com.sonnecto.tests.TestBase;
import com.sonnecto.pages.LibraryLoginPage;
import com.sonnecto.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryLoginPOMTest extends TestBase {
    /*
    How do you use page object classes?
        ->We create object of the java class then use variables and methods.

        Since after login, we landed on a different page, we need a new page object class for this page.
        Let's call the page BookManagementPage.

        Steps to add a page object class:
        1)Add a new class BookManagementPage in pages package.
        2)Add Constructor with PageFactory.initElements(driver, this) method.
        3)Add required WebElements and methods.
        4)Create object of BookManagementPage in the test and use the elements.
     */
    @Test
    public void invalidCredentialsTest(){
        driver.get(ConfigurationReader.getProperty("library.url"));
        //create object of LibraryLoginPage page object class
        LibraryLoginPage loginPage = new LibraryLoginPage();
        //access email WebElement and type the email
        loginPage.emailAddress.sendKeys("invalid_email@gmail.com");
        loginPage.password.sendKeys("invalidPass");
        loginPage.clickSignIn.click();
        System.out.println("Error message = " + loginPage.errorMsg.getText() );

        Assert.assertTrue(loginPage.errorMsg.isDisplayed());
        Assert.assertEquals(loginPage.errorMsg.getText(), "Sorry, Wrong Email or Password");
    }
    @Test
    public void positiveCredentialsTest(){
        driver.get(ConfigurationReader.getProperty("library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();
        loginPage.emailAddress.sendKeys(ConfigurationReader.getProperty("library3.student.email"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("library3.student.password"));
        loginPage.clickSignIn.click();
    }
}
