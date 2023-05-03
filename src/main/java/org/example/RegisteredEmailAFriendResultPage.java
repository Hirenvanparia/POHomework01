package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisteredEmailAFriendResultPage extends Utils {

    static String expectedReferAFriend = "Your message has been sent.";
    public void verifyUserShouldBeAbleToReferAFriendSuccessfully (){
        String emailAFriendMsg = getTextFromElement(By.xpath("//div [@class=\"result\"]"));
        System.out.println("My Message" + emailAFriendMsg);
        Assert.assertEquals(emailAFriendMsg, expectedReferAFriend, "Your Message Sent");
    }
}
