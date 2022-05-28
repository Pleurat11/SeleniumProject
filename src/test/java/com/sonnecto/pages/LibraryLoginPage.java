package com.sonnecto.pages;

import com.sonnecto.tests.day09_TestNG_dropdowns.Dropdowns_test;
import com.sonnecto.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    /*
    In POM we simply create a dedicated Java class for all the pages of our application.

    @FindBy(id="inputEmail");

    @FindBy is an annotation in Selenium that replaces findElement() method.
====================================================================================================

    We add new package dedicated for page object classes.

    SeleniumProject:
        ->src.test.java
            ->com.sonnecto
                ->tests
                ->utils
                ->pages

    Benefits of POM design pattern:
        ->Reusability -> we are reusing webelements and methods in page object classes.
        ->Easy to maintain -> if a locator changes for one of the elements, we just go to
                              the page and update there.
        ->Readability -> code is more readable because we have page names and variables
                         or methods names according to each page.
        ->Efficiency -> once you set up page objects and add required elements/methods,
                        adding new tests will become much faster and efficient.
        ->Centralized maintenance of Web Elements. Web elements in page object can serve
                    as shared/central repository of Web Elements for the app
                    so team members can easily collaborate.

        ->It automatically helps to avoid StaleElementException after page refreshes.
            After page refreshes we have to run findElement method one more time,
            so if we use POM it will automatically do that.
=============================================================================================

    When we write page object classes, we always need to add a constructor.
    In the constructor, we add a command to initialize all the elements.
        PageFactory.initElements(Driver.getDriver(), this);

        PageFactory is a class that comes from Selenium library.
            This class is used while implementing POM design pattern.
            It helps with initializing all the WebElements that are added to the class.

       If we do not add PageFactory to our constructor, we will get NullPointerException.
       It has a method called initElements(WebDriver, this)

       It has 2 arguments:
            1-> WebDriver instance/object
            2-> this -> points to this instance of the class

    After adding the constructor with PageFactory command, all webelements are initialized
        and we can use them in our Test classes.


     */
    public LibraryLoginPage(){
        //Selenium command to initialize the elements below.
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "inputEmail")
    public WebElement emailAddress; // email = driver.findElement(By.id("inputEmail"));

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement clickSignIn;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement errorMsg;

}
