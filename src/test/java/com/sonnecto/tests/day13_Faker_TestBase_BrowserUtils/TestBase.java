package com.sonnecto.tests.day13_Faker_TestBase_BrowserUtils;

public class TestBase {
    /**
     In many automation frameworks, you will often find a class which is a Base class/ parent class for all the tests.
     Normally that class will have @BeforeMethod/@AfterMethod and maybe some actions that are useful for all the tests.

     A test class will extend the TestBase class. So we only need to write @Test methods in Test class.
     RegistrationFormTestBase:
        ->@BeforeMethod
        ->@AfterMethod

     RegistrationForm extends RegistrationFormTestBase:
        ->@Test
        ->@Test

     RegistrationFormNegativeTest extends RegistrationFormTestBase:
        ->@Test
        ->@Test


     */

}
