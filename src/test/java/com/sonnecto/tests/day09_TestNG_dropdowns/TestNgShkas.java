package com.sonnecto.tests.day09_TestNG_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;
public class TestNgShkas {
    /*
    TestNG - Test new generation

    Testing framework that helps us write Test Code.
    Test code can be Unit Tests -> Testing java classes, methods etc.
    Test code can be Selenium, API, Database automation code.

    Assertions:
        Normally each test SHOULD have at least one Assertion.
        Assertions are used for verifying if expected result(value/behaviour) is matching actual result.

    There is a class called Assert that comes with TestNG.
    It has many static methods, so we can call them using the class name.
    Or we can do static import.


    Annotations:
                @Test -> is used to make a method an executable Test

                @BeforeClass -> is used to make a method run ONLY ONCE before all the other tests.
                Normally we use this to open the browser, set up implicit wait, maximize etc.

                @BeforeMethod -> method with this annotation runs before EVERY test method.
                IT could also be used to open the browser, go back to homepage etc.
                Set up the browser ready for the next test.

                @AfterMethod -> method with this annotation runs after EVERY test.

                @AfterClass -> Runs ONCE after all the tests.

    By Default TESTS RUN ALPHABETICALLY.
    We can use @Test(priority) to set the order manually.

     */
    @Test(priority = 1) //run first
    public void test1() {
        System.out.println("Running test1");
        int num = 10;
        Assert.assertEquals(10, num);
    }

    @BeforeClass
    public void setUp() {
        System.out.println("@BeforeClass is running");
        System.out.println("=============================================");
    }

    @Test(priority = 2)
    public void test2() // // converts regular method to Test method
    {
        String name = "Bob";
    }

    @BeforeMethod
    public void setUpApp() {
        System.out.println("@BeforeMethod set up application is running");
        System.out.println("Navigating back to url");
        System.out.println("=============================================");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("@AfterMethod teardown is running");
        System.out.println("=============================================");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("@AfterClass cleanup is running");
        System.out.println("=============================================");
    }
}
