package com.sonnecto.pages;

import org.testng.Assert;

public class EdmundsNewCarPage extends BasePage{
    @Override
    public void isCurrentPage(){
        Assert.assertEquals(driver.getTitle(), "New Cars, Used Cars, Car Reviews and Pricing | Edmunds");
    }
}
