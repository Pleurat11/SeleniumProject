package com.sonnecto.tests.day15_properties_driverUtil_TestBase;

import com.sonnecto.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileTest {
    @Test
    public void readValuesFromPropertiesFile() throws IOException {
        //Properties class
        //Comes from Java library

        Properties props = new Properties();

        //open file using FileInputStream -> class in Java that we use to read files.

        FileInputStream fis = new FileInputStream("configuration.properties");

        //load file content into properties object
        props.load(fis);

        System.out.println(props.getProperty("browser"));
        System.out.println(props.getProperty("webtableUrl"));
        System.out.println(props.getProperty("env"));

    }
    @Test
    public void configurationReaderUnitTest(){
        System.out.println(ConfigurationReader.getProperty("browser"));
        String url = ConfigurationReader.getProperty("webtableUrl");
        System.out.println(url);

        Assert.assertEquals(ConfigurationReader.getProperty("browser"), "chrome");
        Assert.assertEquals(ConfigurationReader.getProperty("env"), "qa");
    }
}
