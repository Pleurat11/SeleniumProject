package com.sonnecto.tests.day11_alerts_frames_windows;

import org.openqa.selenium.Alert;

public class Overview {
    /*
    There are 2 types of alerts;
    HTML alerts and JavaScript alerts;
    HTML alert:
                Written using html tags and html language, so nothing special is needed to work with them in Selenium.
                You can locate the popup windows using locators.
                Other elements are not usually blocked. Maybe partially it will block the page elements.


    JavaSript Alert:
                    It is written using javascript language functions. And we need to approach it differently.
                    We use Alert interface in Selenium.

                    1)switch to the alert
                    2)perform the actions: accept(); dismiss(); getText(); sendKeys();

                    Alert alert = driver.switchTo().alert()

  3 types of JavaScript Alerts:
    Informational -> has some text and contains ok button.
    Confirm alert -> has some text and ok button, cancel buttons.
    confirm() -> ok
    dismiss() -> cancel
    getText() -> text of alert


     */

}
