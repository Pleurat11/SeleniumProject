package com.sonnecto.tests.day12_JavaFakerIntro_Review;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {
    /*
    Java Faker -> Library that is used to generate random fake test data.

    Like names, emails, phone nrs and other test data.

    Test data -> is an input value that we need to perform the test on the application.
                 It can be first name, last name, email, citynames, zip codes etc.

    In some projects you will be given the test data to use with your test cases.
    Mostly credentials and URLs.

    In some flows of application, you might need random mock test data to use an inputs.
    We can use Library like JavaFaker for that.
    There are more advanced test data generator libraries as well.


    INTERVIEW QUESTION: HOW DO YOU GET YOUR TEST DATA?
            Depending on the scenario, I get my test data different ways.

            If it is credentials of different roles, I get it from the shared spreadsheet where
            we store all usernames and passwords for different roles of the application.


     */
    @Test
    public void demo(){
        //Create Faker object
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);
        
        String city = faker.address().cityName();
        System.out.println("cityName = " + city);
        
        String chuckNorris = faker.chuckNorris().fact();
        System.out.println("chuckNorris = " + chuckNorris);
        
        String funnyName = faker.funnyName().toString();
        System.out.println("funnyName.toString() = " + funnyName.toString());
    }
}
