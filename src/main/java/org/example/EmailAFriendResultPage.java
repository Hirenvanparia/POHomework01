package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.getTextFromElement;

public class EmailAFriendResultPage extends Utils {
    static String expectedEmailFriendMsg = "Only registered customers can use email a friend feature";


    public void verifyUserEmailAFriendSuccessfully(){

    // get text web element
        String emailAFriendMsg = getTextFromElement(By.xpath("//div [@ class = 'message-error validation-summary-errors']"));
        System.out.println("My Massage:" + emailAFriendMsg);
        Assert.assertEquals(emailAFriendMsg, expectedEmailFriendMsg, " Only Registered User Can Email");
}
}
