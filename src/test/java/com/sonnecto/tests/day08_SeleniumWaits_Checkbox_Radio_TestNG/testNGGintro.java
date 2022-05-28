package com.sonnecto.tests.day08_SeleniumWaits_Checkbox_Radio_TestNG;

import org.testng.annotations.Test;

public class testNGGintro {
        /*
        TestNG is a Unit Testing tool/ framework in Java.

        It is used for unit testing by developers and automation testing by SDETs.

        So far, our automation code was in main method and it would run and just print pass or fail.

        When we start using TestNG, our automation code will actually be a test that Passes or Fails.
                    It does not depend on print statements.

        We create normal Java Class and start using Automations of TestNG.
         */
    @Test
    public void testOne(){
        System.out.println("Hello testing world");
    }
    @Test
    public void testTwo(){
        System.out.println(10/0);
    }
}
