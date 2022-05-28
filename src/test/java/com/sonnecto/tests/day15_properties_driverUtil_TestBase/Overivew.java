package com.sonnecto.tests.day15_properties_driverUtil_TestBase;

public class Overivew {
    /*
     Properties file in java:
                            Key + Value format data. Similar to Map in data structures.


     Properties file is a very popular file in Java development and automation projects.
     We store important properties/info regarding our app or configuration.

     Let's take an example of URLs that we have been using so far.
     All urls that we used are inside our code assigned to a variable.

     String url = "https://google.com";
     The above approach is called HARD CODING the value.

     Hard Coding:
                 It is keeping data in the source code.
                 Assigning input values into variables in our code.

     What's wrong with that?
        Hard Coding values may cause more work when it comes to re-using values and maintaining data.

     If the value needs to change we need to dig through our code to update everywhere.

In test automation, we store our application test data into a separate file that is outside our code.
Data can be : URLs, credentials, environment settings, browser settings, timeouts etc...

    2 types of properties in Java:
    ->Built in properties
    -> properties that programmers define in configuration.properties file

Built in properties are available in any computer and we read those using System.getProperty("prop.name") command

Ex:
System.out.println(System.getProperty("os.name"));
System.out.println(System.getProperty("user.name"));

Built in properties are built into a system so they are available everywhere in our code.
--------------------------------------------------------------------------------------------------------------

For custom properties, we need to add a new file with extension .properties
then type our data in key=value format.

configuration.properties:
browser=chrome
env=qa
qaUrl=https://qa.vytrack.com
etc.

Then we need to read values from that file using Java.
==============================================================================================================

    System.getProperty("prop_name"); method is used to read built in System properties values.

Where do you store your test data?
    I store my automation test data into different files, like configuration.properties file in key and value format.
    My URLs, credentials, browsers, execution settings etc.. are stored in configuration.properties file.

    I do not Hardcode values into my automation code. I keep data outside the code so that I can easily maintain it
    and use it.


How do you read values from properties file?
    I use values using java programming language and I have written a utility for that.
    As we know properties file is like any other file and we need input stream to it.
    So I open the file using the FileInputStream object.
    Then I load it to a Properties object. -> Properties props = new Properties();
    props.load();

    Then we use getProperty("keyName") method to read values from the file.

    String url = properties.getProperty("url");

==================================================
java.io package -> java Input/ Output package.
java.nio -> java new input/output package

FileInputStream class is used to read files using java.

Scanner class can also be used to read files.

INPUT -> READING FROM FILES.
OUTPUT -> WRITING TO FILES.
====================================================
Since we will be using properties file to store and read values in our automation framework,
we need some utility class to read values more effectively and easily.

ConfigurationReader in utils package
=========================================================================================

utils:
      ConfigurationReader.java -> read values from configuration.properties file
      WebDriverFactory.java -> launch the browser
      BrowserUtils.java -> has Thread.sleep method
      SmartBearUtils.java -> has specific re-usable methods for this application.

      Drivers.java -> similar to WebDriverFactory but more advanced version.
                     It provides ability for all the tests/classes to share same browser.
                     It makes sure there is a Single browser opened and all actions run on same browser.

                     We use Singleton pattern approach to write this class.

   Singleton pattern -> this pattern ensures that there is ONLY ONE object of this class
                        that can be created and all classes share/use that same object.

                        We cannot create multiple objects of a class that uses Singleton Pattern.

   Singleton pattern -> single object/instance throughout the project.

   There are different patterns in java programming in general and some are specific to automation.
   -singleton
   -builder
   -Page Object Model pattern

   ->singleton pattern:

   public class Car {
      private Car(String model, String color){}

      private static Car car;

      public static Car getCar(){
          if(car == null){
             car = new Car("Model 3", "blue")
          }
          return car;
      }
   }

   Features to achieve singleton pattern:

   ->Private constructor -> prevent object creation.
   Car car = new Car(); -> will not compile in other classes because constructor is private.

   -> static variable for the object -> will ensure there is only one copy of the object.
   -> static getter method: this method will check if static variable is null, if it is null
   it will assign an object then return it.

   If it is not null, it means this method was called before and it will return the same object each time.

   If I type same code again, it will keep returning the same object again.
   There is no way to create more than one object/instance of Singleton class.

   In test automation, we use driver class as Singleton so that all tests and page object classes
   share the same webdriver object.

*/

}
