package com.sonnecto.tests.day12_JavaFakerIntro_Review;

public class ReviewDay12 {
    /**
    DropDowns in Selenium:
    ->Select Dropdown -> this is built using <select> and <option> tags in html.
    We use Select class to handle select dropdowns.

    ->Sometimes you can come access some elements that look like dropdowns but it is not using select/options tags.
    For those types of dropdowns we cannot use Select class.
    You just directly locate the element and perform wanted action.

    Select dropdowns:
        Syntax:
               Select select = new Select(driver.findElement(By.name("month")));

               WebElement month = driver.findElement(By.name("month"));
               Select select = new Select(month);

     Then to select an option from dropdown we use:
     ->select.selectByVisibleText("December");
     ->select.selectByIndex("12");
     ->select.selectByValue("dec");

     How to know what is currently selected?
     String currentValue = select.getFirstSelectedOption().getText();

     How to read all available options in a select dropdown?
     List<WebElement> options = select.getOptions();

=========================================================================================================================
     Checkbox and Radio:
        We locate them and click on them to check or uncheck.
        WebElement remember = driver.findElement(By.id("rem"));

        Check the checkbox if it is already checked:
        if(remember.isSelected());

=====================================================================================================================
Alerts in Selenium:
        How would you handle alerts using Selenium?

   We use Alert interface to handle alerts using Selenium.
   We switchTo() alert first and then we will be able to accept, dismiss, getText or sendKeys.

   Alert alert = driver.switchTo().alert;
   sout(alert.getText());
   alert.accept();

Sometimes we come across HTML pop-ups, they are not Javascript alerts so we locate them and perform actions normally.

    We can use Alert interface only on Javascript alerts.
    ->Informational alerts -> with a message and just Ok button.
    ->Confirmation alerts -> with a message and Ok/Cancel button.
    ->Prompt Alerts -> message, input fields, OK/cancel buttons.

=========================================================================================================================

How to handle IFrames in Selenium?

    iframes are basically HTML document/code inside HTML code.
    In front-end, they are used for components reusability.

    In order to be able to perform action on a web element inside the iframe,
    we need to first switchTo() it.

    1)Switching using ID or name property. We just pass id/name as a String.
    driver.switchTo().frame("map");

    2)Switching by index. When we have 1 or more iframes we can use index number.
    driver.switchTo().frame(0);

    3)Switching using WebElement. First we locate the iframe using findElement method and one of the 8 locators
    and then switch to it.

    WebElement myIFrame = driver.findElement(By.xpath("//iframe[@class='ws']"));
    driver.switchTo().frame(myIFrame);
    or
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='ws']")));

   --------------
   How to go out from iframe?

   driver.switchTo().defaultContent();

    So when we switch to a frame, webdriver focuses only on the elements inside that iframe.
    So in order to perform actions on elements that are outside, we need to switch back.
   -------------
   How do you handle nested iframes?

   Lets say we need to switch to a child iframe.
   We will need to switch to parent iframe first then to child frame.

   driver.switchTo().frame("child") -> This WILL NOT WORK.!!!

   driver.switchTo().frame("parent").switchTo().frame("child") -> THIS WORKS!!
   ----------------
   To get out from nested frame to main content, we need first to go to parent
   frame and then go to main/default content.

   driver.switchTo().parentFrame();
   driver.switchTo().defaultContent();

==========================================================================================================================

    Handling multiple windows in Selenium.

    Each Tab/Window is considered to be a separate window for Selenium.
    ->If a new window opens when Selenium is running, we need to switchTo() it
    -->to perform actions on the elements in the new window.
    --->Each Window is assigned unique Window handle id. It is a random value
    consisting of numbers and letters.

    So selenium NEEDS window handle ID to be able to switch to a different window.

    Ex:

        String mainWindow = driver.getWindowHandle();
        ->mainWindow variable will have the window handle id of the parent window.
        -->We might need this value if we want to switch back to main window later.

     How to switch to another window?
     driver.getWindowHandles() method is used to get window handles of all opened windows.
     -> it is in the form of Set of Strings.

     Once we have all the window handle ids, we can loop through it.
     Since it is a Set data structure, we cannot use get method with index
     and there is no guarantee the order is as correct.

     Set<String> windowHandles = driver.getWindowHandles();

     for(String each: windowHandles){
        driver.switchTo().window(each);

        if(driver.getTitle().contains("Google")){
        break;
        }
     }

   To go back to parent window, I can use the variable mainWindow we created earlier.


   WHEN YOU JOIN YOUR NEW JOB THAT WILL HAVE A PROJECT, YOU WILL BE ADDED TO GITHUB ENTERPRISE AS A USER
   AND WILL BE PROVIDED WITH REPOSITORY URLS THAT YOU WILL NEED TO WORK WITH.

   YOU NEED TO CLONE THE PROJECT TO YOUR LOCAL MACHINE.
     */
}
