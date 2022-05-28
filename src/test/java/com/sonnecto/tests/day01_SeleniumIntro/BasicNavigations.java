package com.sonnecto.tests.day01_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) {

        // 1) setup the browser driver
        WebDriverManager.chromedriver().setup();

        // open browser
        WebDriver driver = new ChromeDriver();

        // navigate to tesla homepage
        driver.get("https://www.tesla.com");

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e ){
            e.printStackTrace();
        }

        driver.navigate().refresh();

        /*
        Navigation methods:
                           get();
                           navigate();
         */
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e ){
            e.printStackTrace();
        }
        driver.navigate().to("https://www.sonnecto.com");

        // getTitle : reads and prints the title of the page we're browsing on.
        System.out.println(driver.getTitle());

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e ){
            e.printStackTrace();
        }

        // close the browser
        // close() or quit()
        driver.quit();

        // reads the current URL of the page we're browsing on.
        driver.getCurrentUrl();

        //navigate().to() vs driver.get()

        // driver.get() waits for the page to finish loading before going to the next step

        //driver.navigate().to() does not wait for the page to finish loading before going to the next step
    }
}
