package com.sonnecto.tests.day15_properties_driverUtil_TestBase;

import org.testng.annotations.Test;

public class SystemPropertiesTest {
    @Test
    public void readingSystemProperties(){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println("User directory = " + System.getProperty("user.dir"));

        System.out.println("Pom xml path = " + System.getProperty("user.dir") + "pom.xml");

        System.out.println("java version = " + System.getProperty("java.version"));
    }
}
