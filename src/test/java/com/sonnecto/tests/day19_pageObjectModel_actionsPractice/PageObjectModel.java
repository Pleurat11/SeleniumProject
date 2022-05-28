package com.sonnecto.tests.day19_pageObjectModel_actionsPractice;

public class PageObjectModel {
    /*
    POM -> Page Object Model
        It is a design structure/pattern in Selenium automation.

        We create a dedicated Java class for each page in our application.

    Example:
            We are searching for a specific car in Cargurus website.

    Steps: Go to homepage
                         -> select options and click search.
           SearchResultsPage:
                           ->adjust price, see the results etc.
                           ->click on 1 of the vehicles.
           VehicleDetailsPage:
                            ->Features, contact details, ratings etc.

     Selenium code without POM:
        Select model = new Select(driver.findElement(By.id("make")));
        model.selectByVisibleText("Pacifica");

        On next page:
                More code....
        On details page:
                More code....

   Selenium using POM design:
        CarGuruHomePage homepage = new CarGuruHomePage(driver);
        homePage.model.selectByVisibleText("Pacifica");
        homePage.searchBtn.click();

        SearchResultsPage resultsPage = new SearchResultsPage();
        resultsPage.selectCar(3);
===========================================================================================================

        WebElements on the page will be instance variables for the Java Page Object class.

        Actions/steps we do on the page will be Methods for the Java Page Object class.

     */
}
