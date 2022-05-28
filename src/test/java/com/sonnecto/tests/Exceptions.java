package com.sonnecto.tests;

public class Exceptions {
    /*
    NoSuchElementException -> No matching element was found for the locator.

    InvalidSelectorException -> Syntax of xpath or cssSelector is wrong, maybe missing [] or something.

    StaleElementReferenceException -> Lets say I locate the element and perform some steps.
    As a result of those steps the page refreshes.
    Then the WebElements that I located before the refresh will ALL BE INVALID. They will be STALE.

    Then we will need to find the elements one more time after each page refreshes.

    NoAlertPresentException: no such alert
    This exception is shown when we try to switch to alert, but the alert is not displayed.



     */
}
