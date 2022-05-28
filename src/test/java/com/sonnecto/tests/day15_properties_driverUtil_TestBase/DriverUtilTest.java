package com.sonnecto.tests.day15_properties_driverUtil_TestBase;

import com.sonnecto.utils.Driver;
import org.testng.annotations.Test;

public class DriverUtilTest {
    @Test
    public void driverClassTest(){
        Driver.getDriver().get("https://google.com");



    }
}
