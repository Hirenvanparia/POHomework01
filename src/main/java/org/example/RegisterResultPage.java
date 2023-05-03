package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class RegisterResultPage extends Utils{
    static String expectedRegistrationCompleteMsg = "Your registration completed";

    public void verifyUserRegisteredSuccessfully(){
        // gettext from Web element
        String actualMassage = getTextFromElement(By.xpath("//div [@ class= \"result\"]"));
        System.out.println("My Massage:" + actualMassage);
        Assert.assertEquals(actualMassage, expectedRegistrationCompleteMsg, "registration is not working");


    }
}
