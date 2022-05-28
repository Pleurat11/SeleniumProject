package com.sonnecto.tests.day13_Faker_TestBase_BrowserUtils;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RegistrationFormTest extends RegistrationFormTestBase{

    //EVERYTHING IN THE PARENT CLASS GETS RUN FIRST IN INHERITANCE.
    //AFTER PARENT CLASS FINISHES EXECUTING THEN IT'S CHILD CLASS GETS EXECUTED.

    Faker faker = new Faker();
    @Test
    public void formTest(){
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys(faker.name().firstName());

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys(faker.name().lastName());

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(faker.name().username().replace(".",""));

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(faker.internet().password());

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys(faker.phoneNumber().phoneNumber().replace(".","-"));

        List<WebElement> gender = driver.findElements(By.name("gender"));
        gender.get(1).click();

        WebElement birthday = driver.findElement(By.name("birthday"));
        birthday.sendKeys("01/01/1999");

        Select departament = new Select(driver.findElement(By.name("department")));
        departament.selectByVisibleText("MCR");

        Select jobTitle = new Select(driver.findElement(By.name("job_title")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,4));

        WebElement checkBox = driver.findElement(By.xpath("(//label[@class='form-check-label'])[1]"));
        checkBox.click();

        driver.findElement(By.id("wooden_spoon")).click();

        WebElement result = driver.findElement(By.className("alert-heading"));
        System.out.println(result.getText());
        Assert.assertEquals(result.getText(), "Well done!");
    }
}
