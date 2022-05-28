package com.sonnecto.tests.day16_fileUpload_Download;

public class Review_Overview {
    /*
    What is properties file?
        Properties file is a file that has extension .properties.
        It is like any other file image.png, notest.txt, resume.docx etc..

        Property is Key=Value format data.
        Key is the name of the property = Value.
        Almost all of the Java projects use properties file to store test data and configuration.
        Credentials, urls, names, browser names.
        It is a standard way of managing test data in external file.

        Instead of hard coding the data in the code, we store in separate configuration.properties file.

----------------------------------------

How to read from properties file?
    We use properties class to read the file.

    First we open the file using FileInputStream object.
    Then load it to properties object.

    Then we can use getProperty("keyName") method to read the values.

    Properties properties = new Properties();
    FileInputStream inputStream = new FileInputStream("configuration.properties");
    properties.load(inputStream);

    String url = properties.getProperty("app.url");
    driver.get(url);

    Since we didn't want to repeat those lines, we added ConfigurationReader.java utility class.
    It opens and loads values from configuration.properties file and we can just call the static
    method getProperty() to read any property value from our file.

==================================================================================================

    Driver utility class:
        ->every time we open a new browser we need to :
            set up browser driver using WebDriverManager class
            Creating ChromeDriver object
            maximizing the browser
            setting implicit wait

    To solve issues and achieve code re-usability, maintainability and ability to easily use webdriver
    object in any class - we added Driver class.

    Driver class is a Singleton class.

    Singleton -> design pattern that ensures that there is only one SINGLE OBJECT available for this class.
                  All classes share same single object that singleton class provides.
                  It is very handy for us because our tests, reusable methods, page object classes
                  can all ACCESS same browser object/instance.

   Driver class has a method called getDriver()

   Driver.getDriver() -> when we type this statement anywhere in our property, this will return SAME
                         WebDriver object.

=========================================================================================================

    TestBase class:
        It is not a utility class.
        It is an abstract parent class for all the test classes.
        It has setUp and tearDown methods with @BeforeMethod and @AfterMethod annotations.
        We store common steps that belong to all tests in this parent class.

        Right now it is only a browser setUp and teardown, but we could add:
            ->some reusable methods that ALL tests need.

        All test classes EXTEND test base class.

==============================================================================================================

    To download a file, we locate the link to the file name or a download icon
    then we verify if file is successfully downloaded to downloads' folder.

    fileDownload.click();

    We need to use File class to be able to check if file exists in the downloads' folder.

    System.getProperty("user.home") --> always returns path to the user home in the system. - "C:/Users/inter"

    File file = new File( System.getProperty( "user.home" ) + "/Downloads/filename.txt");

    Then we can use file manipulation methods that come with the file object.

    We can put assertion to check if file is downloaded successfully:

    Assert.assertTrue(file.exists());
=================================================================================================================

    File upload:
                To upload a file using selenium, we simply locate the input element and
                sendkeys the filePath.
                It will automatically upload the file.

                We do not need to handle file upload window.



         */
}
