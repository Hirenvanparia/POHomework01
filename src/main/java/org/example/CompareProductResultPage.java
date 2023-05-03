package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.EmailAFriendResultPage.expectedEmailFriendMsg;

public class CompareProductResultPage extends Utils{
    static String expectedCompareItemMsg = "You have no items to compare.";

    public void verifyUserCompareProductSuccessfully(){
        // print first product name
        String actualMessage1 = getTextFromElement(By.linkText("HTC One M8 Android L 5.0 Lollipop"));
        System.out.println("First Product:" + actualMessage1);
        // print second product name
        String actualMessage2 = getTextFromElement(By.linkText("$25 Virtual Gift Card"));
        System.out.println("Second Product:" + actualMessage2);
        // print compare massage
        String compareMessage = getTextFromElement(By.xpath("//div[@class=\"page-body\"]"));
        System.out.println("My Message:" + compareMessage);
        Assert.assertEquals(compareMessage, expectedCompareItemMsg, "products comparison");
    }
    }





