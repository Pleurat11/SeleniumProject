package com.sonnecto.tests.day17_JavaScriptExecutioner;

public class Overview_Review {
    /*
    Could you explain what is the better way to store several credentials and work with them?

    Like for one project we have different users. For example, in Vytrack project
    we have store manager, sale manager and truck driver.
    In order to check something with each user should we create a List or Map with
    usernames or something else and then in one TC with loop login and then log out?
    Or should we create separate test cases for each user?

    And could we store data as a List or Map in our configuration.properties file?
    Or we can create a List and assign elements with Configuration.Reader.getProperty?

   ===============================================
   We can store each credential into properties file and read from there when needed.
   manager.userid=manager1
   manager.pwd=managerpwd etc...

   We can store and read using ConfigurationReader.getProperty("manager.userid")
   -------------------------------
   Let's say we have a test that needs to log in with multiple roles to check the same thing.

   In this scenario, we can put each username+password into Excel file or Json file.
   And our test will read credentials from the file and loop/repeat the test for each user.
   -------------------------------

   File upload:
        -When doing file uploads using selenium, we need to:
            ->locate the choose file element.
            ->perform sendKeys(file_path);

        -Choose file element normally will have <input> tag.
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys(System.getProperty("user.home") + "/Desktop/image.jpg");

        Usually there is a button that we need to click after setting the file.


     */
}
